import java.util.Scanner;
public class Idade {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a = new int [10];
		System.out.println("-------------------JOGO DO BICHO --------------------");
		System.out.println();
		System.out.println("Preencha a tabela com 10 n�meros diferentes de 1 a 100");
		System.out.println();
		
		for(int j = 0; j<a.length; j++) {
		System.out.println("N�mero "+ (j+1) +": ");
		a[j] = scanner.nextInt();}
		
        System.out.print("Os seus bichos s�o: ");
		String bicho = "";
		for(int i =0; i<a.length; i++) {
			if((a[i]>100)||(a[i]<1)){
				System.out.println("N�o tem esse n�mero no jogo do Bicho, man�");
				
			} else {
				bicho =	        (a[i]<11)?    "Cabra":
					            (a[i]<21)?   "Cavalo":
					            (a[i]<31)?   "Drag�o":
					            (a[i]<41)?   "Jiboia":	
					            (a[i]<51)?    "Ganso": 
					            (a[i]<61)?   "Raposa":
					            (a[i]<71)?     "Sapo":
					            (a[i]<81)? "Cachorro":
					            (a[i]<91)?   "Macaco":
					            	           "Gato";
			}
			System.out.printf("%s, ",bicho);
		}
	  }

}
