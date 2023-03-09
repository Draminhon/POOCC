package murilo.aulaPOO;

import java.util.Scanner;

public class JogoVelha {

	public static void main(String[] args) {
		
        Oie novo = new Oie();
        int linha = 0, coluna = 0, vez = 0, resultado;
		
		Scanner scan = new Scanner(System.in);
		
		boolean verdadeiro = false;
		
		while(!verdadeiro) {
			
			System.out.println("Jogador 1 = X Jogador 2 = O");
			
			 if(novo.getVez()%2 != 0) {
				 System.out.println("Vez do jogador 1!");
				 novo.setEscolha('X');
				 novo.setVez(vez++);
			 }else if(novo.getVez()%2 == 0) {
				 System.out.println("Vez do jogador 2!");
				 novo.setEscolha('O');
				 novo.setVez(vez++);
			 }
			 
			 System.out.println("Digite a linha e coluna");
			 linha = scan.nextInt();
			 coluna = scan.nextInt();
			 
			 novo.preencher(linha-1, coluna-1);
			 novo.exibir();
			resultado =  novo.vencedor();
			
			if(resultado == 1) {
				verdadeiro = true;
			}else if (resultado == 2) {
				verdadeiro = true;
			}
			
			
			
		}
		
		
		
		
		
		
		
		scan.close();
		
		
	}

}
