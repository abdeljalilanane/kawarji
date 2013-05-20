/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

/**
 *
 * @author slimkhan
 */

import edu.esprit.entite.Utilisateur;
import java.io.*; 
import java.util.*; 
import javax.mail.*; 
import javax.mail.internet.*; 



public class mail { 
    
    static Utilisateur u = new Utilisateur();
    protected String message_dest ; 
    /* Objet du message. */ 
    protected String message_objet = "Récupération Mot de Pass "; 
    /** Destinataire du message en copie (CC). */ 
    protected String message_cc = "slim.ksouri@esprit.tn"; 
    /** Texte du message. */ 
    protected String message_corps ;
    /** Objet session de JavaMail. */ 
    protected Session session; 
    /** Objet message de JavaMail. */ 
    protected Message mesg; 

    public mail(Utilisateur u) {
        this.u = u;
        
        message_dest = u.getMail();
        message_corps = 
    "Bienvenu "+u.getNom()+" "+u.getPrenom()+
    "/n/n" + 
    "Votre Login est : "+u.getUserName()+"\net votre mot de pass est :"+u.getPassword(); 

        
    }
 
/** Destinataire du message. */ 

 
 
public void envoyerMail() { 
 
// Nous devons passer les informations au serveur de messagerie sous 
// forme de propriétés car JavaMail en comporte beaucoup... 
Properties props = new Properties(); 
 
// Votre réseau doit donner au serveur SMTP local le nom "nom_du_serveur_smtp" 
 
props.put("mail.smtp.host", "smtp.topnet.tn" ); 
 
// Créer lobjet Session. 
session = Session.getDefaultInstance(props, null); 
session.setDebug(true); //activer le mode verbeux ! 
 
try { 
// Créer un message. 
mesg = new MimeMessage(session); 
 
// Adresse From - Indiquer la provenance du message 
mesg.setFrom(new InternetAddress("abbjalil.anane@esprit.tn" )); 
 
// Adresse TO. 
InternetAddress toAddress = new InternetAddress(message_dest); 
mesg.addRecipient(Message.RecipientType.TO, toAddress); 
 
// Adresse CC. 
InternetAddress ccAddress = new InternetAddress(message_cc); 
mesg.addRecipient(Message.RecipientType.CC, ccAddress); 
 
// Objet. 
mesg.setSubject(message_objet); 
 
// Corps du message. 
mesg.setText(message_corps); 
 
// Enfin, envoyer le message ! 
Transport.send(mesg); 
 
} catch (MessagingException ex) { 
while ((ex = (MessagingException)ex.getNextException()) != null) { 
ex.printStackTrace(); 
} 
} 
} 
/** Programme principal*/ 
/*public static void main(String[] av) { 
mail env = new mail(); 
env.envoyerMail(); 
} */
} 