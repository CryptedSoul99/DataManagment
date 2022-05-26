package dateManagment.product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Product extends JFrame implements ActionListener {

    Container container = getContentPane();
    JFrame frame = new JFrame();
    JButton clientButton = new JButton("Nuovo Cliente");
    JButton homeButton = new JButton("Home");
    JButton transactionButton = new JButton("Emetti Ricevuta");
    JButton reportButton = new JButton("Azzeramento Fiscale");
    JButton logoffButton = new JButton("Logoff");

    public Product(){
        setLayoutManager();
        setLocationAndSize();
        addComponentToContainer();
        addActionEvent();
    }

    public void setLayoutManager(){
        container.setLayout(null);
        container.setBackground(Color.decode("#1A759F"));
    }
    public void setLocationAndSize(){
        homeButton.setBounds(50, 700, 180, 100);
        clientButton.setBounds(350, 700, 180, 100);
        reportButton.setBounds(650, 700, 180, 100);
        transactionButton.setBounds(950, 700, 180, 100);
        logoffButton.setBounds(1250, 700, 180, 100);
    }
    public void addComponentToContainer(){
        container.add(clientButton);
        container.add(homeButton);
        container.add(logoffButton);
        container.add(transactionButton);
        container.add(reportButton);
    }
    public void addActionEvent(){
        clientButton.addActionListener(this);
        homeButton.addActionListener(this);
        logoffButton.addActionListener(this);
        transactionButton.addActionListener(this);
        reportButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event){

    }
}

class ProductFrame {
    public static void main(String[] a) {
        Product frame = new Product();
        frame.setTitle("SOLHAIR");
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setResizable(false);
    }
}