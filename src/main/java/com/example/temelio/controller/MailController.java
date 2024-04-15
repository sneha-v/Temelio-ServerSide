package com.example.temelio.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.temelio.entity.Foundation;
import com.example.temelio.entity.Mail;
import com.example.temelio.entity.NonProfit;
import com.example.temelio.repository.MailRespository;
import com.example.temelio.repository.FoundationRepository;
import com.example.temelio.repository.NonprofitRepository;
import com.example.temelio.requestType.MailRequestType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("api/mail")
public class MailController {
    @Autowired
    private FoundationRepository foundationRepository;

    @Autowired
    private NonprofitRepository nonprofitRepository;

    @Autowired
    private MailRespository mailRepository;

    @PostMapping
    public ResponseEntity<String> sendMail(@RequestBody MailRequestType body) {
        Foundation foundation = foundationRepository.findByEmail(body.getFoundation_id());
        List<NonProfit> nonprofits = nonprofitRepository.findAllByEmailIn(body.getEmail_ids());
        for (NonProfit nonProfit : nonprofits) {
            Mail mail = new Mail(foundation, nonProfit);
            mail = mailRepository.save(mail);
        }
        return new ResponseEntity<>("Mail Sent", HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Mail>> getAllMails() {
        return new ResponseEntity<>(mailRepository.findAll(), HttpStatus.OK);
    }  
    

}
