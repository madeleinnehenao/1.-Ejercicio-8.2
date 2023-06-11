package figurasgeometricas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaCilindro extends JFrame implements ActionListener{
    private Container contenedor;
    private JLabel radio,altura,volumen,superficie;
    private JTextField campoRadio,campoAltura;
    private JButton calcular;
    
    public VentanaCilindro(){
        inicio();
        setTitle("Cilindro");
        setSize(280,210);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    public void inicio(){
        contenedor=getContentPane();
        contenedor.setLayout(null);
        Etiquetas();
        CajasTexto();
        Botones();
    }
    public void Etiquetas(){
        radio=new JLabel("Radio (cms):");
        radio.setBounds(20,20,135,23);  
        contenedor.add(radio);
        
        altura= new JLabel("Altura (cms):");
        altura.setBounds(20,50,135,23);
        contenedor.add(altura);
        
        volumen=new JLabel();
        volumen.setBounds(20,110,135,23);
        contenedor.add(volumen);
        
        superficie=new JLabel();
        superficie.setBounds(20,140,135,23);
        contenedor.add(superficie);
        
    }   
    public void CajasTexto(){
        campoRadio=new JTextField();
        campoRadio.setBounds(100,20,135,23);
        contenedor.add(campoRadio);
        
        campoAltura=new JTextField();
        campoAltura.setBounds(100,50,135,23);
        contenedor.add(campoAltura);
    }
    public void Botones(){
        calcular= new JButton("Calcular");
        calcular.setBounds(100,80,135,23);
        contenedor.add(calcular);
        calcular.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent evento){
        boolean error=false;/*Se inicializa la variable para determinar
        si ocurre un error*/
        double radio=0;
        double altura=0;
        
        try{
            radio=Double.parseDouble(campoRadio.getText());
            altura=Double.parseDouble(campoAltura.getText());
            Cilindro cilindro=new Cilindro(radio,altura);
            
            volumen.setText("Volumen(cm3): "+String.format("%.2f"
                    ,cilindro.calcularVolumen()));
            superficie.setText("Superficie(cm3): "+String.format("%.2f",
                    cilindro.calcularSuperficie()));
        }catch(Exception e){
            error=true;//Si Ocurre una excepción.
        }finally{if(error){JOptionPane.showMessageDialog(null,"Campo nulo o"
                + "error en formato de numero","Error",
                JOptionPane.ERROR_MESSAGE );
            }
        }
    }
}
