package Code;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Email implements Serializable {

    public static  ArrayList<Email>Emails = new ArrayList<Email>();
    FileManager Fm = new FileManager();
    private final String EmailFile = "Emails.bin";

    String ToMail = "";
    String CcMail = "";
    String Subject = "";
    String EmailBody ="";

    static Properties mailServerProperties;
    static Session getMailSession;
    static MimeMessage generateMailMessage;

    public Email(String Tomail,String CcMail,String Subject ,String EmailBody){
        this.CcMail = CcMail;
        this.EmailBody = EmailBody;
        this.Subject = Subject;
        this.ToMail =Tomail;

    }

    public void generateAndSendEmail() throws AddressException,MessagingException{
        // step 1 sitting email
        System.out.println("Setup Mail Server Properties....\n");
        mailServerProperties = System.getProperties();
        mailServerProperties.put("mail.smtp.port","587");
        mailServerProperties.put("mail.smtp.auth","true");
        mailServerProperties.put("mail.smtp.starttls.enable","true");

        // step 2 get mail session

        getMailSession = Session.getDefaultInstance(mailServerProperties,null);

        generateMailMessage = new MimeMessage(getMailSession);
        generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(ToMail));
        if (!CcMail.equals(null)) {
            generateMailMessage.addRecipient(Message.RecipientType.CC,new InternetAddress(CcMail));
        }
        generateMailMessage.setSubject(Subject);
        String emailBody = EmailBody + "<br><br> Regards, <br>Eng. Tamer AbdElaziz";
        generateMailMessage.setContent(EmailBody,"text/html");


        System.out.println("Mail Session has been created successfully..");

        // step 3 sendding Email

        Transport transport = getMailSession.getTransport("smtp");

        transport.connect("smtp.gmail.com","vehicle.renting.system@gmail.com","symmKMfcih");
        transport.sendMessage(generateMailMessage,generateMailMessage.getAllRecipients());
        transport.close();

        loadFileData();
        Emails.add(this);
        appendFileData();


    }
    public String getTo() {
        return ToMail;
    }

    public String getCc() {
        return CcMail;
    }

    public String getSubject() {
        return Subject;
    }

    public String getBody() {
        return EmailBody;
    }


    public void loadFileData(){
        if(Fm.ReadFromFile(EmailFile) != null){
            Emails = (ArrayList<Email>) Fm.ReadFromFile(EmailFile);
        }
    }

    public boolean appendFileData(){
        return  Fm.WriteToFile(Emails,EmailFile);
    }

}
