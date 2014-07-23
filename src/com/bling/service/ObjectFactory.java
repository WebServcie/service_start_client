
package com.bling.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bling.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Sum_QNAME = new QName("http://service.bling.com/", "sum");
    private final static QName _Minus_QNAME = new QName("http://service.bling.com/", "minus");
    private final static QName _SumResponse_QNAME = new QName("http://service.bling.com/", "sumResponse");
    private final static QName _MinusResponse_QNAME = new QName("http://service.bling.com/", "minusResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bling.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MinusResponse }
     * 
     */
    public MinusResponse createMinusResponse() {
        return new MinusResponse();
    }

    /**
     * Create an instance of {@link SumResponse }
     * 
     */
    public SumResponse createSumResponse() {
        return new SumResponse();
    }

    /**
     * Create an instance of {@link Minus }
     * 
     */
    public Minus createMinus() {
        return new Minus();
    }

    /**
     * Create an instance of {@link Sum }
     * 
     */
    public Sum createSum() {
        return new Sum();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bling.com/", name = "sum")
    public JAXBElement<Sum> createSum(Sum value) {
        return new JAXBElement<Sum>(_Sum_QNAME, Sum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Minus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bling.com/", name = "minus")
    public JAXBElement<Minus> createMinus(Minus value) {
        return new JAXBElement<Minus>(_Minus_QNAME, Minus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bling.com/", name = "sumResponse")
    public JAXBElement<SumResponse> createSumResponse(SumResponse value) {
        return new JAXBElement<SumResponse>(_SumResponse_QNAME, SumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bling.com/", name = "minusResponse")
    public JAXBElement<MinusResponse> createMinusResponse(MinusResponse value) {
        return new JAXBElement<MinusResponse>(_MinusResponse_QNAME, MinusResponse.class, null, value);
    }

}
