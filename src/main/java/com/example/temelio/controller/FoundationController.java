package com.example.temelio.controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.temelio.entity.Foundation;
import com.example.temelio.repository.FoundationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/foundation")
public class FoundationController {
    
    @Autowired
    private FoundationRepository foundationRepository;

    @PostMapping
    public ResponseEntity<Foundation> createFoundation(@RequestBody Foundation foundationBody) {
        Foundation foundation = foundationRepository.save(foundationBody);
        if(foundation == null) {
            return new ResponseEntity<>(null, HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(foundation, HttpStatus.CREATED);
    }    
}
