import java.util.Scanner;
 
public class Ejercicio12Promedio {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Ingresa el primer numero: ");
  int num1 = in.nextInt();
   
  System.out.print("Ingresa el segundo numero: ");
  int num2 = in.nextInt();
   
  System.out.print("Ingresa el tercer numero: ");
  int num3 = in.nextInt();
   
  System.out.print("Ingresa el cuarto numero: ");
  int num4 = in.nextInt();
  
  System.out.print("Ingresa el quinto numero: ");
  int num5 = in.nextInt();
   
   
  System.out.println("El promedio de los 5 numeros es : " + 
   (num1 + num2 + num3 + num4 + num5) / 5);
 }
}
