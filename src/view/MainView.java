package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MainView extends JFrame{

    public MainView(int width, int height){

        setSize(width, height);
        setTitle("User Interface Beispiel");
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        setVisible(true);
        addUIComponents();
    }

    /**
     *Erstellt eine Nutzeroberflaeche
     */
    private void addUIComponents(){
        JPanel topPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        JPanel bottomPanel = new JPanel();

        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        centerPanel.setLayout(new GridLayout(1, 3));
        centerPanel.setBorder( new EmptyBorder(5, 5, 5, 5));

        JLabel label = new JLabel("Optionen");
        topPanel.add(label);

        JButton openInfo = new JButton("Info");
        bottomPanel.add(openInfo);




    }





}
