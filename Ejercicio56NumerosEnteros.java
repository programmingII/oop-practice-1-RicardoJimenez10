import java.util.*;
 public class Ejercicio56NumerosEnteros {
     public static void main(String[] args){
		int x = 5;//declaramos como entero x y le asignamos el valor 5
		int y = 20;//declaramos como entero y y le asignamos el valor 20
		int p = 3;//declaramos como entero p y le asignamos el valor 3
		System.out.println(result(x,y,p));//introducimos los valores
	 } 		
	public static int result(int x, int y, int p) {	//muestra los resultados
		if (x%p == 0)
			return( y/p - x/p + 1);
		return(y/p - x/p);
	}
 }
