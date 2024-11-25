package com.example;

public class MailInfo {
    private final Client client;
    private final MailStrategy mailStrategy;

    public MailInfo(Client client, MailStrategy mailStrategy) {
        this.client = client;
        this.mailStrategy = mailStrategy;
    }

    public Client getClient() {
        return client;
    }

    public MailStrategy getMailStrategy() {
        return mailStrategy;
    }

    @Override
    public String toString() {
        return "MailInfo{client=" + client + ", mailStrategy=" + mailStrategy.getClass().getSimpleName() + '}';
    }
}