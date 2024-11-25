package com.example;

public class MailSender {
    public void sendMail(MailInfo mailInfo) {
        mailInfo.getMailStrategy().sendMail(mailInfo.getClient());
    }
}
