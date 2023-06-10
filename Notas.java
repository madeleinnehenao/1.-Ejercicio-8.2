package notas;

public class Notas {
    double [] listNotas;
    
    /*Constructor de la clase Notas, instancia un array con 5 notas de
    tipo double*/
    
    public Notas(){
        this.listNotas=new double[5];
    }
    
    public double Promedio(){
        double suma = 0;
        for(int i=0; i < listNotas.length; i++) {
            suma=suma + listNotas[i];
        }
        return (suma / listNotas.length);
    }
    
    public double DesviacionEstandar(){
        double prom = Promedio();
        double suma = 0;
        for(int i=0; i < listNotas.length; i++) {
            suma += Math.pow(listNotas[i] - prom, 2 );
        }
        return Math.sqrt (suma/listNotas.length);
    }
    
    public double mayorNota(){
        double mayor=listNotas[0];
        for(int i=0;i<listNotas.length;i++){
            if(listNotas[i]>mayor){
                mayor=listNotas[i];}
        }
        return mayor;
    }
    
    public double menorNota(){
        double menor=listNotas[0];
        for(int i=0; i<listNotas.length;i++){
            if(listNotas[i]<menor){
            menor=listNotas[i];}
        }
        return menor;
    }
}
