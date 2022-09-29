package problem;

public class Game {
	public static void main(String[] args) {
		
	
		
		Unit[] u = new Unit[4];
		u[0] = new Tank("tank", "포");
		u[1] = new Airplane("airplane", "미사일");
		u[2] = new Submarine("submarine", "어뢰");
		u[3] = new Soldier("soldier", "총");
		
		for (Unit i : u) {

			i.attack();

		}

	
	}
}

class Unit {
	private String name;
	private String weapon;
	
	public Unit() {

		name = "";

		weapon = "";

	}
	
	public Unit(String name, String weapon) {

		this.name = name;

		this.weapon = weapon;

	}
	
	public void attack() {
		System.out.printf("%s는 %s(를/을) 쏜다", name, weapon);
	}
		
}

class Tank extends Unit {
	
	public Tank(String name, String weapon) {

		super(name, weapon);

	}

	public void attack() {

		System.out.print("[Tank]");

		super.attack();

		System.out.println();
		}
}

class Airplane extends Unit {
	
	public Airplane(String name, String weapon) {

		super(name, weapon);

	}

	public void attack() {

		System.out.print("[Airplane]");

		super.attack();

		System.out.println();
		}
}

class Submarine extends Unit {
	
	public Submarine(String name, String weapon) {

		super(name, weapon);

	}

	public void attack() {

		System.out.print("[Submarine]");

		super.attack();

		System.out.println();
		}
}
class Soldier extends Unit {
	
	public Soldier(String name, String weapon) {

		super(name, weapon);

	}

	public void attack() {

		System.out.print("[Soldier]");

		super.attack();

		System.out.println();
		}
}


