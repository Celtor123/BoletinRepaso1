
package boletinrepaso1;

import javax.swing.JOptionPane;


public class Boletinrepaso2 {
    int vez;
    public void operacion1(){
        vez=1;
        while(vez<=5){
            String a=JOptionPane.showInputDialog("ingrese número");
            int e=Integer.parseInt(a);
            JOptionPane.showMessageDialog(null,"o seu número é: \n"+e);
            vez++;
        }
            JOptionPane.showMessageDialog(null,"FIN \n"+"del programa");
        
        
    }
    public void operacion2(){
        vez=1;
        do{
            String a=JOptionPane.showInputDialog("ingrese número");
            int e=Integer.parseInt(a);
            JOptionPane.showMessageDialog(null,"o seu número é: \n"+e);
            vez++;
        }while (vez<=5);
            JOptionPane.showMessageDialog(null,"FIN \n"+"del programa");
    }
    public void operacion3(){
        for(vez=1;vez<=5;vez++){
            String a=JOptionPane.showInputDialog("ingrese número");
            int e=Integer.parseInt(a);
            JOptionPane.showMessageDialog(null,"o seu número é: \n"+e);
        }
        JOptionPane.showMessageDialog(null,"FIN \n"+"del programa");
    }
     public static void main(String[] args) {
         Boletinrepaso2 a= new Boletinrepaso2();
         a.operacion1();
         a.operacion2();
         a.operacion3();
         
     }
    
}

//2- visualizar   5 números  que pides por teclado .