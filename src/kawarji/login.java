/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kawarji;


import api.mail;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserAdapter;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationEvent;
import edu.esprit.dao.UtilisateurDAO;
import edu.esprit.entite.Utilisateur;
import edu.esprit.presentation.AjouterUtilisateur;
import edu.esprit.presentation.DashboardAdmin;
import edu.esprit.presentation.DashboardUser;
import edu.esprit.presentation.EnregistrerUser;
import edu.esprit.presentation.EnvoiMail;
import java.awt.BorderLayout;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;
import kawarji.SingUp;

/**
 *
 * @author Jaloul1
 */
public class login extends javax.swing.JFrame {
    
    public static String API_KEY = "265051030176477";
public static String SECRET = "b1a545527a0e2a5f95879b9c741667f2";
public static String nom="";
public static String firstRequest = "https://graph.facebook.com/oauth/authorize?"
+ "client_id="
+ API_KEY
+ "&redirect_uri=http://www.facebook.com/connect/login_success.html&"
+ "scope=publish_stream,offline_access,create_event,read_stream,email,user_birthday";

public static String secondRequest="https://graph.facebook.com/oauth/access_token?"
+ "client_id="
+ API_KEY
+ "&redirect_uri=http://www.facebook.com/connect/login_success.html&"
+ "client_secret=" + SECRET + "&code=";

public static String access_token = "";
public static boolean firstRequestDone = false;
public static boolean secondRequestDone = false;

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        
        
        
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXT_Login = new javax.swing.JTextField();
        TXT_MotPass = new javax.swing.JPasswordField();
        ConnecterButtan = new javax.swing.JLabel();
        Enregistrerbuttan = new javax.swing.JLabel();
        fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMaximumSize(new java.awt.Dimension(1366, 700));
        setMinimumSize(new java.awt.Dimension(1366, 700));
        getContentPane().setLayout(null);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fb.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(220, 450, 60, 50);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Password");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 390, 90, 30);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Login");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 340, 80, 30);

        TXT_Login.setToolTipText("");
        TXT_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_LoginActionPerformed(evt);
            }
        });
        getContentPane().add(TXT_Login);
        TXT_Login.setBounds(400, 340, 220, 30);
        getContentPane().add(TXT_MotPass);
        TXT_MotPass.setBounds(400, 390, 220, 30);

        ConnecterButtan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nav/connecter.png"))); // NOI18N
        ConnecterButtan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConnecterButtanMouseClicked(evt);
            }
        });
        getContentPane().add(ConnecterButtan);
        ConnecterButtan.setBounds(430, 430, 160, 50);

        Enregistrerbuttan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nav/enregistrer.png"))); // NOI18N
        Enregistrerbuttan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnregistrerbuttanMouseClicked(evt);
            }
        });
        getContentPane().add(Enregistrerbuttan);
        Enregistrerbuttan.setBounds(430, 480, 160, 50);

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loginf.png"))); // NOI18N
        getContentPane().add(fond);
        fond.setBounds(0, 0, 1370, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXT_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_LoginActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        SwingUtilities.invokeLater(new Runnable() {
@Override
public void run() {
NativeInterface.open();
NativeInterface.initialize();


final JFrame authFrame = new JFrame();
// Create the JWebBrowser and add the WebBrowserAdapter
JPanel webBrowserPanel = new JPanel(new BorderLayout());
final JWebBrowser webBrowser = new JWebBrowser();
webBrowser.navigate(firstRequest);
webBrowser.addWebBrowserListener(new WebBrowserAdapter() {
@Override
public void locationChanged(WebBrowserNavigationEvent e) {
super.locationChanged(e);
// Check if first request was not done
if (!firstRequestDone) {
// Check if you left the location and were redirected to the next 
// location
if (e.getNewResourceLocation().contains("http://www.facebook.com/connect/login_success.html?code")){
// If it successfully redirects you, get the verification code
// and go for a second request
String[] splits = e.getNewResourceLocation().split("=");
String stage2temp = secondRequest + splits[1];
System.out.println("First ="+splits[1]);
webBrowser.navigate(stage2temp);
firstRequestDone = true;
}

} else {
// If secondRequest is not done yet, you perform this and get the 
// access_token
if (!secondRequestDone) {
authFrame.setVisible(false);
System.out.println(webBrowser.getHTMLContent());
// Create reader with the html content
StringReader readerSTR = new StringReader(webBrowser.getHTMLContent());
// Create a callback for html parser
HTMLEditorKit.ParserCallback callback = 
new HTMLEditorKit.ParserCallback() {
@Override
public void handleText(char[] data,int pos) {
System.out.println(data);
// because there is only one line with the access_token 
// in the html content you can parse it.
String string = new String(data);
String[] temp1 = string.split("&");
String[] temp2 = temp1[0].split("=");
System.out.println("access tocken="+temp2);
access_token = temp2[1];
new GraphReaderExample(access_token).runEverything();
JOptionPane.showMessageDialog(rootPane, "Bienvenue sur FunKoora "+nom);
DashboardUser client =new DashboardUser();
client.setVisible(true);
login.this.setVisible(false);

}
};
try {
// Call the parse method 
new ParserDelegator().parse(readerSTR,callback,false);
} catch (IOException e1) {
e1.printStackTrace();
}
// After everything is done, you can dispose the jframe
//authFrame.dispose(); 
}
}
}
});
webBrowserPanel.add(webBrowser,BorderLayout.CENTER);
authFrame.add(webBrowserPanel);
authFrame.setSize(400, 500);
authFrame.setVisible(true);
}



});

        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ConnecterButtanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConnecterButtanMouseClicked
        // TODO add your handling code here:
         String login = TXT_Login.getText();
       String pass =new String( TXT_MotPass.getPassword());
       
       
       Utilisateur u = new Utilisateur();
       UtilisateurDAO dao = new UtilisateurDAO();
       //u = dao.checkUser(login, pass);
       u = dao.checklogin(login);
       System.out.println(u.getRole());
       
        if (u.getRole()==null) {
            this.setVisible(false);
            new AjouterUtilisateur().setVisible(true);
        } else {
            if (u.getPassword().equals(pass)) {
                
                if (u.getRole().equals("Admin") ){
                    this.setVisible(false);
                    new DashboardAdmin().setVisible(true);
                } else if (u.getRole().equals("User") ){
                    this.setVisible(false);
                    new DashboardUser(u).setVisible(true);
                } 
                
            } else {
                mail env = new mail(u); 
                env.envoyerMail();
                System.out.println("Un mail a été envoyer :)");
                JOptionPane.showMessageDialog(this, "Votre mot de pass est éroné \nUn Mail a été envoyer ");
            }
                        
        }
        
    }//GEN-LAST:event_ConnecterButtanMouseClicked

    private void EnregistrerbuttanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnregistrerbuttanMouseClicked
        // TODO add your handling code here:
            //this.setVisible(false);
            new EnregistrerUser().setVisible(true);
    }//GEN-LAST:event_EnregistrerbuttanMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConnecterButtan;
    private javax.swing.JLabel Enregistrerbuttan;
    private javax.swing.JTextField TXT_Login;
    private javax.swing.JPasswordField TXT_MotPass;
    private javax.swing.JLabel fond;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

  
}
