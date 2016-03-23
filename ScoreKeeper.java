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
public class ScoreKeeper {

	private int gametotal;
	private int roundtotal;
	
	public ScoreKeeper() {
		gametotal = roundtotal = 0;
	}
	
	public void addToGameTotal() {
		gametotal += roundtotal;
		resetRoundTotal();
	}
	
	public void addToRoundTotal(int value) {
		roundtotal += value;
	}

	public void resetGameTotal() {
		gametotal = 0;
		resetRoundTotal();
	}

	public void resetRoundTotal() {
		roundtotal = 0;
	}

	public int getRoundTotal() {
		return roundtotal;
	}

	public int getGameTotal() {
		return gametotal;
	}
	
}


