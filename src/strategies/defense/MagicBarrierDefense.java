package strategies.defense;

public class MagicBarrierDefense implements DefenseStrategy {
	@Override
	public void defend(String type) {
		System.out.println(type + " creating a magic barrier for defense!");
	}
}
