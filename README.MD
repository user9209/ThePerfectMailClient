# The Perfect Mail Client

 https://github.com/user9209/ThePerfectMailClient



### Considerations

Should the local view syncroniezed to the server?
Move mails only local or also on the server?

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
  - mail lists / groups
- Localy remove any encryption and separate signatures
- Keep original content on server or backup
- check hash if server version has changed
- log any changes (move/delete/edit mail)
- autosync all messages on any server encrypted (use Archiv-Key?)
  - All mails on google, telekom and yahoo as backup
- Upload attachments to server and replace them with links
  - the bill will uploaded automaticly and in the mail a link it insert
  - The link contains the cipherkey
- Auto-Download-Link attachment:https://... or in the x-header

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



### Releated work

- Problems with Thunderbird:
  - Crashes sometimes
  - enigmail has some problems
    - sending uncrypted mails if key is untrusted
    - set up key in the addressbook would be easier
    - asks for private key password or do not encrypt private key
    - should ask witch key is trusted at import
    - does not support local alias only (assign key for aa@bb.cc also to aa@dd.ee)
  - No mail export
  - No decryption for all mails, only if fiewing them it decrypts that mail



### Functions

- download IMAP
- upload imap
- send mail
- import key
- export key
- import settings
- export settings
- import mails
- export mails
- upload key (keyserver)
- download key (keyserver)
- generate key
- auto attachment upload (nextcloud, dropbox,...)
- sync addressbook
- import addresses
- export addresses
- full text search
- filter mails (move to folders)
- search mails
- conversations / view history (list of message ids)

