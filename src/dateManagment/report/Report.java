package dateManagment.report;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Report extends JFrame implements ActionListener {

    Container container = getContentPane();
    JButton clientButton = new JButton("Nuovo Cliente");
    JButton productButton = new JButton("Nuovo Prodotto");
    JButton transactionButton = new JButton("Emetti Ricevuta");
    JButton homeButton = new JButton("Home");
    JButton logoffButton = new JButton("Logoff");

    public Report() {
        setLayoutManager();
        setLocationAndSize();
        addComponentToContainer();
        addActionEvent();
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
        transactionButton.setBounds(950, 700, 180, 100);
        logoffButton.setBounds(1250, 700, 180, 100);
    }
    public void addComponentToContainer(){
        container.add(clientButton);
        container.add(productButton);
        container.add(logoffButton);
        container.add(transactionButton);
        container.add(homeButton);
    }
    public void addActionEvent(){
        homeButton.addActionListener(this);
        clientButton.addActionListener(this);
        productButton.addActionListener(this);
        transactionButton.addActionListener(this);
        logoffButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event){

    }
}

class ReportFrame {
    public static void main(String[] a) {
        Report frame = new Report();
        frame.setTitle("SOLHAIR");
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setResizable(false);
    }
}