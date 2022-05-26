package dateManagment.homePage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame implements ActionListener {

    Container container = getContentPane();
    JButton clientButton = new JButton("Nuovo Cliente");
    JButton productButton = new JButton("Nuovo Prodotto");
    JButton transactionButton = new JButton("Emetti Ricevuta");
    JButton reportButton = new JButton("Azzeramento Fiscale");
    JButton logoffButton = new JButton("Logoff");

    //Costruttore
    public HomePage(){
        setLayoutManager();
        setLocationAndSize();
        addComponentToContainer();
        addActionEvent();
        setColorButton();
    }

    public void setLayoutManager(){
        //Impostazione del layout manager del container a null
        container.setLayout(null);
        container.setBackground(Color.decode("#1A759F"));
    }
    public void setLocationAndSize(){
        //Metodo di impostazione delle componenti
        clientButton.setBounds(50, 700, 180, 100);
        productButton.setBounds(350, 700, 180, 100);
        reportButton.setBounds(650, 700, 180, 100);
        transactionButton.setBounds(950, 700, 180, 100);
        logoffButton.setBounds(1250, 700, 180, 100);
    }
    public void addComponentToContainer(){
        container.add(clientButton);
        container.add(productButton);
        container.add(logoffButton);
        container.add(transactionButton);
        container.add(reportButton);
    }
    public void addActionEvent(){
        clientButton.addActionListener(this);
        productButton.addActionListener(this);
        logoffButton.addActionListener(this);
        transactionButton.addActionListener(this);
        reportButton.addActionListener(this);

    }
    //TO CONTINUE AND IMPLEMENT ON EVERY PANEL!
    public void setColorButton(){
        clientButton.setBackground(Color.decode("#34A0A4"));
        clientButton.setForeground(Color.decode("#D9ED92"));
    }

    @Override
    public void actionPerformed(ActionEvent event){

    }
}

class Home{
    public static void main(String[] a){
        HomePage frame = new HomePage();
        frame.setTitle("SOLHAIR");
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setResizable(false);
    }
}