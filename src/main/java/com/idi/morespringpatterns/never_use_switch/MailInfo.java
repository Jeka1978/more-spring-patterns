package com.idi.morespringpatterns.never_use_switch;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.beans.ConstructorProperties;

/**
 * @author Evgeny Borisov
 */
public class MailInfo {

    public MailInfo() {
    }

    public MailInfo(int mailCode) {
        this.mailCode = mailCode;
    }



    public int getMailCode() {
        return mailCode;
    }

    public void setMailCode(int mailCode) {
        this.mailCode = mailCode;
    }

    private int mailCode;
}
