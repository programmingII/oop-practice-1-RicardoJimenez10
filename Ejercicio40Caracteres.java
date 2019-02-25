import java.nio.charset.Charset;
public class Ejercicio40Caracteres {
  public static void main(String[] args) {
	System.out.println("Lista disponilble de caracteres: ");  
    for (String str : Charset.availableCharsets().keySet()) {
      System.out.println(str);
    }
  }
}
