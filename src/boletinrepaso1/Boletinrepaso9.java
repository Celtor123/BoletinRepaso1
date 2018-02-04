
package boletinrepaso1;

import javax.swing.JOptionPane;


public class Boletinrepaso9 {
    public static void main(String[] args) {
        int a = 0;
       
           String f= JOptionPane.showInputDialog("ponga numeros para su suma");
            while(a<100){
           a=Integer.parseInt(f);
           JOptionPane.showMessageDialog(null, a);
           f= JOptionPane.showInputDialog("ponga numeros para su suma");
        }
        
    }
    
}

//9- Sumar unha serie de números que pedimos por teclado . 
//Cando a suma sexa 100 ou superior visualizamos o resultado .