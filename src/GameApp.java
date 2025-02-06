import model.Character;
import strategies.attack.AttackStrategy;
import strategies.attack.CastSpellAttack;
import strategies.attack.ShootArrowAttack;
import strategies.attack.SwingSwordAttack;
import strategies.defense.DefenseStrategy;
import strategies.defense.DodgeDefense;
import strategies.defense.MagicBarrierDefense;
import strategies.defense.ShieldDefense;

public class GameApp {
  public static void main(String[] args) {
	  AttackStrategy knightAttackStrategy = new SwingSwordAttack();
		AttackStrategy wizardAttackStrategy = new CastSpellAttack();
		AttackStrategy archerAttackStrategy = new ShootArrowAttack();

	  DefenseStrategy[] knightDefenseStrategy = { new ShieldDefense(), new DodgeDefense(), new MagicBarrierDefense() };
    DefenseStrategy[] wizardDefenseStrategy = { new MagicBarrierDefense() };
		DefenseStrategy[] archerDefenseStrategy = { new DodgeDefense() };

    Character knight = new Character("Knight", knightAttackStrategy, knightDefenseStrategy);
	  Character wizard = new Character("Wizard", wizardAttackStrategy, wizardDefenseStrategy);
	  Character archer = new Character("Archer", archerAttackStrategy, archerDefenseStrategy);

		knight.attack();
		knight.defend();

	  System.out.println();

		wizard.attack();
		wizard.defend();

	  System.out.println();

		archer.attack();
		archer.defend();
  }
}
