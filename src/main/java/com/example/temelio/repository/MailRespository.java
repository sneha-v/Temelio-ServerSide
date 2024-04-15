package com.example.temelio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.temelio.entity.Mail;


public interface MailRespository extends JpaRepository<Mail, Integer> {
}
