package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//most of this assignment is trying to read the existing code to understand how it works,
        //ask a classmate or instructor if you are unsure how the code works.

        Player player = new Player(); //generate a new player
        //create main game loop that continues until the player has no health
         while(player.getHealth() > 0){
             //generate a new enemy( the level of the enemy should be the player's level)
             Enemy enemy = new Enemy(player.getPlayerLevel());
             //create battle loop that should continue while both the player and enemy are alive
             while(player.getHealth() > 0 && enemy.getHealth() > 0){
                 //gets player's input on what to do (use one of the methods to do this)
                 player.menu(enemy);
                 //has the enemy take damage
                 enemy.takeDamage(player);
                 //has the player take damage
                 player.takeDamage(enemy);
             }

         }
        //once the player is dead print out the player's level and how much xp they had.
        System.out.println("You made it to level " +player.getPlayerLevel());
        System.out.println("You had "+player.getXp()+" xp");

    }
}
