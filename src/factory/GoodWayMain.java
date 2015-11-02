package factory;

import java.util.Scanner;

public class GoodWayMain {
	public static void main(String[] args) {
		
		EnemyShipFactory factory = new EnemyShipFactory();
		
		EnemyShip theEnemy = null;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What type of ship? (U / R / B)");
		
		if (userInput.hasNext()) {
			String typeOfShip = userInput.nextLine();
			theEnemy = factory.makeEnemyShip(typeOfShip);
		}
		
		if (theEnemy != null) {
			doStuffEnemy(theEnemy);	
		}

	}
	
	public static void doStuffEnemy(EnemyShip ship) {
		ship.displayShip();
		ship.followHeroShip();
		ship.enemyShipShoots();
	}
}
