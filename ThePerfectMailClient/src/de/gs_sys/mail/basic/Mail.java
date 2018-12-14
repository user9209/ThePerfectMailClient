package de.gs_sys.mail.basic;

import java.util.ArrayList;

public class Mail {

    String subject;
    String textContent;
    String from;
    String to;
    String answerTo;
    String totalHeader;
    String timestamp;
    String signatureOpenPGP;
    String signatureSMIME;
    String serverList;
    String usedClient;
    String messageID;
    boolean isSinged;
    boolean isEncrypted;
    boolean useSMIME;


    ArrayList<String> fingerprintsEncryptionOpenGPG;
    ArrayList<String> fingerprintsSignatureOpenGPG;
    ArrayList<String> fingerprintsEncryptionSMIME;
    ArrayList<String> fingerprintsSignatureSMIME;

    ArrayList<String> attachmendIdentifiers;



}
