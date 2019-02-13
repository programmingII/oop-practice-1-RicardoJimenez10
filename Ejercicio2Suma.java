//Ricardo Jimenez 07/02/19 12:17pm
import java.util.Scanner;

public class Ejercicio2Suma {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);//Imprime en la pantalla 
    System.out.print("Ingresa el primer numero: ");//Ingresamos un numero
    int num1 = input.nextInt();//lee el  numero que ingresamos
    System.out.print("Ingresa el segundo numero: ");//ingresamos otro numnero
    int num2 = input.nextInt();//lee el numero
    int sum = num1 + num2;//suma los numero ingresados
    System.out.println();
    System.out.println("El resultado de la suma es "+sum);//imprime el resultado
  }
}