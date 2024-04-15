package com.example.temelio.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.temelio.entity.NonProfit;


public interface NonprofitRepository extends JpaRepository<NonProfit,Integer> {
    NonProfit findByEmail(String email);
    List<NonProfit> findAllByEmailIn(ArrayList<String> email_ids);
}
