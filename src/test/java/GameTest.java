import Characters.Dwarve;
import Characters.Knight;
import Enemies.Enemy;
import Enemies.Troll;
import Game.Game;
import Rooms.Room;
import Weapons.Hammer;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;
import Game.IFight;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Dwarve dwarve;
    Knight knight;
    Troll troll;
    Sword sword;
    Hammer hammer;
    Game game;
    Room room;

    @Before
    public void before(){
        sword = new Sword(10);
        hammer = new Hammer(10);
        knight = new Knight("John",30,sword);
        dwarve = new Dwarve("Joe", 30,hammer);
        troll = new Troll(100,sword);
        game = new Game();
        room = new Room("Gold", troll);
    }

//    @Test
//    public void canFight(){
//        game.fight(knight,troll);
//        assertEquals(20,knight.getHealth());
//        assertEquals(90,troll.getHealth());
//    }
//
//    @Test
//    public void canGetEnemyFromRoom(){
//        Enemy enemy = room.getEnemy();
//        game.fight(knight, enemy);
//        assertEquals(20,knight.getHealth());
//    }


    @Test
    public void canAttackKnight(){
        game.attack(knight,troll);
        assertEquals(90,troll.getHealth());
    }

    @Test
    public void canAttackTroll() {
        game.attack(troll,knight);
        assertEquals(20,knight.getHealth());
    }


    @Test
    public void canHaveArrayList(){
        ArrayList<IFight> fighters = new ArrayList<>();
        fighters.add(knight);
        fighters.add(dwarve);

        for (IFight fighter: fighters){
            game.attack(fighter,troll);
        }

        assertEquals(80, troll.getHealth());

    }

    @Test
    public void canAttackArrayList(){
        ArrayList<IFight> fighters = new ArrayList<>();
        fighters.add(knight);
        fighters.add(dwarve);

        ArrayList<IFight> enemyFighters = new ArrayList<>();
        enemyFighters.add(troll);

        for (IFight enemyFighter: enemyFighters){
            for(IFight fighter: fighters ){
                game.attack(enemyFighter,fighter);
            }
        }

        assertEquals(20, knight.getHealth());
        assertEquals(20, dwarve.getHealth());


    }



    }
