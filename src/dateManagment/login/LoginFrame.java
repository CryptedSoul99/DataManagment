package dateManagment.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel userLabel = new JLabel("Username");
    JLabel passwordLabel = new JLabel("Password");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JCheckBox showPassword = new JCheckBox("Show password");

    //Costruttore
    public LoginFrame(){
        //Chiamata dei metodi
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }

    public void setLayoutManager(){
        //Impostazione del layout manager del container a null
        container.setLayout(null);
    }
    public void setLocationAndSize(){
        //Impostazione delle misure dei componenti
        userLabel.setBounds(50,75,100,30);
        userTextField.setBounds(150,75,150,30);
        passwordLabel.setBounds(50,110,100,30);
        passwordField.setBounds(150,110,150,30);
        showPassword.setBounds(150,135, 150, 30);
        resetButton.setBounds(200,170,100,30);
        loginButton.setBounds(50,170,100,30);
    }
    public void addComponentsToContainer(){

        //Aggiunta ogni componente al container
        container.add(userLabel);
        container.add(userTextField);
        container.add(passwordLabel);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(loginButton);
        container.add(resetButton);
    }
    public void addActionEvent(){

        //aggiunta dell'action listner ai componenti
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent event) {

        //Codice bottone login
        if (event.getSource() == loginButton){
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equalsIgnoreCase("Cambiare") && pwdText.equalsIgnoreCase("cambiare")){
                JOptionPane.showMessageDialog(this, "Login effettuato con successo!");
            }else {
                JOptionPane.showMessageDialog(this, "Username o password errati!");
            }
        }
        //Codice bottone reset
        if (event.getSource() == resetButton){
            userTextField.setText("");
            passwordField.setText("");
        }
        //Codice checkbox show password
        if (event.getSource() == showPassword){
            if (showPassword.isSelected()){
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
        }
    }
}

class Login{
    public static void main(String[] a){
        LoginFrame frame = new LoginFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(10,10,370,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}