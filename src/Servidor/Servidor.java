package Servidor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor{
    ServerSocket server;
    Socket cliente;
    ObjectInputStream input;
    boolean activo = false;

    public Servidor(Etiqueta etiqueta){
        connect();
    }
    
    public void connect(){
        try {
            server = new ServerSocket(5555);
            cliente = server.accept();
        } 
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}