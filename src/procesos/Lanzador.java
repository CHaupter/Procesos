/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nidmai
 */
public class Lanzador {

    /**
     * @param args the command line arguments
     */
    
    public void lanzarSumador(Integer n1, Integer n2){
    
        String clase="Sumador.java";
        ProcessBuilder pb;
    
        
        try {
            pb= new ProcessBuilder("java", clase, n1.toString(), n2.toString());
            pb.redirectError(new File("errores.txt"));        
            pb.directory(new File("C:\\users\\Nidmai\\Documents\\NetBeansProjects\\Procesos\\src\\procesos\\"));
            pb.redirectOutput(new File("suma"+n1+".txt"));
            
            pb.start();
            
          
            
        } catch (IOException ex) {
            Logger.getLogger(Lanzador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Lanzador lanzador= new Lanzador();
        
        lanzador.lanzarSumador(1,51);
        lanzador.lanzarSumador(51,100);
        
    }
    
}
