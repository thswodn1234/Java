package test01;


public class DrinksAbMain{
	public static void main(String[] args) {
		DrinksAb d0 = new Juice();
		juice.Drinks()
	}
}

abstract class DrinksAb {
	private String name;
	private int price;
	
	public DrinksAb() {

		name = "";

		price = 0;

	}

	public DrinksAb(String name, int price) {

		this.name = name;

		this.price = price;

	}
	
	public abstract void Drinks(String name, int price);
}

class Juice extends DrinksAb {
	public void Drinks(String name, int price) {
		System.out.printf("%s를 마십니다. 가격은 %d원 입니다.", name, price);
	}
}
class Coffee extends DrinksAb {
	public void Drinks(String name, int price) {
		System.out.printf("%s를 마십니다. 가격은 %d원 입니다.", name, price);
	}
}
class Beer extends DrinksAb {
	public void Drinks(String name, int price) {
		System.out.printf("%s를 마십니다. 가격은 %d원 입니다.", name, price);
	}
}
class Water extends DrinksAb {
	public void Drinks(String name, int price) {
		System.out.printf("%s를 마십니다. 가격은 %d원 입니다.", name, price);
	}
}
class Tea extends DrinksAb {
	public void Drinks(String name, int price) {
		System.out.printf("%s를 마십니다. 가격은 %d원 입니다.", name, price);
	}
}



