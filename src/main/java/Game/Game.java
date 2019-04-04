package Game;

import Enemies.Enemy;
import Player.Player;

import java.util.ArrayList;

public class Game {

    public void attack(IFight attacker, IFight defender){
        ((ILive)defender).reduceHealth(attacker.attack());
    }


    public void attackDamage(){


    }

    public int checkHealth() {
        return 1;
    }

//    public void checkLife(ArrayList<ILive> chars){
//
//       for( ILive character :chars)
//        {
//            if(character.getHealth() <= 0) {
//
//            }
//        }
//    }

//  A player has is assigned a character
//    player plays character
//    player's health reduces by damage level of the opponent plus losses'



}

