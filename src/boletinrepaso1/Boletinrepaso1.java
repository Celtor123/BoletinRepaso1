
package boletinrepaso1;

public class Boletinrepaso1 {
   int num;
   public void operacion1(){
       num=0;
         while(num<5){
             System.out.println("esto é un bucle");
             num++;
         }    
       }
   
    public void operacion2(){
        num=1;
        do{
          System.out.println("Esto tamén é un bucle");
          num++;
        }
        while (num<=5);
    
}
    public void operacion3(){
       for(num=1;num<=5;num++){
           System.out.println("Esto tambien es un bucle");
       }   
       System.out.println("FIN del programa");
    }
    
    

    public static void main(String[] args) {
       Boletinrepaso1 a= new Boletinrepaso1();
       a.operacion1();
       a.operacion2();
       a.operacion3();
    
    }
    
}
//1- Sacar por consola 5 veces a frase “ isto e un bucle “ .










