
package serve;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateBook complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateBook"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ISBN" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BAssignTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateBook", propOrder = {
    "isbn",
    "bAssignTo",
    "bStatus"
})
public class UpdateBook {

    @XmlElement(name = "ISBN")
    protected int isbn;
    @XmlElement(name = "BAssignTo")
    protected String bAssignTo;
    @XmlElement(name = "BStatus")
    protected String bStatus;

    /**
     * Gets the value of the isbn property.
     * 
     */
    public int getISBN() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     */
    public void setISBN(int value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the bAssignTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBAssignTo() {
        return bAssignTo;
    }

    /**
     * Sets the value of the bAssignTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBAssignTo(String value) {
        this.bAssignTo = value;
    }

    /**
     * Gets the value of the bStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBStatus() {
        return bStatus;
    }

    /**
     * Sets the value of the bStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBStatus(String value) {
        this.bStatus = value;
    }

}
