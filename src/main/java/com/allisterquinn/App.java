package com.allisterquinn;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 

{
    public static final int MONSTERS = 5;
    public static void main( String[] args )
    {
        AbilityGenerator abilityGenerator = new AbilityGenerator();
        FighterGenerator fighterGenerator = new FighterGenerator();
        List<Fighter> fighters = fighterGenerator.generateMonsters();
        Fighter player = fighterGenerator.generatePlayer();

        for (int i = 0 ; i < MONSTERS; i++) {
            Fight fight = new Fight(player, fighters.get(i));
            fight.start();
        }
    }
}
