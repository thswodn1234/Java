package com.ruby.java.ch07.abstraction;

public class MessengerTest {
	public static void main(String[] args) {
		
		Messenger test = new Messenger() {
			
			@Override
			public void setMessage(String msg) {
				System.out.println("test에서 메시지를 설정합니다 : " + msg);
			}
			
			@Override
			public String getMessage() {
				return "test";
			}
		};
		
		System.out.println(test.getMessage());
		test.setMessage("have a nice day!");
		
//		IphoneMessenger iphone = new IphoneMessenger();
//		GalaxyMessenger galaxy = new GalaxyMessenger();
//
//		System.out.println("메신저 최소 문자 크기" + Messenger.MIN_SIZE);
//		System.out.println("메신저 최대 문자 크기" + Messenger.MAX_SIZE);
//
//		iphone.setLogin(true);
//		iphone.getMessage();
//		iphone.setMessage("hello");
//		iphone.clearMessage();
//		iphone.draw_textBox();
//		iphone.draw_submitButton();
//
//		galaxy.setLogin(true);
//		galaxy.getMessage();
//		galaxy.setMessage("hi");
//		galaxy.changeKeyboard();
//		galaxy.fileDownload();
//		galaxy.fileUpload();
	}
}
