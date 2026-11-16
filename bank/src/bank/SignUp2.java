package bank;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SignUp2 extends JFrame implements ActionListener{
    
    
    JTextField panTextField;
    JButton nextButton;
    JRadioButton seniorYes, seniorNo, existingYes, existingNo;
    JComboBox<String> religionCombo, categoryCombo, incomeCombo, qualificationCombo, occupationCombo;

    public SignUp2() {
      
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(280, 30, 400, 30);
        add(additionalDetails);

    
        JLabel religionLabel = new JLabel("Religion:");
        religionLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        religionLabel.setBounds(100, 100, 100, 30);
        add(religionLabel);

        String[] religions = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religionCombo = new JComboBox<>(religions);
        religionCombo.setBackground(Color.WHITE);
        religionCombo.setBounds(350, 100, 400, 30);
        add(religionCombo);
        
        JLabel categoryLabel = new JLabel("Category:");
        categoryLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        categoryLabel.setBounds(100, 150, 100, 30);
        add(categoryLabel);

        String[] categories = {"General", "OBC", "SC", "ST", "Other"};
        categoryCombo = new JComboBox<>(categories);
        categoryCombo.setBackground(Color.WHITE);
        categoryCombo.setBounds(350, 150, 400, 30);
        add(categoryCombo);

        JLabel incomeLabel = new JLabel("Income:");
        incomeLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        incomeLabel.setBounds(100, 200, 100, 30);
        add(incomeLabel);

        String[] incomeCategories = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        incomeCombo = new JComboBox<>(incomeCategories);
        incomeCombo.setBackground(Color.WHITE);
        incomeCombo.setBounds(350, 200, 400, 30);
        add(incomeCombo);

        // --- 4. EDUCATIONAL QUALIFICATION ---
        JLabel educationalLabel = new JLabel("Educational");
        educationalLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        educationalLabel.setBounds(100, 250, 150, 30);
        add(educationalLabel);

        JLabel qualificationLabel = new JLabel("Qualification:");
        qualificationLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        qualificationLabel.setBounds(100, 275, 150, 30);
        add(qualificationLabel);

        String[] qualifications = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Others"};
        qualificationCombo = new JComboBox<>(qualifications);
        qualificationCombo.setBackground(Color.WHITE);
        qualificationCombo.setBounds(350, 260, 400, 30);
        add(qualificationCombo);

        // --- 5. OCCUPATION ---
        JLabel occupationLabel = new JLabel("Occupation:");
        occupationLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        occupationLabel.setBounds(100, 330, 150, 30);
        add(occupationLabel);

        String[] occupations = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
        occupationCombo = new JComboBox<>(occupations);
        occupationCombo.setBackground(Color.WHITE);
        occupationCombo.setBounds(350, 330, 400, 30);
        add(occupationCombo);

     
     JLabel seniorLabel = new JLabel("Senior Citizen:");
        seniorLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        seniorLabel.setBounds(100, 490, 150, 30);
        add(seniorLabel);

        seniorYes = new JRadioButton("Yes");
        seniorYes.setBackground(Color.WHITE);
        seniorYes.setFont(new Font("Raleway", Font.BOLD, 14));
        seniorYes.setBounds(350, 490, 100, 30);
        add(seniorYes);

        seniorNo = new JRadioButton("No");
        seniorNo.setBackground(Color.WHITE);
        seniorNo.setFont(new Font("Raleway", Font.BOLD, 14));
        seniorNo.setBounds(480, 490, 100, 30);
        add(seniorNo);

        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(seniorYes);
        seniorGroup.add(seniorNo);

        JLabel existingLabel = new JLabel("Existing Account:");
        existingLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        existingLabel.setBounds(100, 540, 180, 30);
        add(existingLabel);

        existingYes = new JRadioButton("Yes");
        existingYes.setBackground(Color.WHITE);
        existingYes.setFont(new Font("Raleway", Font.BOLD, 14));
        existingYes.setBounds(350, 540, 100, 30);
        add(existingYes);

        existingNo = new JRadioButton("No");
        existingNo.setBackground(Color.WHITE);
        existingNo.setFont(new Font("Raleway", Font.BOLD, 14));
        existingNo.setBounds(480, 540, 100, 30);
        add(existingNo);

        ButtonGroup existingGroup = new ButtonGroup();
        existingGroup.add(existingYes);
        existingGroup.add(existingNo);

       
        nextButton = new JButton("Next");
        nextButton.setBackground(Color.BLACK);
        nextButton.setForeground(Color.WHITE);
        nextButton.setFont(new Font("Raleway", Font.BOLD, 14));
        nextButton.setBounds(620, 660, 80, 30);
        add(nextButton);

        
        setSize(850, 750);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignUp2();
    }
}