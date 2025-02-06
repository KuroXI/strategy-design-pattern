package strategies.defense;

public class ShieldDefense implements DefenseStrategy {
	@Override
	public void defend(String type) {
		System.out.println(type + " using a shield to defend!");
	}
}
