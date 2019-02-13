//Ricardo Jimenez 12:00am 12/02/19
import java.util.Scanner;
 
public class Ejercicio6Operaciones {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);//imprime texto en la consola
   
  System.out.print("Ingrese el primer numero: ");//se digita el primer numero
  int num1 = in.nextInt();//se captura
   
  System.out.print("Ingrese el segundo numero: ");//se digita el segundo numero
  int num2 = in.nextInt();//se captura
   
 
  System.out.println(num1 + " + " + num2 + " = " + //se imprime el resultado de la suma
  (num1 + num2));// se suman los numero digitados
   
  System.out.println(num1 + " - " + num2 + " = " + // se imprime el resultado de la resta
  (num1 - num2));//se restan los numero 
   
  System.out.println(num1 + " x " + num2 + " = " + //se multiplican numeros
  (num1 * num2));//se realiza la multiplicacion
   
  System.out.println(num1 + " / " + num2 + " = " + //se dividen los numeros
  (num1 / num2));//aqui se realiza la division
 
  System.out.println(num1 + " mod " + num2 + " = " + //se realiza el modular de los numeros
  (num1 % num2));
 }
 
}
