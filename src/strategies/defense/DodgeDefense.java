package strategies.defense;

public class DodgeDefense implements DefenseStrategy {
	@Override
	public void defend(String type) {
		System.out.println(type + " dodging to avoid attack!");
	}
}
