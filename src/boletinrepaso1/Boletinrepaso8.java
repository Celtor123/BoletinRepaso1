
package boletinrepaso1;

import javax.swing.JOptionPane;

public class Boletinrepaso8 {
      public void area(){
          int b = 1;
          while(b!=0){
       String a= JOptionPane.showInputDialog("Poña os cms do lado:");
       b=Integer.parseInt(a);
       if(b>=0){
       int area=b*b;
       JOptionPane.showMessageDialog(null,"a área é de: \n"+area+"cms");
    }
       else{
          JOptionPane.showMessageDialog(null,"ERROR \n el número es negativo"); 
       }
      }
          JOptionPane.showMessageDialog(null,"FIN \n del programa"); 
       
    }
    public static void main(String[] args) {
       Boletinrepaso8 pr= new Boletinrepaso8();
       pr.area();
    }
    
    
}


//8- Completa o programa anterior para que calcule o área de varios cadrados .
//Remata o programa cando o valor do lado sexa 0 ( condición de fin ).