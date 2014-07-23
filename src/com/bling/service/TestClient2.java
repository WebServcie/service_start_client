package com.bling.service;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

public class TestClient2 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		URL url = new URL("http://localhost:7777/ws?wsdl");
		QName sname= new QName("http://service.bling.com/","MyServiceImplService");
		MyServiceImplService msis = new MyServiceImplService(url,sname);
		IMyService ms = msis.getMyServiceImplPort();
		System.out.println(ms.minus(20, 10));
	}

}
