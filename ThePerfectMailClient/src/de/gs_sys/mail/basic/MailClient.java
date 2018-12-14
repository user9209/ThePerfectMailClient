package de.gs_sys.mail.basic;

import java.util.HashMap;

public class MailClient {

    // hash -> file
    HashMap<String,Attchment> attachments;

    // messageID -> mail
    HashMap<String,Mail> mails;

}
