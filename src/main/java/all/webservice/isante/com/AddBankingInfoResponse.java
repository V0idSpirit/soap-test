//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.21 at 02:08:47 PM WAT 
//


package all.webservice.isante.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceStatus" type="{http://com.isante.webservice.all}serviceStatus"/>
 *         &lt;element name="bankingInfo" type="{http://com.isante.webservice.all}bankingInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceStatus",
    "bankingInfo"
})
@XmlRootElement(name = "addBankingInfoResponse")
public class AddBankingInfoResponse {

    @XmlElement(required = true)
    protected ServiceStatus serviceStatus;
    @XmlElement(required = true)
    protected BankingInfo bankingInfo;

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStatus }
     *     
     */
    public ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStatus }
     *     
     */
    public void setServiceStatus(ServiceStatus value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the bankingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BankingInfo }
     *     
     */
    public BankingInfo getBankingInfo() {
        return bankingInfo;
    }

    /**
     * Sets the value of the bankingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankingInfo }
     *     
     */
    public void setBankingInfo(BankingInfo value) {
        this.bankingInfo = value;
    }

}
