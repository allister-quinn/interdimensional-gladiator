package com.allisterquinn;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Fight {

    private Fighter player;
    private Fighter monster;
    boolean fightOver = false;

    public Fight(Fighter player, Fighter monster) {
        this.player = player;
        this.monster = monster;
    }

    void displayStats() {
        System.out.println("\n" + player.toString());
        System.out.println(monster.toString());
    }

    void start() {
        System.out.println( "\n*************** FIGHT ***************");

        while (!fightOver) {
            if (!gameOverCheck()) {
                displayStats();
                playerTurn();      
                displayStats();
            }
            if (!gameOverCheck()) {
                monsterTurn();    
                displayStats();
            }
        }

    }

    void playerTurn() {
        Scanner reader = new Scanner(System.in);  
        System.out.println("Select ability: ");
        System.out.println(player.listAbilities());
        String choice = reader.nextLine();
        player.useAbility(choice);
        monster.modify("die");
    }

    void monsterTurn() {
        System.out.println("Monster attacks...");
        List<Ability> abilities = monster.getAbilities();
        int a = new Random().nextInt(abilities.size());
        monster.useAbility(abilities.get(a).getName());
    }

    boolean gameOverCheck() {
        if (player.getHp() <= 0) {
            System.out.println("Player is dead...");
            fightOver = true;
            return true;
        }
        if (monster.getHp() <= 0) {
            System.out.println(monster.getName() + " is dead...");
            fightOver = true;
            return true;
        }
        return false;
    }

    void selectAbility() {

    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}
