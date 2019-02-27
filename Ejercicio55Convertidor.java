import java.util.*;
 public class Ejercicio55Convertidor {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);//Se crea un objetivo que almacenara datos
        System.out.print("Input seconds: ");//Nos permite ingresar los segundos los cuales queramos ingresar
		int seconds = in.nextInt(); //Se almacenan los segundos en int 
        int p1 = seconds % 60;//Se declaran las variables como enteros y se saca el 60 por ciento
        int p2 = seconds / 60;//Se declaran las variables como enteros y se dividen entre 60
        int p3 = p2 % 60;//Se declaran las variables como enteros y por el segundo entero y se saca el 60 por ciento
        p2 = p2 / 60;//p2 es igual a la division de p2 entre 60
        System.out.print( p2 + ":" + p3 + ":" + p1);//Nos imprime la operacion de dichas operaciones anteriores
		System.out.print("\n");//se imrpime el resultado
    }    
 }
