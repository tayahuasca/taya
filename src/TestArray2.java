
public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		System.out.println("• Quelle est la moyenne du tableau ?");
		Double avg = (double) array[0];
		Integer sum = 0;
		for (Integer m = 0 ; m < array.length ; m++){
			sum += array[m];
			if (m!=0) avg = (double) sum/(m+1);
		}
		System.out.println(avg+".\n");
		
		System.out.println("• Quel est l’index dans le tableau de l’entier 15 ?");
		for (Integer i = 0 ; i < array.length ; i++){
			if (array[i] == 15){
				System.out.println("l'entier 15 est le "+(i+1)+"ème élément du tableau.\n");
				break;
			}
		}

		System.out.println("• Écrire un algorithme pour trouver le nombre d’entiers en doublon dans le tableau :");
		Integer nbDoublons = 0 ;
		for (Integer i = 0 ; i < array.length ; i++){
			for (Integer j = i+1 ; j < array.length ; j++){
				if (array[i] == array[j]) nbDoublons +=1;				
			}
		}
		System.out.println("Il y a "+(nbDoublons)+" doublons.\n");
	
	}

}
