/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;



/**
 *
 * @author hnos Salgado
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 suma ();
 resta();
 multi();
 divi();
  
   }
    
   public static int  suma (){
   int num1=10;
    int num2=20;
    int resultado;
   resultado= num1+ num2; 
 System.out.println("Su suma es: " + resultado );   
 return 0;
}
    public static int  resta (){
   int num1=10;
    int num2=20;
    int resultado;
   resultado= num1- num2; 
 System.out.println("Su resta es: " + resultado );   
 return 0;
}
    
  public static int  multi (){
   int num1=10;
    int num2=20;
    int resultado;
   resultado= num1* num2; 
 System.out.println("Su multiplicacion es: " + resultado );   
 return 0;
}
    
   public static int  divi (){
   int num1=10;
    int num2=20;
    int resultado;
   resultado= num1/ num2; 
 System.out.println("Su divicion es: " + resultado );   
 return 0;
}
    
    
    
    
    
    
    
    
    
}
