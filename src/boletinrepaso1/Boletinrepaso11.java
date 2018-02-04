
package boletinrepaso1;

import javax.swing.JOptionPane;

public class Boletinrepaso11 {
    public void alumnos(){
    int r=0;
        while(r<6){
       String a= JOptionPane.showInputDialog("inserte a nota do módulo: ");
       int e = Integer.parseInt(a);
       r++;
    }
       
       
       
       JOptionPane.showMessageDialog(null, e);
    }
    public static void main(String[] args) {
        
    }
    
}

//11 – Supon que nunha clase están 3 alumnos . Calcula a nota media para cada un dos alumnos .