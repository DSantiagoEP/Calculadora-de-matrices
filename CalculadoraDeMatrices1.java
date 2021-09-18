
package calculadoradematrices1;
import java.util.Arrays;

public class CalculadoraDeMatrices1 {


        // TODO code application logic here
        private int filas;
        private int columnas;
        double [][] m;

    public int getFila() {
        return filas;
    }

    public void setFila(int fila) {
        this.filas = fila;
    }

    public int getColumna() {
        return columnas;
    }

    public void setColumna(int columna) {
        this.columnas = columna;
    }

    public double[][] getM() {
        return m;
    }

    public void setM(double[][] m) {
        this.m = m;
    }
        
    public CalculadoraDeMatrices1(){      
    }
    
    public CalculadoraDeMatrices1(int filas, int columnas){
        this.filas = filas;
        this.columnas = columnas;
        this.m = new  double[filas][columnas];
    }
    
    public void  Insertar(int  fila, int columna, int dato){
        this.m[fila][columna]= dato;
    }
    
    public  String imprimir(){
        String s="";
        
        for (int f = 0; f <this.filas; f++) {
            s= s+"[ ";
            for (int c = 0; c < this.columnas; c++) {
                s = s+ String.valueOf(m[f][c])+" ";
                
            }
            s=s+"]\n";
        }
        return  s;
    }
    
    public  String imprimir(double [][] matriz){
        String s="";
        
        for (int f = 0; f <matriz.length; f++) {
            s= s+"[ ";
            for (int c = 0; c < matriz[0].length; c++) {
                s = s+ String.format("%.2f", matriz[f][c])+" ";
                
            }
            s=s+"]\n";
        }
        return  s;
    }
    
    public int esMatrizCuadrada(){
        if (this.filas==this.columnas)
            return this.filas;
        else
            return 0;
            
        }
    
    public double determinante (double [][] matriz){
        double det;
        if (matriz.length==2){
            det=(matriz[0][0]*matriz[1][1])-(matriz[1][0]*matriz[0][1]);
            return (double) det;
       }
       
        double suma=0;
            for (int i = 0; i < matriz.length; i++) {
                double[][] nm = new double[matriz.length-1][matriz.length-1];
                for (int j = 0; j < matriz.length; j++) {
                    if (j!=i) {
                        for (int k = 0; k < matriz.length; k++) {
                            int indice=-1;
                            if (j<i) 
                                indice=j;
                            else if (j>i)
                                indice=j-1;
                                nm[indice][k-1]= matriz[j][k];                        
                        }
                    }                   
                }
                if(i%2==0)
                    suma+=matriz[i][0]* determinante(nm);
                else
                    suma-=matriz[i][0]*determinante(nm);
            }
            return (double) suma;
        }
        

    
    
    
    
}


    

