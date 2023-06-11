package figurasgeometricas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPiramide extends JFrame implements ActionListener{
    private Container contenedor;
    private JLabel base,altura,apotema,volumen,superficie;
    private JTextField campoBase,campoAltura,campoApotema;
    private JButton calcular;
    
    public VentanaPiramide(){
        inicio();
        setSize(280,290);
        setTitle("Piramide");
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
        base=new JLabel("Base(cms):");
        base.setBounds(20,20,135,23);
        contenedor.add(base);
        
        altura=new JLabel("Altura (cms):");
        altura.setBounds(20,50,135,23);
        contenedor.add(altura);
        
        apotema=new JLabel("Apotema (cms):");
        apotema.setBounds(20,80,135,23);
        contenedor.add(apotema);
        
        volumen=new JLabel();
        volumen.setBounds(20,150,135,23);
        contenedor.add(volumen);
        
        superficie=new JLabel();
        superficie.setBounds(20,180,135,23);
        contenedor.add(superficie);
    }
    public void CajasTexto(){
        campoBase=new JTextField();
        campoBase.setBounds(120,20,135,23);
        contenedor.add(campoBase);
        
        campoAltura=new JTextField();
        campoAltura.setBounds(120,50,135,23);
        contenedor.add(campoAltura);
        
        campoApotema=new JTextField();
        campoApotema.setBounds(120,80,135,23);
        contenedor.add(campoApotema);
    }
    public void Botones(){
        calcular=new JButton("Calcular");
        calcular.setBounds(120,110,135,23);
        contenedor.add(calcular);
        calcular.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent evento){
        boolean error=false;
        double base,altura,apotema;
        try{
            base=Double.parseDouble(campoBase.getText());
            altura=Double.parseDouble(campoAltura.getText());
            apotema=Double.parseDouble(campoApotema.getText());
            
            Piramide piramide= new Piramide(base,altura,apotema);
            
            volumen.setText("Volumen(cm3): "+String.format("%.2f"
                    ,piramide.calcularVolumen()));
            
            superficie.setText("Superficie(cm3): "+String.format("%.2f",
                    piramide.calcularSuperficie()));
            
        }catch(Exception e){
            error=true;
        }finally{if(error){JOptionPane.showMessageDialog(null,"Campo nulo o"
                + "error en formato de numero","Error",
                JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
