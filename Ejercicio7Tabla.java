//Ricardo Jimenez 07/02/19 12:49pm
import java.util.Scanner;
 
public class Ejercicio7Tabla {
 
 public static void main(String[] args) {//No retorne valor 
  Scanner in = new Scanner(System.in);//imprime un mensaje en la pantalla
   
  System.out.print("Ingresa un numero: ");//imprime un mensaje en la pantalla
  int num1 = in.nextInt();//toma el numero y lo guarda
   
  for (int i=0; i< 10; i++){//contador que incrementa de 0 a 10
   System.out.println(num1 + " x " + (i+1) + " = " + //imprime el resultado
     (num1 * (i+1)));
  }
 }
}
