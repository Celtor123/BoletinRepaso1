
package boletinrepaso1;

import javax.swing.JOptionPane;


public class Boletinrepaso7 {
    public void area(){
       String a= JOptionPane.showInputDialog("Poña os cms do lado:");
       int b=Integer.parseInt(a);
       if(b>=0){
       int area=b*b;
       JOptionPane.showMessageDialog(null,"a área é de: \n"+area+"cms");
    }
       else{
          JOptionPane.showMessageDialog(null,"ERROR \n el número es negativo"); 
       }
    }
    public static void main(String[] args) {
       Boletinrepaso7 p= new Boletinrepaso7();
       p.area();
    }
    
    
}

//7- Codifica o programa anterior tendo en conta que o lado non pode ser negativo .
