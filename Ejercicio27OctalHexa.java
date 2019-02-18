import java.util.Scanner;

public class Ejercicio27OctalHexa {
public static void main(String args[])
    {
        String octal_num, hex_num;
        int decnum;
        Scanner in = new Scanner(System.in);
		
        System.out.print("Ingresa un numero octal : ");
        octal_num = in.nextLine();
		
        decnum = Integer.parseInt(octal_num, 8);
        hex_num = Integer.toHexString(decnum);
		
        System.out.print("El resultado en hexadecimal es: "+ hex_num+"\n");
     }
}
