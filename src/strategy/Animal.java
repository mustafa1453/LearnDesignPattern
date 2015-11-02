package strategy;

public class Animal {
	
	public Flys flyingType;
	
	public String tryToFly() {
		return flyingType.fly();
	}
	
	public void setFlyAbility(Flys newFlyType) {
		flyingType = newFlyType;
	}
	
	
}
