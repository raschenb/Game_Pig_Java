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
public abstract class Player {
	
	protected PairOfDice pod;
	protected String name;
	protected ScoreKeeper sk;
	
	public Player(String name, PairOfDice pod) {
		this.name = name;
		this.pod = pod;
		sk = new ScoreKeeper();
	}
	
	public abstract boolean rollAgain();
	
	public boolean rollDice() {
		pod.roll();
		System.out.println(pod);
		if(pod.hasOneOne() == false) {
			sk.addToRoundTotal(pod.totalValue());
			if(sk.getRoundTotal() + sk.getGameTotal() >= 100) {
				return false;
			}
		} else if(pod.hasTwoOnes() == true) {
			System.out.println("You rolled two ones.");
			sk.resetGameTotal();
			return false;
		} else {
			System.out.println("You rolled a one.");
			sk.resetRoundTotal();
			return false;
		}
		return true;
	}
	
	public boolean isWinner() {
		if(sk.getGameTotal() >= 100) {
			return true;
		}
		return false;
	}

	public String getName() {
		return name;
	}
	
	public void endRound() {
		sk.addToGameTotal();
	}
	
	public int getGameTotal() {
		return sk.getGameTotal();
	}
	
}

