import java.util.Scanner;
public class Ejercicio18BinarioMult {
 public static void main(String[] args)
 {
  long binary1, binary2, multiply = 0;//declaramos los numeros binarios como long
  int digit, factor = 1;//los digitos enteros son iguales a 1
  Scanner in = new Scanner(System.in);
  System.out.print("Ingresa el primer numero binario: ");//ingresamos el primer numero binario
  binary1 = in.nextLong();//guarda el numero ingresado
  System.out.print("Ingresa el segundo numero binario: ");//ingresamos el segundo numero binario
  binary2 = in.nextLong();//guarda el numero ingresado
  while (binary2 != 0)//entonces en numero binario 2 es diferentre de 0 se cumple la funcion
  {
   digit = (int)(binary2 % 10);//el numero binario 2 se le aplica el modular de 10
   if (digit == 1) //el digito es igual a 1
   {
    binary1 = binary1 * factor;// el binario es igual a binario 1 multiuplicado por el factor
    multiply = binaryproduct((int) binary1, (int) multiply);//se multiploica el binario entero y lo declaramos
   } 
   else//pasa a la seguiente condicion
   {
    binary1 = binary1 * factor;//el binario 1 es igual a el binario 1 por el factor
   }
   binary2 = binary2 / 10;//en binario 2 es igual a la division del binario 2 entre 10
   factor = 10;//el factor es igual a 10
  }
  System.out.print("La multiplicacion de los 2 numeros binarios es : " + multiply+"\n");//se imprime el resultado de la multiplicacion de los numero binarios ingresados
 }
 static int binaryproduct(int binary1, int binary2) //se declaran estaticos los numeros binarios 1 y 2
 {
  int i = 0, remainder = 0;//declaramos como entero el i que es igual a 0
  int[] sum = new int[20];//se pone una matriz que sea desde 0 hasta el 20
  int binary_prod_result = 0;//declaramos como entero el producto del binario ingresado que seria igual a 0

  while (binary1 != 0 || binary2 != 0) //entonces en numero binario 1 es diferente de 0 y el numero binario 2 tambien es diferente de 0
  {
   sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;//conador que incremenmta es igual a los numeros binarios 1 y 2 con el modular 10 a todo eso se le aplca el modular 2
   remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
   binary1 = binary1 / 10;//el binario 1 es igual al binario 1 entre 10
   binary2 = binary2 / 10;//el binario 2 es igual al binario 2 entre 10
  }
  if (remainder != 0)//si el remaindeer es diferente de 0 se realiza la funcion
  {
   sum[i++] = remainder;//contador que incrementa y es igual al remainder
  }
  --i;//contador que decrementa 
  while (i >= 0) //entomces el valor i es igual o mayor a 0 se realiza la condicion
  {
   binary_prod_result = binary_prod_result * 10 + sum[i--];//el producto del binario es igual a el producto del binario multiplicado por 10 y se le aplica un cpontador de decremento
  }
  return binary_prod_result;//se retorna el producto de binario
 }
 }
 
