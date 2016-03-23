/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pig;

/**
 *
 * @author Rob's
 */
import java.util.Scanner;

public class HumanPlayer extends Player {

	public HumanPlayer(String name, PairOfDice pod) {
		super(name, pod);
	}
	
	@Override
	public boolean rollAgain() {
		Scanner s = new Scanner(System.in);
		System.out.println("Would you like to roll again [y/n]? ");
		String response = s.nextLine();
		while(!response.equals("y") && !response.equals("n")) {
			System.out.println("Would you like to roll again [y/n]? ");
			response = s.nextLine();			
		}
		if(response.equals("y")) {
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String[] args) {
		HumanPlayer hp = new HumanPlayer("Bob", new PairOfDice());
		System.out.println(hp.rollAgain());
	}
	

}
