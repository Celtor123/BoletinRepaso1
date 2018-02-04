
package boletinrepaso1;

import javax.swing.JOptionPane;


public class Boletinrepaso10 {
 
    public void nota(){
        int r=0;
        while(r<6){
       String a= JOptionPane.showInputDialog("inserte a nota do módulo: ");
       int e = Integer.parseInt(a);
       r++;
    }
       
       
       
       JOptionPane.showMessageDialog(null, e);
    }
    public static void main(String[] args) {
        Boletinrepaso10 a= new Boletinrepaso10();
        a.nota();
    }
    
}

//10 – Calcula a nota media  de un alumno que ten 6 módulos .