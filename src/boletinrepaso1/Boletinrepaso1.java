
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





//7- Codifica o programa anterior tendo en conta que o lado non pode ser negativo .
//8- Completa o programa anterior para que calcule o área de varios cadrados .Remata o programa cando o valor do lado sexa 0 ( condición de fin ).
//9- Sumar unha serie de números que pedimos por teclado . Cando a suma sexa 100 ou superior visualizamos o resultado .
//10 – Calcula a nota media  de un alumno que ten 6 módulos .
//11 – Supon que nunha clase están 3 alumnos . Calcula a nota media para cada un dos alumnos .
//
//12- Queremos codificar un programa que calcule a nota media de unha serie de alumnos. 
//Como en cada unha das clases ,o nº de alumnos é distinto .Cando rematemos de visualizar unha media  preguntamos se queremos repetir o proceso . 
//Se  a resposta e “si” volvemos a empezar co 2º …. 
//E así con todos ata que a resposta sexa distinta de “si”.