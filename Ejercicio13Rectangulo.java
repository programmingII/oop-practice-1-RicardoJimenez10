public class Ejercicio13Rectangulo {
 
   public static void main(String[] strings) {

        final double base = 5.6;
        final double altura = 8.5;

        double perimetro = 2*(altura + base);
		
        double area = base * altura;			
		
		System.out.printf("El perimetro es 2*(%.1f + %.1f) = %.2f \n", altura, base, perimetro);

        System.out.printf("El area es %.1f * %.1f = %.2f \n", base, altura, area);
    }
}
