package com.bling.service;

public class TestClient2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyServiceImplService msis = new MyServiceImplService();
		IMyService ms = msis.getMyServiceImplPort();
		System.out.println(ms.minus(20, 10));
	}

}
