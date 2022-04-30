package com.example.course.services;

import org.springframework.mail.SimpleMailMessage;

import com.example.course.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
