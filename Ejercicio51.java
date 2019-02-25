import java.util.*;
public class Ejercicio51 {

 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa un numero entero: ");
        String str1 = in.nextLine();
		int result = Integer.parseInt(str1);
        System.out.printf("The integer value is: %d",result);
		System.out.printf("\n");
    }
}
