package figurasgeometricas;


public class Piramide extends FigurasGeometricas {
   private double base,altura,apotema;
   
    public Piramide(double base, double altura,double apotema){
        this.base=base;
        this.altura=altura;
        this.apotema=apotema;
        
        this.setVolumen(calcularVolumen());
        
        this.setSuperficie(calcularSuperficie());
    }   
    
    public double calcularVolumen(){
        double volumen = (Math.pow(base, 2.0) * altura) / 3.0;
        return volumen;
    }
    public double calcularSuperficie(){
        double areaBase = Math.pow(base, 2.0);
        double areaLado = 4.0 * base * apotema;
        return areaBase + areaLado;
    }   
}
