package com.example.temelio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.temelio.entity.Foundation;


public interface FoundationRepository extends JpaRepository<Foundation, Integer> {
    Foundation findByEmail(String email);
}
