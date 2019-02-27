import java.util.*;//Nos permite importar alguna clase del paquete que necesitamos para la linea de codigo

 public class Ejercicio63 {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);//Nos crea el objeto in para almacenar datos
        System.out.print("Input the first number : ");//Nos permite ingresar nuestro primer numero
        int a = in.nextInt(); //utilizamos el objeto creado de tipo entero para usar el metodo de ingreso de datos, y guardo ese dato en la variable de nuestro primer numero 
		System.out.print("Input the second number: ");//Nos permite ingresar nuestro segundo numero
		int b = in.nextInt(); //utilizamos el objeto creado de tipo entero para usar el metodo de ingreso de datos, y guardo ese dato en la variable de nuestro segundo numero
		System.out.println("Result: "+result(a, b));//Nos imprime el resultado del numero entre a y b
    }
	public static int result(int x, int y)//se almacenan los valores de x & y como enteros
     {  
	if(x == y)//si x es igual a y entonces cumple con la funcion if
		return 0;//nos retorna el valor
	    if(x % 6 == y % 6)
		    return (x < y) ? x : y;
	    return (x > y) ? x : y;
     }
}
