/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import modelo.Chat;

/**
 *
 * @author acer
 */
public class VentanaChat extends JFrame implements ActionListener{
    
    private Chat chatRobot = new Chat("SheBot");
    private JLabel etiquetaUsuario;
    private JLabel etiquetaChatBot;
    private JTextField campoUsuario;
    private JTextArea campoChatBot;
    private JButton botonEnviar;
    private JPanel panelSuperior = new JPanel();
    private JPanel panelInferior = new JPanel();
    
    public VentanaChat(){
      
        setBounds(0,0,500,500);
        setTitle(chatRobot.getNombre());
        
        etiquetaUsuario = new JLabel("Yo: ", SwingConstants.CENTER);
        etiquetaUsuario.setFont(new Font("Arial", Font.BOLD, 30));
        etiquetaChatBot = new JLabel(chatRobot.getNombre() + ": ", SwingConstants.CENTER);
        etiquetaChatBot.setFont(new Font("Arial", Font.BOLD, 30));
        
        campoUsuario = new JTextField("");
        campoChatBot = new JTextArea("");
        campoChatBot.setLineWrap(true);
        campoChatBot.setWrapStyleWord(true);
        campoChatBot.setFocusable(false);
        
        botonEnviar = new JButton("Enviar");
        botonEnviar.addActionListener(this);
        
        setLayout(new BorderLayout());
        
        add(panelSuperior, BorderLayout.CENTER);
        panelSuperior.setLayout(new GridLayout(2,2));
        panelSuperior.add(etiquetaChatBot);
        panelSuperior.add(campoChatBot);
        panelSuperior.add(etiquetaUsuario);
        panelSuperior.add(campoUsuario);
        
        add(panelInferior, BorderLayout.SOUTH);
        panelInferior.setLayout(new BorderLayout());
        panelInferior.add(botonEnviar, BorderLayout.CENTER);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        campoChatBot.setText(chatRobot.enviarMensaje(campoUsuario.getText()));
        campoUsuario.setText("");
        
    } 
    
}

