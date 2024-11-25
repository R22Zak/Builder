package com.example;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private final List<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() {
        MailSender sender = new MailSender();
        for (MailInfo info : infos) {
            sender.sendMail(info);
        }
        infos.clear(); // Clear the list after sending all mails
    }
}