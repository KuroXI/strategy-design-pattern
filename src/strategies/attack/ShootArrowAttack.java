package strategies.attack;

public class ShootArrowAttack implements AttackStrategy {
	@Override
	public void attack(String type) {
		System.out.println(type + " shoots an arrow!");
	}
}
