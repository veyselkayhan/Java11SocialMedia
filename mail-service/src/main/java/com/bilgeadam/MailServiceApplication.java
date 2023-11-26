package com.bilgeadam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication

public class MailServiceApplication {


//    private final JavaMailSender javaMailSender;
//
//
//    public MailServiceApplication(JavaMailSender javaMailSender) {
//        this.javaMailSender = javaMailSender;
//
//    }
//
//
//    @EventListener(ApplicationReadyEvent.class)
//    public void sendMail() {
//        SimpleMailMessage mailMessage = new SimpleMailMessage();
//        mailMessage.setFrom("${java11mailusername}");
//        mailMessage.setTo("veyselkayhan17@gmail.com");
//        mailMessage.setSubject("SOCIAL MEDİA APP ACTIVATION CODE");
//        mailMessage.setText("SALAMLAR");
//        javaMailSender.send(mailMessage);
//    }

    public static void main(String[] args) {
        SpringApplication.run(MailServiceApplication.class);
    }
}