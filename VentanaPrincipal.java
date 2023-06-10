package notas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener{
    private Container contenedor;
    private JLabel nota1,nota2,nota3,nota4,nota5,promedio,
            desviacion,mayor,menor;
    private JTextField campoNota1,campoNota2,campoNota3,campoNota4,campoNota5;
    private JButton calcular,limpiar;
    
    public VentanaPrincipal(){
        inicio();
        setTitle("Notas");
        setSize(280,380);//tamaño de la ventana
        setLocationRelativeTo(null);//establece que la ventana estará centrada
        setDefaultCloseOperation(EXIT_ON_CLOSE);//cierre de la ventana
        setResizable(false);//no se puede cambiar el tamaño de la ventana
    }
    public void inicio(){
        contenedor=getContentPane();
        contenedor.setLayout(null);
        EtiquetasNotas();
        CajasTexto();
        Botones();
    }
    public void EtiquetasNotas(){
        nota1=new JLabel("Nota 1:");
        nota1.setBounds(20,20,135,23);
        contenedor.add(nota1);
        
        nota2=new JLabel("Nota 2:");
        nota2.setBounds(20,50,135,23);
        contenedor.add(nota2);
        
        nota3=new JLabel("Nota 3:");
        nota3.setBounds(20,80,135,23);
        contenedor.add(nota3);
        
        nota4=new JLabel("Nota 4:");
        nota4.setBounds(20,110,135,23);
        contenedor.add(nota4);
        
        nota5=new JLabel("Nota 5:");
        nota5.setBounds(20,140,135,23);
        contenedor.add(nota5);
        
        
        promedio=new JLabel();
        promedio.setBounds(20,210,135,23);
        contenedor.add(promedio);
        
        desviacion= new JLabel();
        desviacion.setBounds(20,240,200,23);
        contenedor.add(desviacion);
        
        mayor=new JLabel();
        mayor.setBounds(20, 270, 135, 23);
        contenedor.add(mayor);
        
        menor=new JLabel();
        menor.setBounds(20,300,135,23);
        contenedor.add(menor);
    }
    
    public void CajasTexto(){
        campoNota1=new JTextField();
        campoNota1.setBounds(105,20,135,23);
        contenedor.add(campoNota1);
        
        campoNota2=new JTextField();
        campoNota2.setBounds(105,50,135,23);
        contenedor.add(campoNota2);
        
        campoNota3=new JTextField();
        campoNota3.setBounds(105,80,135,23);
        contenedor.add(campoNota3);
        
        campoNota4=new JTextField();
        campoNota4.setBounds(105,110,135,23);
        contenedor.add(campoNota4);
        
        campoNota5=new JTextField();
        campoNota5.setBounds(105,140,135,23);
        contenedor.add(campoNota5);
    }
    public void Botones(){
        calcular=new JButton("Calcular");
        calcular.setBounds(20,170,100,23);
        contenedor.add(calcular);
        
        calcular.addActionListener(this);
        
        limpiar=new JButton("Limpiar");
        limpiar.setBounds(125,170,80,23);
        contenedor.add(limpiar);
        
        limpiar.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent evento){
        if (evento.getSource() == calcular) {
        Notas notas=new Notas();
        notas.listNotas[0]=Double.parseDouble(campoNota1.getText());
        notas.listNotas[1]=Double.parseDouble(campoNota2.getText());
        notas.listNotas[2]=Double.parseDouble(campoNota3.getText());
        notas.listNotas[3]=Double.parseDouble(campoNota4.getText());
        notas.listNotas[4]=Double.parseDouble(campoNota5.getText());
        
        double prom=notas.Promedio();
        
        promedio.setText("Promedio="+String.valueOf(String.format
        ("%.2f",prom)));
        
        desviacion.setText("Desviacion estandar="+String.valueOf(String.format
        ("%.2f",notas.DesviacionEstandar())));
        
        double may=notas.mayorNota();
        mayor.setText("Valor mayor="+String.valueOf(String.format
        ("%.2f",may)));
        
        double men=notas.menorNota();
        
        menor.setText("Valor menor="+String.valueOf(String.format
        ("%.2f",men)));
        
        }if(evento.getSource()==limpiar){
            campoNota1.setText("");
            campoNota2.setText("");
            campoNota3.setText("");
            campoNota4.setText("");
            campoNota5.setText("");
            promedio.setText("");
            desviacion.setText("");
            mayor.setText("");
            menor.setText("");
        }
    }
}
