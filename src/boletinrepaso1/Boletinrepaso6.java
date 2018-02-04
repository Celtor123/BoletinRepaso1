
package boletinrepaso1;

import javax.swing.JOptionPane;


public class Boletinrepaso6 {
    public void area(){
       String a= JOptionPane.showInputDialog("Poña os cms do lado:");
       int b=Integer.parseInt(a);
       int area=b*b;
       JOptionPane.showMessageDialog(null,"a área é de: \n"+area+"cms");
    }
    public static void main(String[] args) {
       Boletinrepaso6 r= new Boletinrepaso6();
       r.area();
    }
    
}

//6- Calcula o área dun cadrado . O valor do lado o pides por teclado