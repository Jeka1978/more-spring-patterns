package com.idi.morespringpatterns.never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Service
public class MailSender {


    @Autowired
    private Map<Integer, MailGenerator> map;


    public String sendMail(MailInfo mailInfo) {
        int mailCode = mailInfo.getMailCode();
        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new UnsupportedOperationException(mailCode + " not supported yet");
        }
        String mail = mailGenerator.generateMail(mailInfo);
        send(mail);
        return mail;
    }

    private void send(String mail) {
        System.out.println("mail = " + mail + " was sent...");
    }
}








