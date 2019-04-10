
public class TestArray1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		System.out.println("• Afficher l’ensemble des éléments du tableau grâce à une boucle :");
		for (Integer n=0 ; n< array.length ; n++){
			if (n== array.length -1){
				System.out.println(array[n]+".\n");
				break;
			}
			System.out.print(array[n]+", ");
		}
		
		System.out.println("• Afficher l’ensemble des éléments dans l’ordre inverse du tableau :");
		for (Integer n= array.length-1 ; n >= 0 ; n--){
			if (n== 0){
				System.out.println(array[n]+".\n");
				break;
			}
			System.out.print(array[n]+", ");
		}
		
		System.out.println("• Afficher uniquement les entiers supérieurs à 3 :");
		for (Integer lastN = array.length -1 ; lastN >= 0 ; lastN --){
			if (array[lastN]>3){
				for (Integer n=0 ; n < array.length ; n++ ){
					if (array[n] >3 && array[n] != array[lastN])System.out.print(array[n]+", ");
				}
				System.out.println(array[lastN]+".");
				break;
			}			
		}	
		
		System.out.println("• Afficher uniquement les entiers pairs :");
		for (Integer lastN = array.length -1 ; lastN >= 0 ; lastN --){
			if (array[lastN]%2 ==0){
				for (Integer n=0 ; n < array.length ; n++ ){
					if (array[n] %2 == 0 && array[n] != array[lastN])System.out.print(array[n]+", ");
				}
				System.out.println(array[lastN]+".\n");
				break;
			}			
		}
		
		System.out.println("• Afficher le plus grand élément du tableau :");
		Integer maxN=array[0];
		for (Integer n = 0 ; n < array.length ; n++){
			if (array[n] >= maxN) maxN = array[n];
		}
		System.out.println(maxN+".\n");
		
		System.out.println("• Afficher le plus petit élément du tableau :");
		Integer minN=array[0];
		for (Integer n = 0 ; n < array.length ; n++){
			if (array[n] <= minN) minN = array[n];
		}
		System.out.println(minN+".\n");
	}
}
