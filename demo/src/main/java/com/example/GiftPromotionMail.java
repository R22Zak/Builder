package com.example;

public class GiftPromotionMail implements MailStrategy {
    @Override
    public void sendMail(Client client) {
        System.out.println("Sending Gift Promotion to " + client.getName());
    }
}
