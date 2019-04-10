/**
 * 
 */
package fr.operateurs.console;

import java.util.Scanner;

/**
 * @author Taya
 *
 */
public class OperateursApp {

	private static Scanner questionUser;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		questionUser = new Scanner(System.in);
		
		System.out.println("***** Application Opérateurs *****");
		System.out.println("Veuillez saisir le premier nombre...");
		System.out.print(">>> ");
		Integer n1 = questionUser.nextInt();
		
		System.out.println("Veuillez saisir le second nombre...");
		System.out.print(">>> ");
		Integer n2 = questionUser.nextInt();
		
		System.out.println("<nombre_"+n1+"> + <nombre_"+n2+"> = < "+(n1+n2)+">");
		System.out.println("<nombre_"+n1+"> - <nombre_"+n2+"> = < "+(n1-n2)+">");
		System.out.println("<nombre_"+n1+"> * <nombre_"+n2+"> = < "+n1*n2+">");
		System.out.println("<nombre_"+n1+"> / <nombre_"+n2+"> = < "+n1/n2+">");
		System.out.println("<nombre_"+n1+"> % <nombre_"+n2+"> = < "+n1%n2+">");
	}

}
