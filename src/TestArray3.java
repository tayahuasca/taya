import java.util.Scanner;

public class TestArray3 {
	
	private static Scanner option;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		option = new Scanner(System.in);
		System.out.println("• Faire un programme avec le menu suivant :");
		System.out.println("1. Ajouter un nombre.");
		System.out.println("2. Afficher les nombres existants.\n");	
		
		Integer[] array = {};
		
		System.out.println("Choisissez vite mais choisissez bien :");
		System.out.print(">>>");
		String choixStr = option.nextLine();
		Integer choix = 0 ;
		while (choix == 0)try {
			new Integer(Integer.parseInt(choixStr));
			choix = Integer.parseInt(choixStr);
			if (choix == 1){
				System.out.println("Entrez le nombre à ajouter :");
				System.out.print(">>>");
				String addStr = option.nextLine();
				try {
					new Integer(Integer.parseInt(addStr));
					Integer add = Integer.parseInt(addStr);
					array[array.length+1] = add;
				} finally{
					System.out.print("Tapez au moins un nombre... \n>>>");
					addStr = option.nextLine();
				}
			}
			else if (choix == 2)System.out.println(array);
			else {
				while ((choix != 1) || (choix != 2)){
					System.out.print("tapez 1 ou 2 : \n>>>");
					choixStr = option.nextLine();
				}
			} 
		}finally {
			while ((choix != 1) || (choix != 2)){
				System.out.print("Vous devez choisir entre 1 et 2 \n>>>");
				choixStr = option.nextLine();
				try {
					new Integer(Integer.parseInt(choixStr));
					choix = Integer.parseInt(choixStr);
				}finally{
					System.out.print("Tapez au moins un nombre... \n>>>");
					choixStr = option.nextLine();
				}
			}	
		}
	}
}
		
