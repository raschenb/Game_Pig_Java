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
public class ComputerPlayer extends Player {

	public ComputerPlayer(String name, PairOfDice pod) {
		super(name, pod);
	}
	
	@Override
	public boolean rollAgain() {
		if(sk.getRoundTotal() < 20) {
			return true;
		}
		return false;
	}

}