package bank;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.event.*;
public class Bank extends JFrame implements ActionListener{
    JTextField cardTextField;
    JPasswordField pinTextField;
JButton login,clear,create;
    public Bank() {
        setTitle("AUTOMATED VENDOR MACHINE");
        setLayout(null);
      java.net.URL url = getClass().getResource("/bank/iconic/atms.png");

ImageIcon ur1 = new ImageIcon(url);

Image ur2 = ur1.getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT);

ImageIcon ur3 = new ImageIcon(ur2);

JLabel label = new JLabel(ur3);
label.setBounds(30, 40,100, 150);
add(label);

JLabel text=new JLabel("WELCOME TO ATM");
text.setFont(new Font("Oswald", Font.BOLD, 30));
text.setBounds(200,40,400,40);
add(text);

JLabel cardno=new JLabel("CARD no.");
cardno.setFont(new Font("Raleway", Font.BOLD, 30));
cardno.setBounds(150,150,150,30);
add(cardno);
cardTextField=new JTextField();
cardTextField.setBounds(320, 150, 300,30);
add (cardTextField);
JLabel pin=new JLabel("PIN");
pin.setFont(new Font("Raleway", Font.BOLD, 30));
pin.setBounds(150,210,150,30);
add(pin);
pinTextField=new JPasswordField ();
pinTextField.setBounds(400,220, 230,40);
add(pinTextField);
login=new JButton("SIGN IN");
    login.setBackground(Color.GREEN);
    login.setForeground(Color.white);
login.setBounds(320,280,145,35);
login.addActionListener(this);
add (login);
clear=new JButton("CLEAR");
    clear.setBackground(Color.GREEN);
    clear.setForeground(Color.white);
    
clear.setBounds(475,280,145,35);
clear.addActionListener(this);
add (clear);
 create=new JButton("SIGN UP");
    create.setBackground(Color.GREEN);
    create.setForeground(Color.white);
create.setBounds(320,330,300,35);
create.addActionListener(this);
add (create);

getContentPane().setBackground(Color.BLUE);

        setSize(800,1000);
        setLocation(100,200); 
        setVisible(true);
    }  

    @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }else if(ae.getSource()== clear){
        }else if(ae.getSource()==create){
            new SignUp1();
            setVisible(false);
        }
    }
      public static void main(String[] args) {
          new Bank();
    }
    
}
