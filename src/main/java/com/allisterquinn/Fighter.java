package com.allisterquinn;

import java.util.ArrayList;
import java.util.List;

public class Fighter {

    // Should this be in its own structure? probably.
    private String name = "undefined";
    private int hp = 0;
    private int strength = 0;
    private int defence = 0;
    private int magic = 0;
    private int fortitude = 0;
    private int speed = 0;
    private int level = 0;
    private List<Ability> abilities;

    public List<Ability> getAbilities() {
        return abilities;
    }

    public String listAbilities() {
        return abilities.toString();
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public void addAbility(Ability ability) {
        abilities.add(ability);
    }

    public static class Builder {

        private String name = "undefined";
        private int hp = 0;
        private int strength = 0;
        private int level = 0;
        private List<Ability> abilities;

        public Builder() {
            abilities= new ArrayList<Ability>();
        }

        public Builder setName(String value) {
            name = value;
            return this;
        }

        public Builder setHp(int value) {
            hp = value;
            return this;
        }

        public Builder setStr(int value) {
            strength = value;
            return this;
        }

        public Builder setLevel(int value) {
            level = value;
            return this;
        }

        public Builder addAbility(Ability ability) {
            abilities.add(ability);
            return this;
        }

        public Fighter build() {
            return new Fighter(this);
        }
    }

    private Fighter(Builder builder) {
        name = builder.name;
        hp = builder.hp;
        strength = builder.strength;
        abilities = builder.abilities;
        level = builder.level;

        if (abilities.size() <= 0) {

            System.out.println("Warning, fighter must have at least one ability");
        }
    }

    public String toString() {
        return "name: " + name + ", hp: " + hp + ", strength: " + strength + ", defence: " + defence + ".";
    }

    public int getHp() {
        return hp;
    }

    public int getStrength() {
        return strength;
    }

    public int getDefence() {
        return defence;
    }

    public int getMagic() {
        return magic;
    }

    public int getFortitude() {
        return fortitude;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void useAbility(String choice) {
        for(Ability ability : abilities) {
            if (ability.getName().toLowerCase().equals(choice.toLowerCase())) {
                ability.Use();
            }
        }
    }

    public void modify(String modifier) {
        if (modifier == "die") {
            this.hp = 0;
        }
    }
}
