package dateManagment.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Client extends JFrame implements ActionListener {

    Container container = getContentPane();
    JButton homeButton = new JButton("Home");
    JButton productButton = new JButton("Nuovo Prodotto");
    JButton transactionButton = new JButton("Emetti Ricevuta");
    JButton reportButton = new JButton("Azzeramento Fiscale");
    JButton logoffButton = new JButton("Logoff");

    //Costruttore
    public Client(){
        setLayoutManager();
        setLocationAndSize();
        addComponentToContainer();
        addActionEvent();
    }

    public void setLayoutManager(){
        container.setLayout(null);
    }
    public void setLocationAndSize(){
        homeButton.setBounds(50, 700, 180, 100);
        productButton.setBounds(350, 700, 180, 100);
        transactionButton.setBounds(650, 700, 180, 100);
        reportButton.setBounds(950, 700, 180, 100);
        logoffButton.setBounds(1250, 700, 180, 100);
    }
    public void addComponentToContainer(){
        container.add(homeButton);
        container.add(productButton);
        container.add(logoffButton);
        container.add(transactionButton);
        container.add(reportButton);
    }
    public void addActionEvent(){
        homeButton.addActionListener(this);
        productButton.addActionListener(this);
        logoffButton.addActionListener(this);
        transactionButton.addActionListener(this);
        reportButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event){

    }

}

class ClienFrame{
    public static void main(String[] a){
        Client frame = new Client();
        frame.setTitle("SOLHAIR");
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setResizable(false);
    }
}