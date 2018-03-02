/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional;

/**
 *
 * @author hnos Salgado
 */
public class Condicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    mayor ();
    }
    public static int mayor(){
    int num1 = 5;
    int num2 = 6;
    if(num1  > num2  ){
        System.out.println("el numero mayor es: " + num1);
        System.out.println("el numero menor es: " + num2);
    }
    else {
     System.out.println("el numero mayor es: " + num2);
        System.out.println("el numero menor es: " + num1);
    
    
    }
    
    return 0;
    }
}
