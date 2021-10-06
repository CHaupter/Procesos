/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

/**
 *
 * @author Nidmai
 */
public class Sumador {
    
    public int sumar(int n1, int n2){
    
        int resultado=0;
        if (n1 > n2) {
            int aux = n1;
            n1 = n2;
            n2 = aux;
        }
        for(int i=n1; i<n2; i++){
        
            resultado+=i;
        
        }
    
        return resultado;
    }
    
    public static void main(String[] args){
    
        Sumador sumador= new Sumador();
        int n1= Integer.parseInt(args[0]);
        int n2= Integer.parseInt(args[1]);
        int resultado= sumador.sumar(n1, n2);
        System.out.println("La suma total del intervalo entre " + n1 + " y "+ n2+ " es: "+resultado);
    
    }
    
}
