package model;

import strategies.attack.AttackStrategy;
import strategies.defense.DefenseStrategy;

public class Character {
	private final String type;
	private final AttackStrategy attackStrategy;
	private final DefenseStrategy[] defenseStrategies;

	public Character(String type, AttackStrategy attackStrategy, DefenseStrategy[] defenseStrategies) {
		this.type = type;
		this.attackStrategy = attackStrategy;
		this.defenseStrategies = defenseStrategies;
	}

	public void attack() {
		attackStrategy.attack(this.type);
	}

	public void defend() {
		for (DefenseStrategy defense : defenseStrategies) {
			defense.defend(this.type);
		}
	}
}
