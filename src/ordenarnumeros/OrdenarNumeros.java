/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenarnumeros;

/**
 *
 * @author soporte
 */
public class OrdenarNumeros {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       // TODO code application logic here
         
       int n1 = (int) (Math.random() * 100) ;
       int n2 = (int) (Math.random() * 100) ;
       int n3 = (int) (Math.random() * 100) ;
       
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
       
       if (n1 < n2 && n2 < n3);
       System.out.println (n1 + "," + n2 + "," + n3);
        
       
        if (n1 < n3 && n3 < n2);
        System.out.println (n1 + "," + n3 + "," + n2);
            
        
        if (n2 < n1 && n1 < n3);
        System.out.println (n2 + "," + n1 + "," + n3);
        
        
        if (n2 < n3 && n3 < n1);
        System.out.println (n2 +"," + n3 + "," + n1);
        
        
        if (n3 < n2 && n1 < n1);
        System.out.println (n3 + "," + n2 + "," + n1);
        
        
        if (n3 < n1 && n1 < n2);
        System.out.println (n3 + "," + n1 + "," + n2);
        
            
    }   
}
        
        
        
       
       
        
       
       
       
       
       
       
       
       
       
    
       
       
      
      
       
        
        
        
        
    
    
    
    

