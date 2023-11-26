package com.bilgeadam.service;

import com.bilgeadam.rabbitmq.model.RegisterMailModel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service

public class MailSenderService {
    private final JavaMailSender javaMailSender;
    @Autowired
    public MailSenderService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }




    public void sendMail(RegisterMailModel model){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("${java11mailusername}");
        mailMessage.setTo(model.getEmail());
        mailMessage.setSubject("SOCİAL MEDİA APP ACTIVATION CODE");
        mailMessage.setText("Kullanıcı "+model.getUsername()+"Hesap Doğrulama Kodu: "+model.getActivationCode());
        javaMailSender.send(mailMessage);
    }


}
