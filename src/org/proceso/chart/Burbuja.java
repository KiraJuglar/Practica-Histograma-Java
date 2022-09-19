
package org.proceso.chart;


public class Burbuja {
    int[] conjunto;
    public Burbuja(int[] conjunto){
        this.conjunto = conjunto;
    }
    
    public void Ordenar(){
        int aux = 0;
        for(int i = 0; i < conjunto.length; i++){
            for(int j = 1; j < conjunto.length; j++){
                if(conjunto[j-1] < conjunto[j]){
                    aux = conjunto[j];
                    conjunto[j] = conjunto[j-1];
                    conjunto[j-1] = aux;
                }
            }
        }
    }
    
    public int[] getConjunto(){
        return this.conjunto;
    }
}
