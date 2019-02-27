import java.util.*;//Nos permite importar alguna clase del paquete que necesitamos para la linea de codigo
 public class Ejercicio62 {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);//Nos crea el objeto in para almacenar datos
        System.out.print("Input the first number : ");//Nos permite ingresar nuestro primer numero
        int x = in.nextInt();  //se almacena el dato
		System.out.print("Input the second number: ");//Nos permite ingresar nuestro segundo numero
		int y = in.nextInt(); //se almacena el dato
		System.out.print("Input the third number : ");//Nos permite ingresar nuestro tercer numero
        int z = in.nextInt(); //se almacena el dato
        System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));//imprime el resultado de la operacion
    }
}
