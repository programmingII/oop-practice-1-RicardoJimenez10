public class Ejercicio15Intercambio {
 
 public static void main(String[] args) {
     
   int a, b, temp;//declaramos con enteros a y b
   a = 15;//declaramos en a sea igual a 15
   b = 27;//b es igual a 27
   System.out.println("Antes del intercambio : a, b = "+a+", "+ + b);//imprime el resultado y muestra el valor antes del intercambio
   temp = a;//nombre de variable local que es igual a a
   a = b;//a es igual a b
   b = temp;   
  System.out.println("Despues del intercambio : a, b = "+a+", "+ + b);//se imprime el resultado
 }
 }
