import java.util.*;//nos permite importar alguna clase del paquete que necesitamos para la linea de codigo
 public class Ejercicio59 {
     public static void main(String[] args){	
     Scanner in = new Scanner(System.in);//Nos crea el objeto in para almacenar datos
     System.out.print("Input a String: ");//Nos permite introducir la operacion 
	 String line = in.nextLine();//Nos guarda la informacion que hayamos escrito anteriormente
	 line = line.toLowerCase();//De la linea con el metodo toLowerCase se convierte a minuscula lo que esta antes del punto
	 System.out.println(line); //Nos imprime la linea que pongamos pero en letras minusculas
	 }			
}
