public class Array_Multi {
	//Somar todas as linha e tudo no final
	public static void main (String[] arcs) {
		int[][] array = new int[10][10];
		int x, y, soma=0, somatotal = 0;
		for(x = 0; x<array.length; x++){
			for(y = 0; y<array.length; y++) {
				array[x][y]=(3*(x+1)+(y*y));
				soma += array[x][y];
				if(y<9) {
					System.out.printf("%d ", array[x][y]);
				} else {
					System.out.printf("%d %d\n", array[x][y], soma);
				      }
				
					
                   }
		somatotal += soma;			
            }
	System.out.println("A soma de todos os n�meros �: " + somatotal);	
    }
}
 