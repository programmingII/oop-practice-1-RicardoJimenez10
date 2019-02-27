import java.util.*;
 public class Ejercicio65Modulos {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa el primer numero : ");
        int a = in.nextInt();  
		System.out.print("Ingresa el segundo numero: ");
		int b = in.nextInt(); 
		int divided = a / b;
		int result = a - (divided * b);
		System.out.println(result); 
	}
 }
