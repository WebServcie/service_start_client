
package com.bling.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sumResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sumResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sumResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sumResponse", propOrder = {
    "sumResult"
})
public class SumResponse {

    protected int sumResult;

    /**
     * Gets the value of the sumResult property.
     * 
     */
    public int getSumResult() {
        return sumResult;
    }

    /**
     * Sets the value of the sumResult property.
     * 
     */
    public void setSumResult(int value) {
        this.sumResult = value;
    }

}
