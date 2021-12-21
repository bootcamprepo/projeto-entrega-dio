package principal;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		//JUST A STUPID PROJECT . ITS SIMPLE: MUTIPLES BY 3 IF IS ODD OR 2 IF IS EVEN
		//USING ARRAYS IN JAVA
		
		int[] vectors = new int[10];
		int[] vectorsNew = new int[10];
		Random randomizer = new Random();
		
		
		for(int i =0;i<vectors.length; i++) {
			vectors[i] = randomizer.nextInt(2048);			
		}		

		for(int x=0 ; x< vectors.length; x++) {
			
			int s = vectors[x];
			if(s%2==0) {
				s*=2;
			}else {
				s*=3;
			}			
			vectorsNew[x]=s;			
		}		
		
		for(int z=0 ; z < vectorsNew.length; z++) {
			
			System.out.print("vectors: " + vectors[z] + " \t\t New vector: " + vectorsNew[z]);
			System.out.println();
		}
	}
}
