public class Ejercicio50NumerosDivididos {
    	public static void main(String args[]) {
		System.out.println("\nDividido entre 3: ");//Nos pide que ingresemos un numero		
		for (int i=1; i<100; i++) {//Se utiliza ciclo for que recorre los numero desde 1 hasta 100
			if (i%3==0) //Si el numero i es divisible entre 3 y el residuo es igual a cero entra al ciclo
			System.out.print(i +", ");//Se imprime el numero almacenado en i				
		}			
				
		System.out.println("\n\nDividido entre 5: ");//Nos pide que ingresemos un numero
		for (int i=1; i<100; i++) {//Se utiliza ciclo for que recorre los numero desde 1 hasta 100
			if (i%5==0) System.out.print(i +", ");//Si el numero i es divisible entre 5 y el residuo es igual a cero entra al ciclo				
		}
				
		System.out.println("\n\nDividido entre 3 y 5: ");//Nos permite dividir el numero 3 y 5			
		for (int i=1; i<100; i++) {//Se utiliza ciclo for que recorre los numero desde 1 hasta 100
			if (i%3==0 && i%5==0) System.out.print(i +", ");//Si el numero i es divisible entre 3 y 5  el residuo es igual a cero entra al ciclo			
		}
		System.out.println("\n");//Se imprime el numero almacenado
  }
  }
}
