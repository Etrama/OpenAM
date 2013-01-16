//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.14 at 08:50:29 AM PST 
//


package com.sun.identity.entitlement.xacml3.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for PolicyIdentifierListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyIdentifierListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}PolicyIdReference"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}PolicySetIdReference"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyIdentifierListType", propOrder = {
    "policyIdReferenceOrPolicySetIdReference"
})
public class PolicyIdentifierList {

    @XmlElementRefs({
        @XmlElementRef(name = "PolicyIdReference", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PolicySetIdReference", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<IdReference>> policyIdReferenceOrPolicySetIdReference;

    /**
     * Gets the value of the policyIdReferenceOrPolicySetIdReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyIdReferenceOrPolicySetIdReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyIdReferenceOrPolicySetIdReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link IdReference }{@code >}
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link IdReference }{@code >}
     * 
     * 
     */
    public List<JAXBElement<IdReference>> getPolicyIdReferenceOrPolicySetIdReference() {
        if (policyIdReferenceOrPolicySetIdReference == null) {
            policyIdReferenceOrPolicySetIdReference = new ArrayList<JAXBElement<IdReference>>();
        }
        return this.policyIdReferenceOrPolicySetIdReference;
    }

}
