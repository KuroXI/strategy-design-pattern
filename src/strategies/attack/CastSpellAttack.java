package strategies.attack;

public class CastSpellAttack implements AttackStrategy {
	@Override
	public void attack(String type) {
		System.out.println(type + " casts a spell!");
	}
}
