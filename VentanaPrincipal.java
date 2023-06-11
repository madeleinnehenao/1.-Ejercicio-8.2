package figurasgeometricas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
    Container contenedor;
    JButton cilindro,esfera,piramide;
    
    public VentanaPrincipal(){
        inicio();
        setSize(350,160);
        setTitle("Figuras Geometricas");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }
    public void inicio(){
        contenedor= getContentPane();
        contenedor.setLayout(null);
        
        cilindro=new JButton("Cilindro");
        cilindro.setBounds(20,50,80,23);
        contenedor.add(cilindro);
        
        cilindro.addActionListener(this);
        
        esfera=new JButton("Esfera");
        esfera.setBounds(125,50,80,23);
        contenedor.add(esfera);
        
        esfera.addActionListener(this);
        
        piramide=new JButton("Piramide");
        piramide.setBounds(225,50,100,23);
        contenedor.add(piramide);
        
        piramide.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent evento){
        if(evento.getSource()==esfera){
            VentanaEsfera esfera= new VentanaEsfera();
            esfera.setVisible(true);
        }if(evento.getSource()==cilindro){
            VentanaCilindro cilindro= new VentanaCilindro();
            cilindro.setVisible(true);
        }if(evento.getSource()==piramide){
            VentanaPiramide piramide= new VentanaPiramide();
            piramide.setVisible(true);
        }
    }
}
