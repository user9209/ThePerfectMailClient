package de.gs_sys.mail.basic;

import java.util.ArrayList;

public class MailAccount {

    String smtpServer;
    String imapServer;
    String pop3Server;

    boolean useIMAP = true;

    // for login to the server
    Credentials credentials;

    // sending mail addresses incl. names and keys
    ArrayList<Identity> identities;

    String backupLocation;


}
