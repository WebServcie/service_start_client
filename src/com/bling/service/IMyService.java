
package com.bling.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IMyService", targetNamespace = "http://service.bling.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IMyService {


    /**
     * 
     * @param b
     * @param a
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "sumResult", targetNamespace = "")
    @RequestWrapper(localName = "sum", targetNamespace = "http://service.bling.com/", className = "com.bling.service.Sum")
    @ResponseWrapper(localName = "sumResponse", targetNamespace = "http://service.bling.com/", className = "com.bling.service.SumResponse")
    @Action(input = "http://service.bling.com/IMyService/sumRequest", output = "http://service.bling.com/IMyService/sumResponse")
    public int sum(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

    /**
     * 
     * @param b
     * @param a
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "minusResult", targetNamespace = "")
    @RequestWrapper(localName = "minus", targetNamespace = "http://service.bling.com/", className = "com.bling.service.Minus")
    @ResponseWrapper(localName = "minusResponse", targetNamespace = "http://service.bling.com/", className = "com.bling.service.MinusResponse")
    @Action(input = "http://service.bling.com/IMyService/minusRequest", output = "http://service.bling.com/IMyService/minusResponse")
    public int minus(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

}
