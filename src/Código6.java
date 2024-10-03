
public class Código6 {
	
	public static void main(String[] args) { // Añadí el método main
	 int[] n = new int[20];// Añadí  "new"

	    for (int i = 0; i < 20; i++) {// Cambié a "i++"
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");// Añadí  "out"
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? ");// Añadí  "ln"
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    int opcion = Integer.parseInt(System.console().readLine());// Añadí  ")"

	    int multiplo = (opcion == 1) ? 5 : 7;// Cambié lugares entre ":" y "?" para ejecutar correcatmente la expresion ternaria

	    for (int e : n) { // Cambié a "for" y ajusté el tipo a "int"
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      } else {// Añadí  "}"
	        System.out.print(e + " "); // Cambié a "System.out.print"
	      }
	    }
	}// método main
	  
}//class Código6
