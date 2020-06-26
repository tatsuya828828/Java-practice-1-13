
public class Hero extends Character {
	// このクラス内でのみ変更を許可、しかしこのクラスのメソッド経由なら変更可能
	private int hp;
	private String name;
	Sword Sword;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前がnullである、処理を中断");
		}
		if (name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎる、処理を中断");
		}
		if (name.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎる、処理を中断");
		}
		this.name = name;
	}

	public void bye() {
		System.out.println("勇者は別れを告げた");
	}

	// このクラス内のみ呼び出し可能にする
	private void die() {
		System.out.println(this.name+"は死んでしまった！");
		System.out.println("GAMEOVERです。");
	}

	void sleep() {
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
