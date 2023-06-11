package figurasgeometricas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class VentanaEsfera extends JFrame implements ActionListener {
    Container contenedor;
    JLabel radio,volumen,superficie;
    JTextField campoRadio;
    JButton calcular;
    
    public VentanaEsfera(){
        inicio();
        setSize(280,210);
        setTitle("Esfera");
        setLocationRelativeTo(null);
        setResizable(false);
        
    }
    public void inicio(){
        contenedor=getContentPane();
        setSize(280,210);
        contenedor.setLayout(null);
        Etiquetas();
        CajasTexto();
        Botones();
    }
    public void Etiquetas(){
        radio=new JLabel("Radio(cms)=");
        radio.setBounds(20,20,135,23);  
        contenedor.add(radio);
        
        volumen=new JLabel();
        volumen.setBounds(20,90,135,23);
        contenedor.add(volumen);
        
        superficie=new JLabel();
        superficie.setBounds(20,120,135,23);
        contenedor.add(superficie);
    
    }
    public void CajasTexto(){
        campoRadio=new JTextField();
        campoRadio.setBounds(100,20,135,23);
        contenedor.add(campoRadio);
    }
    public void Botones(){
        calcular= new JButton("Calcular");
        calcular.setBounds(100,50,135,23);
        contenedor.add(calcular);
        
        calcular.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent evento){
        boolean error=false;/*Se inicializa la variable para determinar
        si ocurre un error*/
        double radio;
        
        try{
            radio=Double.parseDouble(campoRadio.getText());
            
            Esfera esfera= new Esfera(radio);
            volumen.setText("Volumen(cm3): "+String.format("%.2f"
                    ,esfera.calcularVolumen()));
            superficie.setText("Superficie(cm3): "+String.format("%.2f",
                    esfera.calcularSuperficie()));
        }catch(Exception e){
            error=true;
        }finally{
        }
    }
}
