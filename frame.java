import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class frame extends JFrame {
    JLabel img;

    public frame() {

        // //pixelobama
        // ImageIcon obamba = new ImageIcon("bin\\pixel_obamba_green.png");
        // JLabel obamaImage = new JLabel(obamba);
        // obamaImage.setBounds(300,600,1152,1024);
        // obamaImage.
        // obamaImage.setVisible(true);

         //textfield
        JTextField textField = new JTextField();
        textField.setVisible(true);
        textField.setEditable(true);
        textField.setBackground(Color.WHITE);
        textField.setForeground(Color.black);
        textField.setEnabled(true);
        textField.setBounds(750,550,150,30);
        
        //textField2
       JPasswordField textField2 = new JPasswordField();
        textField2.setVisible(true);
        textField2.setEditable(true);
        textField2.setBackground(Color.WHITE);
        textField2.setForeground(Color.black);
        textField2.setEnabled(true);
        textField2.setBounds(750,600,150,30);


        //background image
        ImageIcon bank = new ImageIcon("bin\\bank.jpg");
        Image image = bank.getImage();
        Image modifiedImage = image.getScaledInstance(1920, 1080, java.awt.Image.SCALE_SMOOTH);
        bank = new ImageIcon(modifiedImage);
        setContentPane(new JLabel(bank));

        //frame
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
        //JLabel
        JLabel label = new JLabel();
        label.setVisible(true);
        label.setText("Login:");
        label.setBounds(750,525,150,30);
        
        //JLabel
        JLabel label2 = new JLabel();
        label2.setVisible(true);
        label2.setText("password:");
        
        label2.setBounds(750,575,150,30);
        

        // add(obamaImage);
       add(label);
       add(label2);
        add(textField);
        add(textField2);
        add(img);
        

        setLayout(new FlowLayout());

    }

}
