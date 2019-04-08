package Game;

import Enemies.Enemy;
import Player.Player;

import java.util.ArrayList;

public class Game {

    public void attack(IFight attacker, IFight defender){
        ((ILive)defender).reduceHealth(attacker.attack());
    }



}

