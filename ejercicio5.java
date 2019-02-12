import java.util.Scanner;
 
public class ejercicio5 {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Ingresa el primer numero: ");
  int num1 = in.nextInt();
   
  System.out.print("Ingresa el segundo numero: ");
  int num2 = in.nextInt();
   
  System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
 }
 
}
