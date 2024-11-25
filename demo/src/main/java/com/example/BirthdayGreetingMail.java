package com.example;

public class BirthdayGreetingMail implements MailStrategy {
    @Override
    public void sendMail(Client client) {
        System.out.println("Sending Birthday Greeting to " + client.getName());
    }
}