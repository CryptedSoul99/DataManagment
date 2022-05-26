package dateManagment.transaction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transaction extends JFrame implements ActionListener {

    Container container = getContentPane();
    JButton clientButton = new JButton("Nuovo Cliente");
    JButton productButton = new JButton("Nuovo Prodotto");
    JButton homeButton = new JButton("Home");
    JButton reportButton = new JButton("Azzeramento Fiscale");
    JButton logoffButton = new JButton("Logoff");

    //Costruttore
    public Transaction(){
        setLayoutManager();
        setLocationAndSize();
        addComponentToContainer();
        addActionEvent();
        //setColorButton();
    }
    public void setLayoutManager(){
        //Impostazione del layout manager del container a null
        container.setLayout(null);
        container.setBackground(Color.decode("#1A759F"));
    }
    public void setLocationAndSize(){
        //Metodo di impostazione delle componenti
        homeButton.setBounds(50, 700, 180, 100);
        clientButton.setBounds(350, 700, 180, 100);
        productButton.setBounds(650, 700, 180, 100);
        reportButton.setBounds(950, 700, 180, 100);
        logoffButton.setBounds(1250, 700, 180, 100);
    }
    public void addComponentToContainer(){
        container.add(clientButton);
        container.add(productButton);
        container.add(logoffButton);
        container.add(homeButton);
        container.add(reportButton);
    }
    public void addActionEvent(){
        clientButton.addActionListener(this);
        productButton.addActionListener(this);
        logoffButton.addActionListener(this);
        homeButton.addActionListener(this);
        reportButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent event){

    }
}

class TransactionFrame {
    public static void main(String[] a) {
        Transaction frame = new Transaction();
        frame.setTitle("SOLHAIR");
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setResizable(false);
    }
}