import java.util.*;//Nos permite importar alguna clase del paquete que necesitamos para la linea de codigo
 public class Ejercicio61 {
     public static void main(String[] args){	
     Scanner in = new Scanner(System.in);//Nos crea el objeto in para almacenar datos
     System.out.print("\nInput a word: ");//Nos permite ingresar palabras
	 String word = in.nextLine();//Nos permite utilizar el metodo de datos y nos guarda en la variable
	 word = word.trim();
	 String result = ""; //Nos permite dar el resultado de lo que ingresamos
     char[] ch=word.toCharArray();  
	 for (int i = ch.length - 1; i >= 0; i--) {//Utilizamos una estructura de condicion for, para recorrer la cadena desde la ultima letra,utilizo el metodo length() de la clase string, del objeto, para encontrar el tamaño de la frase
			 result += ch[i];//Nos imprime el resultado de la condicion anterior
		 }
	 System.out.println("Reverse word: "+result.trim()); //imprime el resultado
	 }			
}
