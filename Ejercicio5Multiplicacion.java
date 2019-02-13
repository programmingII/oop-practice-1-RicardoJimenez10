//Ricardo Jimenez 07/02/19 1:15pm
import java.util.Scanner;
 
public class Ejercicio5Multiplicacion {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);//Imprime texto en la pantalla 
   
  System.out.print("Ingresa el primer numero: ");//Ingresamos el primer numero
  int num1 = in.nextInt();//captura el numero
   
  System.out.print("Ingresa el segundo numero: ");//ingresamos el segundo numero
  int num2 = in.nextInt();//Captura el segundo numero
   
  System.out.println(num1 + " x " + num2 + " = " + num1 * num2);//realiza la operacion y la imprime en la pantalla
 }
 
}