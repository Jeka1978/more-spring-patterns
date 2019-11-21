package com.idi.morespringpatterns.never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evgeny Borisov
 */
@RestController
public class MailSenderController {


    @Autowired
    private MailSender mailSender;

    @PostMapping("/sendmail")
    public String sendMail(@RequestBody MailInfo mailInfo) {
        String mailWhichWasSent = mailSender.sendMail(mailInfo);
        return mailWhichWasSent;
    }
}
