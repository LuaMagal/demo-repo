import java.util.*;
import java.util.Random;



class Sasageyo{
	public static void main(String[] args) {
	System.out.println(new DadosRPG(20, 12, 0));

	}
	
	
}


public class DadosRPG {
    
	
	
	int dado, quant, adic;
		
	
	DadosRPG(int dado, int quant, int adic){
     dado(this.dado, 
          this.quant, 
    	  this.adic);
	}
	public static void dado(int dado, int quant, int adic) {
		
		Scanner scanner = new Scanner(System.in);
		Random num = new Random();
		int conf, roll, soma = 0;
		
		soma = 0;		
	    do {
				int dice = num.nextInt(dado)+1;
				System.out.println
				("A sua rolagem foi " + dice + "+" + "("+adic+") = "+(adic+dice));
				quant-=1;
				soma += (adic+dice);
		}while(quant!=0);	
			System.out.println("A soma dos dados � "+soma);
	    
	}

}
