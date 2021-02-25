/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numparesimpares60326;

/**
 *
 * @author Jun
 */
public class NumParesImpares60326 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int num = 0;
        int pares = 0;
        int impares =0;
        
        while (num <= 100) {
            if (num%2 == 0) {
                pares = num + pares;
                
            } else {
                impares = num + impares;
            }
            num++;
            
        }
        System.out.println("La suma de los numeros pares es: " + pares);
        System.out.println("La suma de los numeros impares es: " + impares);
    }
    
}
