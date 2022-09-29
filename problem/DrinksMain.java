package problem;

import java.util.ArrayList;

import java.util.List;

public class DrinksMain {

	public static void main(String[] args) {

		{

			Juice j = new Juice("오렌지 쥬스", 3500);
			j.drink();
			j.drink1();

			Coffee c = new Coffee("아이스 아메리카노", 2000);
			c.drink();
			c.drink1();

			Beer b = new Beer("테라", 3500);
			b.drink();
			b.drink1();

			Water w = new Water("삼다수", 2000);
			w.drink();
			w.drink1();

			Tea t = new Tea("옥수수수염차", 2000);
			t.drink();
			t.drink1();

		}

		System.out.println("=================================================");

		// 다형성

		{

			Drinks[] d = new Drinks[5];

			d[0] = new Juice("오렌지 쥬스", 3500);

			d[1] = new Coffee("아이스 아메리카노", 2000);

			d[2] = new Beer("테라", 3500);

			d[3] = new Water("삼다수", 2000);

			d[4] = new Tea("옥수수수염차", 2000);

			for (Drinks t : d) {

				t.drink();
				t.drink1();

			}

		}
		
		System.out.println("=================================================");
		
		{
			Drinks d0 = new Juice("오렌지 쥬스", 3500);
			Drinks d1 = new Coffee("아이스 아메리카노", 2000);
			Drinks d2 = new Beer("테라", 3500);
			Drinks d3 = new Water("삼다수", 2000);
			Drinks d4 = new Tea("옥수수수염차", 2000);
			
			d0.drink();
			d1.drink();
			d2.drink();
			d3.drink();
			d4.drink();
			
			d0.drink1();
			d1.drink1();
			d2.drink1();
			d3.drink1();
			d4.drink1();
		}

		System.out.println("=================================================");

		// Collection (ArrayList)

		{

			List<Drinks> list = new ArrayList<>();

			list.add(new Juice("오렌지 쥬스", 3500));

			list.add(new Coffee("아이스 아메리카노", 2000));

			list.add(new Beer("테라", 3500));

			list.add(new Water("삼다수", 2000));

			list.add(new Tea("옥수수수염차", 2000));

			for (Drinks t : list) {

				t.drink();

			}

		}

	}

}

abstract class Drinks {

	private String name;

	private int price;

	public Drinks() {

		name = "";

		price = 0;

	}

	public Drinks(String name, int price) {

		this.name = name;

		this.price = price;

	}

	public void drink() {

		System.out.printf("%s를 마십니다. 가격은 %d원 입니다.", name, price);

	}
	
	public abstract void drink1();

}

class Juice extends Drinks {

	public Juice(String name, int price) {

		super(name, price);

	}

	public void drink() {

		System.out.print("[JUICE]");

		super.drink();

		System.out.println();

	}

	@Override
	public void drink1() {
		System.out.println("[[JUICE]]");
	}

}

class Coffee extends Drinks {

	public Coffee(String name, int price) {

		super(name, price);

	}

	public void drink() {

		System.out.print("[COFFEE]");

		super.drink();

		System.out.println();

	}

	@Override
	public void drink1() {
		System.out.println("[[COFFEE]]");
	}

}

class Beer extends Drinks {

	public Beer(String name, int price) {

		super(name, price);

	}

	public void drink() {

		System.out.print("[BEER]");

		super.drink();

		System.out.println();

	}

	@Override
	public void drink1() {
		System.out.println("[[BEER]]");
	}

}

class Water extends Drinks {

	public Water(String name, int price) {

		super(name, price);

	}

	public void drink() {

		System.out.print("[WATER]");

		super.drink();

		System.out.println();

	}

	@Override
	public void drink1() {
		System.out.println("[[WATER]]");
	}

}

class Tea extends Drinks {

	public Tea(String name, int price) {

		super(name, price);

	}

	public void drink() {

		System.out.print("[TEA]");

		super.drink();

		System.out.println();

	}

	@Override
	public void drink1() {
		System.out.println("[[TEA]]");		
	}

}