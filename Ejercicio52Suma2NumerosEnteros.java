import java.util.*;
 public class Ejercicio52Suma2NumerosEnteros {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa el primer numero : ");
        int x = in.nextInt();  
		System.out.print("Ingresa el segundo numero: ");
		int y = in.nextInt(); 
		System.out.print("Ingresa el tercer numero : ");
        int z = in.nextInt(); 
        System.out.print("El resultado es : "+sumoftwo(x, y, z));
		System.out.print("\n");
    }
    
    public static boolean sumoftwo(int p, int q, int r)
      {	
         return ((p + q) == r || (q + r) == p || (r + p) == q);	
	   }
}
