package bank;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class SignUp1 extends JFrame implements ActionListener {
    long random;
    JTextField nameTextField,snameTextField,emailTextField,dobTextField,adTextField,cityTextField,stateTextField,pinCodeTextField;
    JButton next,cancel,back;
    JRadioButton male,female,other,married,single;
    JDateChooser dateChooser;
    public SignUp1(){
        setLayout(null);
        ImageIcon a1=new ImageIcon(ClassLoader.getSystemResource("bank/iconic/atm.png"));
            Image a2=a1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
            ImageIcon a3=new ImageIcon(a2);
            JLabel label=new JLabel(a3);
            label.setBounds(70, 10,100,100);
                    add(label);
                    
        Random ran=new Random();
        random =Math.abs((ran.nextLong()%9000L)+1000L);
           JLabel formNo=new JLabel("APPLICATION N0:"+random);
           formNo.setBounds(200,40, 400,40);
           formNo.setFont(new Font("RALEWAY",Font.BOLD, 30));
        add(formNo);
        
        JLabel details=new JLabel("PERSONAL DETAILS");
           details.setBounds(290,80, 400,30);
           details.setFont(new Font("RALEWAY",Font.BOLD, 25));
        add(details);
        
        JLabel name=new JLabel("NAME :");
          name.setBounds(60,190, 140,30);
           name.setFont(new Font("RALEWAY",Font.BOLD,15));
        add(name);
        
         nameTextField= new JTextField();
        nameTextField.setBounds(210,190,250,30);
        nameTextField.setFont(new Font("RALEWAY",Font.ITALIC, 14));
        add(nameTextField);
        
        JLabel sname=new JLabel("SURNAME :");
          sname.setBounds(60,230, 140,30);
           sname.setFont(new Font("RALEWAY",Font.BOLD,15));
        add(sname);
        
        snameTextField= new JTextField();
        snameTextField.setBounds(210, 230, 250,30);
        snameTextField.setFont(new Font("RALEWAY",Font.ITALIC, 14));
        add(snameTextField);
        
        JLabel dob=new JLabel("D.O.B :");
          dob.setBounds(60,270, 140,30);
           dob.setFont(new Font("RALEWAY",Font.BOLD,15));
        add(dob);
        dateChooser=new JDateChooser();
        dateChooser.setBounds(210,270,250,30);
        dateChooser.setForeground(Color.red);
        add(dateChooser);
        
        JLabel email=new JLabel("EMAIL ADDRESS :");
          email.setBounds(60,310, 140,30);
           email.setFont(new Font("RALEWAY",Font.BOLD,15));
        add(email); 
         
        emailTextField= new JTextField();
        emailTextField.setBounds(210, 310,250,30);
        emailTextField.setFont(new Font("RALEWAY",Font.ITALIC, 14));
        add(emailTextField);
        
        
        JLabel gender=new JLabel("GENDER :");
          gender.setBounds(60,350,140,30);
           gender.setFont(new Font("RALEWAY",Font.BOLD,15));
        add(gender);
        male= new JRadioButton("MALE");
        male.setBounds(210,350,70,30);
        add(male);
        female= new JRadioButton("FEMALE");
        female.setBounds(290,350,90,30);
        add(female);
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel mar=new JLabel("MaritalStatus:");
          mar.setBounds(60,390,140,30);
           mar.setFont(new Font("RALEWAY",Font.BOLD,15));
        add(mar);
         married= new JRadioButton("married");
        married.setBounds(210,390,90,30);
        add(married);
         single= new JRadioButton("single");
        single.setBounds(310,390,110,30);
        add(single);
        
        other= new JRadioButton("other");
        other.setBounds(430,390,80,30);
        add(other);
        ButtonGroup maritalgroup=new ButtonGroup();
        maritalgroup.add(married);
       maritalgroup.add(single);
       maritalgroup.add(other);
        
        JLabel add=new JLabel("ADDRESS :");
          add.setBounds(60,430, 140,30);
           add.setFont(new Font("RALEWAY",Font.BOLD,15));
        add(add);
        
        adTextField= new JTextField();
        adTextField.setBounds(210, 430, 250,30);
        adTextField.setFont(new Font("RALEWAY",Font.ITALIC, 14));
        add(adTextField);
        
        JLabel city=new JLabel("CITY");
          city.setBounds(60,470, 140,30);
           city.setFont(new Font("RALEWAY",Font.BOLD,15));
        add(city);
        
        cityTextField= new JTextField();
        cityTextField.setBounds(210,470,250,30);
        cityTextField.setFont(new Font("RALEWAY",Font.ITALIC, 14));
        add(cityTextField);
        
        
        JLabel state=new JLabel("STATE");
          state.setBounds(60,510, 140,30);
          state.setFont(new Font("RALEWAY",Font.BOLD,15));
        add(state);
        
        stateTextField= new JTextField();
        stateTextField.setBounds(210,510,250,30);
        stateTextField.setFont(new Font("RALEWAY",Font.ITALIC, 14));
        add(stateTextField);
        
         
        JLabel pinCode=new JLabel("PIN CODE :");
          pinCode.setBounds(60,550,140,30);
           pinCode.setFont(new Font("RALEWAY",Font.BOLD,15));
        add(pinCode);
        pinCodeTextField= new JTextField();
        pinCodeTextField.setBounds(210,550,250,30);
        pinCodeTextField.setFont(new Font("RALEWAY",Font.ITALIC, 14));
       add(pinCodeTextField);
        next=new JButton("next");
        next.setBackground(Color.black);
        next.setForeground(Color.WHITE);
       next.setFont(new Font("RALEWAY",Font.BOLD, 14));
       next.setBounds(330, 610, 100, 35);
       next.addActionListener(this);
       add(next);
       
       back=new JButton("back");
       back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
       back.setFont(new Font("RALEWAY",Font.BOLD, 14));
       back.setBounds(210, 610, 100, 35);
       back.addActionListener(this);
       add(back);
       
cancel=new JButton("cancel");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.WHITE);
       cancel.setFont(new Font("RALEWAY",Font.BOLD, 14));
      cancel.setBounds(450, 610, 100, 35);
      cancel.addActionListener(this);
       add(cancel);

        getContentPane().setBackground(Color.white );
        setSize(800,600);
        setLocation(300,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      String formNo=""+random;
      String name=nameTextField.getText();
      String sname=snameTextField.getText();
      String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
      String gender=null;
      if(male.isSelected()){
          gender="male";
      }else if(female.isSelected()){
          gender="female";
      }
      String email=emailTextField.getText();
      String mar=null;
      if(married.isSelected()){
          mar="married";
      }else if(single.isSelected()){
          mar="single";
      }else if(other.isSelected()){
          mar="other";
      }
      String ad=adTextField.getText();
      String city=cityTextField.getText();
      String state=stateTextField.getText();
      String pinCode=pinCodeTextField.getText();
      
       if(name.equals("")){
           JOptionPane.showMessageDialog(null, "enter relevant details");
       }
       else {
         setVisible(false);
       }}
    
    public static void main(String args[]) {
       new SignUp1();
            }
   }

