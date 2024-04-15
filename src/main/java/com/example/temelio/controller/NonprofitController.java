package com.example.temelio.controller;
import org.springframework.web.bind.annotation.RestController;
import com.example.temelio.entity.NonProfit;
import com.example.temelio.repository.NonprofitRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/nonprofit")
public class NonprofitController {

    @Autowired
    private NonprofitRepository nonprofitRepository;

    @PostMapping
    public ResponseEntity<NonProfit> createNonprofit(@RequestBody NonProfit nonprofitBody) {
        NonProfit nonProfit = nonprofitRepository.save(nonprofitBody);
        if(nonProfit == null) {
            return new ResponseEntity<>(null, HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(nonProfit, HttpStatus.CREATED);
    }
    
}
