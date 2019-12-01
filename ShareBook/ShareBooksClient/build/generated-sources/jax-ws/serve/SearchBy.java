
package serve;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchBy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchBy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchatt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="searchvalue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchBy", propOrder = {
    "searchatt",
    "searchvalue"
})
public class SearchBy {

    protected String searchatt;
    protected String searchvalue;

    /**
     * Gets the value of the searchatt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchatt() {
        return searchatt;
    }

    /**
     * Sets the value of the searchatt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchatt(String value) {
        this.searchatt = value;
    }

    /**
     * Gets the value of the searchvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchvalue() {
        return searchvalue;
    }

    /**
     * Sets the value of the searchvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchvalue(String value) {
        this.searchvalue = value;
    }

}
