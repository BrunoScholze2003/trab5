package org.example.janela;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TarefasJanela extends JFrame {

    JLabel label = new JLabel();
    JButton tarefaBtt = new JButton();

    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    JPanel panel6 = new JPanel();



    JRadioButton radioButton = new JRadioButton("comprar carvão");
    JRadioButton radioButton2 = new JRadioButton("comprar batata");
    JRadioButton radioButton3 = new JRadioButton("comprar banana");
    JRadioButton radioButton4 = new JRadioButton("comprar leite");
    JRadioButton radioButton5 = new JRadioButton("comprar suco");


    public TarefasJanela(){
        setTitle("Tarefas");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        configurarJanela();
        setVisible(true);
    }

    public void configurarJanela(){
        JPanel panel = new JPanel();
        label.setText("Caixa de entrada");
        label.setPreferredSize( new Dimension(270, 80));

        tarefaBtt.setText("Nova Tarefa");



        Border blackline;
        blackline = BorderFactory.createLineBorder(Color.black);
        panel2.setBorder(blackline);
        panel2.setPreferredSize( new Dimension(300, 40));
        panel3.setBorder(blackline);
        panel3.setPreferredSize( new Dimension(300, 40));
        panel4.setBorder(blackline);
        panel4.setPreferredSize( new Dimension(300, 40));
        panel5.setBorder(blackline);
        panel5.setPreferredSize( new Dimension(300, 40));
        panel6.setBorder(blackline);
        panel6.setPreferredSize( new Dimension(300, 40));
        radioButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        radioButton2.setAlignmentX(Component.CENTER_ALIGNMENT);
        radioButton3.setAlignmentX(Component.CENTER_ALIGNMENT);
        radioButton4.setAlignmentX(Component.CENTER_ALIGNMENT);
        radioButton5.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel2.add(radioButton);
        panel3.add(radioButton2);
        panel4.add(radioButton3);
        panel5.add(radioButton4);
        panel6.add(radioButton5);


        panel.add(label);
        panel.add(tarefaBtt);
        panel.add(panel2);
        panel.add(panel3);
        panel.add(panel4);
        panel.add(panel5);
        panel.add(panel6);
        add(panel);
    }
}