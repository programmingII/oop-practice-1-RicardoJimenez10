//Ricardo jimenez 11/02/19 10:57pm
import java.util.*;
public class ejercicio15 {
  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double velocidad;
        System.out.println("Introduzca velocidad en Km/h: ");
        velocidad = sc.nextDouble();
      System.out.println(velocidad + " Km/h es igual a " + velocidad*1000/3600 + " m/s");
}
}