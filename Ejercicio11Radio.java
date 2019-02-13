//Ricardo jimenez 13/02/19 3:12pm
public class Ejercicio11Radio {
 
   private static final double radio = 7.5;//se pone el radio como un valor double porque lleva decimales

    public static void main(String[] args) {

        double perimetro = 2 * Math.PI * radio;//multiplicamos el perimetro por el radio
        double area = Math.PI * radio * radio;//guarda el valor del radio

        System.out.println("El perimetro es = " + perimetro);//imprime el perimetro
        System.out.println("El area es = " + area);//imprime el valor del area
    }
}
