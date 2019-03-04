import java.util.*;//Nos permite importar alguna clase del paquete que necesitamos para la linea de codigo

 public class Ejercicio64 {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);//Nos crea el objeto in para almacenar datos
        System.out.print("Input the first number : ");//Ingresamos el primer numero
        int a = in.nextInt();  //utilizamos el objeto creado de tipo entero para usar el metodo de ingreso de datos, y guardo ese dato en la variable de nuestro primer numero
		System.out.print("Input the second number: ");//ingresamos en segundo numero
		int b = in.nextInt(); //utilizamos el objeto creado de tipo entero para usar el metodo de ingreso de datos, y guardo ese dato en la variable de nuestro segundo numero
		System.out.println("Result: "+common_digit(a, b));//Nos imprime el resultado del numero entre a y b
    

    }
	
	public static boolean common_digit(int p, int q)
     {  
	   if (p<25 || q>75)//si p es menor a 25 y q es mayor a 75 se cumple la condicion
		   return false;//si no se cumple la condicion se retorna como falso y se acaba el programa
	   int x = p % 10;//x es igual a p entre el modular de 10
	   int y = q % 10;//y es igual a q y el modular entre 10
	   p /= 10;
	   q /= 10;
	   return (p == q || p == y || x == q || x == y);//entomces se realiza la operacion
     }
}
