package com.bling.service;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class TestClient {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		URL url = new URL("http://localhost:8888/ws?wsdl");
		QName sname= new QName("http://service.bling.com/","MyServiceImplService");
		Service service = Service.create(url,sname);
		IMyService ms = service.getPort(IMyService.class);
		System.out.println(ms.sum(10, 20));
		System.out.println(ms.minus(10, 20));
	}

}
