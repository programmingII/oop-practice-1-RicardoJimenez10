import java.util.Scanner;
public class Ejercicio17Binarios {
 public static void main(String[] args)
 {
  long binary1, binary2;//el long sirve para poder teclear numeros largos de varios digitos 
  int i = 0, remainder = 0;//el valor de i empieza de cero 
  int[] sum = new int[20];//sirve para teclear numeros igual o menores a 20
  Scanner in = new Scanner(System.in);

  System.out.print("Ingresa el primer numero binario: ");//ingresamos el primer numero
  binary1 = in.nextLong();//guarda el numero tecleado
  System.out.print("Ingresa el segundo numero binario: ");//ingresamos el segundo numero
  binary2 = in.nextLong();//guarda el segundo numero binario

  while (binary1 != 0 || binary2 != 0) //si la condicion es verdadera que el numero banario es diferente a cero y el numero binario 2 es diferente a cero entonces se realiza la funcion
  {
   sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);//en esta linea incrementa el i  
   remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);//
   binary1 = binary1 / 10;
   binary2 = binary2 / 10;
  }
  if (remainder != 0) {
   sum[i++] = remainder;
  }
  --i;
  System.out.print("Suma de los 2 numeros binarios : ");
  while (i >= 0) {
   System.out.print(sum[i--]);
  }
   System.out.print("\n");  
 }
}
