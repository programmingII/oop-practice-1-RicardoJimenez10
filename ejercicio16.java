//Ricardo Jimenez 11/02/19 11:02pm
import java.util.*; 
public class ejercicio16 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double gradosC, gradosF;
      System.out.println("Introduce grados Centígrados:");
      gradosC = sc.nextDouble();
      gradosF = 32 + (9 * gradosC / 5);
      System.out.println(gradosC +" ºC = " + gradosF + " ºF");
  }
}