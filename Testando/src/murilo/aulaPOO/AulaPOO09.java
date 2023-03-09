package murilo.aulaPOO;

public class AulaPOO09 {

	public static void main(String[] args) {
		
		
		int[] vetor1 = {1,2,3,4,5,6,7,8,9,10};
		int vetor2 [] = {10,20,30,40,50,60,70,80,90,100};
		int[] vetor3 = new int[20];
		
		int j = 0;
		int k = 0;
		for(int i = 0; i<vetor3.length; i++) {
				  if(i % 2 == 0) {
					  vetor3[i] = vetor1[j];
					  j++;
					 
				  }else if(i%2!=0) {
					   
					  vetor3[i] = vetor2[k];
					  k++;
				  }
			 
			
		}
		
		System.out.println("Vetor 1");
		for(int i = 0; i<vetor1.length; i++) {
			System.out.print(vetor1[i] + " ");
		}
		System.out.println("\nVetor 2");
		
			for(int i = 0; i<vetor2.length; i++) {
				System.out.print(vetor2[i] + " ");
			}
			System.out.println("\nVetor 3");
				for(int i = 0; i<vetor3.length; i++) {
					System.out.print(vetor3[i] + " ");
				}
		
		
		
		
		
		
	}
	
	
}
