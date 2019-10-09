package com.example.workshop.services;

import org.springframework.mail.SimpleMailMessage;

import com.example.workshop.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);	
}
