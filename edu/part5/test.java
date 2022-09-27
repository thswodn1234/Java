package edu.part5;

public class test {

	public static void main(String[] args) {
		
		Armor armor = new Armor();
		
		System.out.println("name : " + armor.getName());
		
		Armor armor1 = new Armor("홍길동");
		System.out.println("name : " + armor1.getName() );
		
		Armor armor2 = new Armor("홍이동", 100, 100, "Red", true);
		System.out.println("name : " + armor2.getName());
		
		
		System.out.println(armor2.toString());
	}

}
