
public class Hero extends Character {
	int hp = 100;
	String name;
	Sword Sword;

	public void bye() {
		System.out.println("勇者は別れを告げた");
	}

	public void die() {
		System.out.println(this.name+"は死んでしまった！");
		System.out.println("GAMEOVERです。");
	}

	public void sleep() {
		this.hp = 100;
		System.out.println(this.name+"は眠って回復した");
	}

	public void attack(Monster m) {
		System.out.println(this.name+"の攻撃");
		System.out.println("モンスターに10のダメージ！");
		System.out.println("モンスターから反撃、2のダメージ！");
		this.hp -= 2;
		if (this.hp <= 0) {
			this.die();
		}
	}
}
