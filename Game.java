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

public class Game {

	private Player p1;
	private Player p2;
	
	public Game() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("How many human players? [1/2]");
		int i = s.nextInt();
		while(i != 1 && i != 2) {
			System.out.println("How many human players? [1/2]");
			i = s.nextInt();
		}
		PairOfDice pod = new PairOfDice();
		p1 = new HumanPlayer("Player 1", pod);
		if(i == 2) {
			p2 = new HumanPlayer("Player 2", pod);
		} else {
			p2 = new ComputerPlayer("Computer Player 2", pod);
		}
		
	}
	
	public void play() {
		
		Player curplayer = p1;
		boolean result = false, again = false;
		
		while(p1.isWinner() == false && p2.isWinner() == false) {
			result = curplayer.rollDice();
			if(result == true) {
				again = curplayer.rollAgain();
			} else {
				again = false;
			}
			while(again == true && curplayer.isWinner() == false) {
				result = curplayer.rollDice();
				if(result == true) {
					again = curplayer.rollAgain();
				} else {
					again = false;
				}			
			}
			curplayer.endRound();
			System.out.println("Total Score of " + curplayer.getName() + ": " + curplayer.getGameTotal());
			System.out.println("*************");
			if(!curplayer.isWinner()) {
				System.out.println("Switching players");
			}
			if(curplayer == p1) {
				curplayer = p2;
			} else {
				curplayer = p1;
			}	
		}
		
		if(p1.isWinner()) {
			System.out.println(p1.getName() + " wins!");
		} else {
			System.out.println(p2.getName() + " wins!");
		}
	}
	
	public static void main(String[] args) {
		Game g = new Game();
		g.play();
	}
	
}
