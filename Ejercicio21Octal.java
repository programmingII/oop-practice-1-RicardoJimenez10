import java.util.Scanner;
public class Ejercicio21Octal {
      public static void main(String args[])
    {
            int dec_num, rem, quot, i=1, j;
        int oct_num[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Ingresa un numero entero: ");
        dec_num = scan.nextInt();
		
        quot = dec_num;
		
        while(quot != 0)
        {
            oct_num[i++] = quot%8;
            quot = quot/8;
        }
		
        System.out.print("El resultado en numero octal es : ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(oct_num[j]);
        }
		System.out.print("\n");
    }
}
