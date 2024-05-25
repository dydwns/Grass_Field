package com.example.demo;

public class TVUsers_1 {

	public static void main(String[] args) {
		TV tv = (TV) new SamsungTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}

}
