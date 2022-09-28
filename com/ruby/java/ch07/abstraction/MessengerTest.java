package com.ruby.java.ch07.abstraction;

public class MessengerTest {
	public static void main(String[] args) {
		
		IphoneMessenger iphone = new IphoneMessenger();
		GalaxyMessenger galaxy = new GalaxyMessenger();
		
//		Messenger m = new Messenger();
		Messenger.getConnection();
		System.out.println(iphone.getMessage());
		
		System.out.println("메신저 최소 문자크기 ");
	}
}
