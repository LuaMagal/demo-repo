import java.util.Random;
import java.util.Scanner;

public class Letmego {
	
	//roll program
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Random num = new Random();
	
	
	int conf, adic, quant, soma = 0, rolagem = 0;
	
	do {
	soma= 0;
	System.out.println("Dado");
	rolagem = scanner.nextInt();
	System.out.println("Quantidade de dados");
    quant = scanner.nextInt();
	System.out.println("Adicional de?");
    adic = scanner.nextInt();
    
	
    switch(rolagem) {
	
    
    case 20: 
		do {
			int d20 = num.nextInt((20)+1);
			System.out.println
			("A sua rolagem foi " + d20 + "+" + "("+adic+") = "+(adic+d20));
			quant-=1;
			soma += (adic+d20);
	}while(quant!=0);	
		System.out.println("A soma dos dados e "+soma);
		break;
	
	
	case 12: 
		do {
		int d12 = num.nextInt((12)+1);
		System.out.println
		("A sua rolagem foi " + d12 + "+" + "("+adic+") = "+(adic+d12));
		quant-=1;
		soma += (adic+d12);
	}while(quant!=0);
		System.out.println("A soma dos dados e "+soma);
	break;
	
	
	case 10: 
		do {
		int d10 = num.nextInt((10)+1);
		System.out.println
		("A sua rolagem foi " + d10 + "+" + "("+adic+") = "+(adic+d10));
		soma += (adic+d10);
		quant-=1;
	}while(quant!=0);
		System.out.println("A soma dos dados e "+soma);
	break;
	
	
	case 8:
		do {
			int d8 = num.nextInt((8)+1);
			System.out.println
			("A sua rolagem foi " + d8 + "+" + "("+adic+") = "+(adic+d8));
			quant-=1;
			soma += (adic+d8);
	}while(quant!=0);
		System.out.println("A soma dos dados e "+soma);
		break;
	
	
	case 6: 
		do {
			int d6 = num.nextInt((6)+1);
			System.out.println
			("A sua rolagem foi " + d6 + "+" + "("+adic+") = "+(adic+d6));
			quant-=1;
			soma += (adic+d6);
	}while(quant!=0);
		System.out.println("A soma dos dados e "+soma);
		break;
	
	
	case 4:
		do {
			int d4 = num.nextInt(4)+1;
			System.out.println
			("A sua rolagem foi " + d4 + "+" + "("+adic+") = "+(adic+d4));
			quant-=1;
			soma += (adic+d4);
			System.out.println("A soma dos dados e "+soma);
	}while(quant!=0);	
		break;
	
	
	default: System.out.println("Dado nao existe");
	}
	
    System.out.println();
	System.out.println("Deseja rolar novamente");
    
	conf = scanner.nextInt();
	System.out.println();
	}while (conf == 1);
	
	if(conf == 0){
		System.out.println();
	    System.out.println("Foi tarde, fudido");
	} else {
		System.out.println("Aprende a ler animal");
	}
    
	
	scanner.close();
	
	}
}
