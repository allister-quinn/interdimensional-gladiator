package com.allisterquinn;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class FighterGenerator {

    public List<Fighter> generateMonsters() {
        System.out.println( "Generating monsters..." );
        List<Fighter> fighters = new ArrayList<Fighter>(); 

        fighters.add(
            new Fighter.Builder()
            .setName("Rat")
            .setHp(100)
            .setStr(10)
            .setLevel(1)
            .addAbility(new Ability("Bash", 1))
            .build());

        fighters.add(
            new Fighter.Builder()
            .setName("Skeleton")
            .setHp(100)
            .setStr(10)
            .setLevel(2)
            .addAbility(new Ability("Bash", 1))
            .build());

        fighters.add(
            new Fighter.Builder()
            .setName("Wolf")
            .setHp(100)
            .setStr(10)
            .setLevel(3)
            .addAbility(new Ability("Bash", 1))
            .build());

        fighters.add(
            new Fighter.Builder()
            .setName("Bear")
            .setHp(100)
            .setStr(10)
            .setLevel(4)
            .addAbility(new Ability("Bash", 1))
            .build());

        fighters.add(
            new Fighter.Builder()
            .setName("Baby Dragon")
            .setHp(100)
            .setStr(10)
            .setLevel(5)
            .addAbility(new Ability("Bash", 1))
            .build());

        return fighters;
    }

    public Fighter generatePlayer() {
        Fighter player = 
        new Fighter.Builder()
        .setName("Player")
        .setHp(100)
        .setStr(10)
        .addAbility(new Ability("Bash", 1))
        .addAbility(new Ability("Die", 1))
        .build();
        return player;
    }
}
