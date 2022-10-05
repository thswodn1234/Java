package com.ruby.java.ch07.abstraction;

public class IphoneMessenger extends GraphicIOS implements Messenger {
	
	public String getMessage() {
		return "iphone";
	}
	
	public void setMessage(String msg) {
		System.out.println("iphone에서 메시지를 설정합니다 : " + msg);
	}
	
	public void clearMessage() {
		System.out.println("좌우로 흔들어 문자열을 지웁니다.");
	}

}
