# The Perfect Mail Client

 https://github.com/user9209/ThePerfectMailClient





## Requirements

- Split Mails in content and attachments
- Store attachments separately identified by there SHA3-256 hash
  - No duplicate attachments even on differnet accounts
  - Content can be hold in the memory as attachments on the hdd
- Support for OpenPGP encryption
- Support for SMIME encryption
- Regex-Filter for Spam
  - Drop all mails not containing a valid destination address
  - Dropping all mails there the sending server is not the source provider (mx)
    - Check the DNS records
- API for adding new mail addresses
- Export settings in human readable format
- addressbook with online sync (carddav)
  - Also link GPG- and SMIME-Keys here
  - Check for existing cipher keys

No informations about the client or the sender.



## List

- OpenPGP
- SMIME
- Attachments
  - AntiVirus
  - Upload to Server by creating a Link
- Spam-Filter
- Adressbook
  - E-Mail
  - Keys
  - Name
- Export
  - settings
  - keys
  - mails
  - attachments
  - backup
- Show mail source code
- drop invalid mail headers
- for windows and linux
- imap, pop and smtp
- no information leaks about user and client
- localy encrypted data (AES)
- keys without password but securely stored localy