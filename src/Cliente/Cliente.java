/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Cliente {
    Socket client;
    Boton boton;
     

    public Cliente(Boton boton) {
        this.boton = boton;
        conectar();
    }
    
    public void conectar(){
        try {
            client = new Socket("localhost", 5555);
        } catch (IOException ex) {
            
        }
    }
    
    
}
