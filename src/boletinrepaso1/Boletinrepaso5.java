
package boletinrepaso1;

import javax.swing.JOptionPane;


public class Boletinrepaso5 {
        int vez;
    public void operacion1(){
        vez=1;
        while(vez>=0){
            String a=JOptionPane.showInputDialog("ingrese número");
            vez=Integer.parseInt(a);
            JOptionPane.showMessageDialog(null,"o seu número é: \n"+vez);
          
        }
            JOptionPane.showMessageDialog(null,"FIN \n"+"del programa");
            JOptionPane.showMessageDialog(null,"FIN \n"+"del programa");
        
        
    }
    public void operacion2(){
        vez=1;
        do{           
            String a=JOptionPane.showInputDialog("ingrese número");
            vez=Integer.parseInt(a);
            JOptionPane.showMessageDialog(null,"o seu número é: \n"+vez);         
             }
        while (vez>=0);
            JOptionPane.showMessageDialog(null,"FIN \n"+"del programa");
    }    
    
     public static void main(String[] args) {
         Boletinrepaso3 e= new Boletinrepaso3();
         e.operacion1();
         e.operacion2();
     }
    
}

//5- completa o exercicio anterior visualizando ademáis a suma dos 4 números