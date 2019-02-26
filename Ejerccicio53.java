import java.util.*;
 public class Ejerccicio53 {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa el primer numero : ");
        int x = in.nextInt();  
		System.out.print("Ingresa el segundo numero: ");
		int y = in.nextInt(); 
		System.out.print("Ingresa el tercer numero : ");
        int z = in.nextInt(); 
        System.out.print("El resultado es: "+test(x, y, z,true));
		System.out.print("\n");
    }
    
    public static boolean test(int p, int q, int r, boolean xyz)
     {
	   if(xyz)
		  return (r > q);
	   return (q > p && r > q);
     }
}
