package figurasgeometricas;

public class Cilindro extends FigurasGeometricas {
    private double radio,altura;
    
    public Cilindro(double radio, double altura){
        this.radio=radio;
        this.altura=altura;
        
        this.setVolumen(calcularVolumen());
        
        this.setSuperficie(calcularSuperficie());
    }   
    
    public double calcularVolumen(){
        return(Math.PI*(radio*radio)*altura);
    }
    public double calcularSuperficie(){
    return ((2*Math.PI*radio*altura)+(2*Math.PI*Math.pow(radio,2)));
    }
    
}