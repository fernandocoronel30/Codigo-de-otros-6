import java.util.Scanner;

public class Codigo6 {

	public static void main(String[] args) {
		//falto la palabra new
		 int[] n = new int[20];
		 Scanner sc = new Scanner(System.in);
		 
		 	//Faltaba agregar un signo más en el contador i
		    for (int i = 0; i < 20; i++) {
		      n[i] = (int)(Math.random() * 381) + 20;
		      //faltaba agregar el out del System.out.print
		      System.out.print(n[i] + " ");
		    }
		    //falto la n para que diga println
		    System.out.println("\n¿Qué números quiere resaltar? ");
		    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		    //se reemplazo el readline por el scanner ya que el readLine es de el lenguaje C#
		    //int opcion = Integer.parseInt(System.console().readLine());
		    int opcion = sc.nextInt();
		    
		    //Aqui esta al reves el operador ternario debe ir primero el signo de interrogacion y despues los :
		    int multiplo = (opcion == 1) ? 5 : 7;

		    for (int e : n) {
	            if (e % multiplo == 0) {
	                System.out.print("[" + e + "] ");
	            } else {
	            //Aqui esta mal escrito el System.out en lugar de in
	                System.out.print(e + " ");
		      }//else		      
		    }//foreach	
		    sc.close();
}//main
}//class Codigo6