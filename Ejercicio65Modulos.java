import java.util.*;//Nos permite importar alguna clase del paquete que necesitamos para la linea de codigo
 public class Ejercicio65Modulos {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);//Nos crea el objeto in para almacenar datos

        System.out.print("Ingresa el primer numero : ");//texto en pantalla para ingresar el primer numero
        int a = in.nextInt();  //utilizamos el objeto creado de tipo entero para usar el metodo de ingreso de datos, y guardo ese dato en la variable de nuestro primer numero
		System.out.print("Ingresa el segundo numero: ");//Nos permite ingresar el segundo numero
		int b = in.nextInt(); //utilizamos el objeto creado de tipo entero para usar el metodo de ingreso de datos, y guardo ese dato en la variable de nuestro segundo numero
		int divided = a / b;//Nos permite dividir el numero a y el numero b
		int result = a - (divided * b);//En este modulo nos resta el numero dividido en b
		System.out.println(result); //Nos imprime el resultado final de los numeros
	
	}
 }
