import java.util.*;
 public class Ejercicio54 {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);//Nos permite almacenar los datos
        System.out.print("Input the first number : ");//Nos permite ingresar el primer numero
        int x = in.nextInt();  //Se almacenara el primer numero entero en x
		System.out.print("Input the second number: ");//Nos permite ingresar el segundo numero
		int y = in.nextInt(); //Se almacenar el segundo numero entero en y
		System.out.print("Input the third number : ");//Nos permite ingresar el tercer numero
        int z = in.nextInt(); //Se almacenara el primer numero entero en z
        System.out.print("The result is: "+test_last_digit(x, y, z,true));//imprime los resultados 
		System.out.print("\n");
    }
   
    public static boolean test_last_digit(int p, int q, int r, boolean xyz)
     {
	     return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
     }
}
