package factory;

import java.util.Scanner;

public class BadWayMain {

	public static void main(String[] args) {
		
		EnemyShip theEnemy = null;
		
		Scanner userInput = new Scanner(System.in);
		
		String enemyShipOption = "";
		
		System.out.println("What type of ship? (U / R)");
		
		if (userInput.hasNext()) {
			enemyShipOption = userInput.nextLine();
		}
		
		if (enemyShipOption.equals("U")) {
			theEnemy = new UFOEnemyShip();
		} else if (enemyShipOption.equals("R")) {
			theEnemy = new RocketEnemyShip();
		}
		
		doStuffEnemy(theEnemy);

	}
	
	public static void doStuffEnemy(EnemyShip ship) {
		ship.displayShip();
		ship.followHeroShip();
		ship.enemyShipShoots();
	}

}
