
package serve;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddBook complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddBook"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ISBN" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BookTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BookDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PublisherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PublisherYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Categury" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserFK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BookStatuse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BAssignTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddBook", propOrder = {
    "isbn",
    "bookTitle",
    "bookDesc",
    "publisherName",
    "publisherYear",
    "categury",
    "userFK",
    "bookStatuse",
    "bAssignTo",
    "author"
})
public class AddBook {

    @XmlElement(name = "ISBN")
    protected int isbn;
    @XmlElement(name = "BookTitle")
    protected String bookTitle;
    @XmlElement(name = "BookDesc")
    protected String bookDesc;
    @XmlElement(name = "PublisherName")
    protected String publisherName;
    @XmlElement(name = "PublisherYear")
    protected int publisherYear;
    @XmlElement(name = "Categury")
    protected String categury;
    @XmlElement(name = "UserFK")
    protected String userFK;
    @XmlElement(name = "BookStatuse")
    protected String bookStatuse;
    @XmlElement(name = "BAssignTo")
    protected String bAssignTo;
    @XmlElement(name = "Author")
    protected String author;

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
     * Gets the value of the bookTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * Sets the value of the bookTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookTitle(String value) {
        this.bookTitle = value;
    }

    /**
     * Gets the value of the bookDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookDesc() {
        return bookDesc;
    }

    /**
     * Sets the value of the bookDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookDesc(String value) {
        this.bookDesc = value;
    }

    /**
     * Gets the value of the publisherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherName() {
        return publisherName;
    }

    /**
     * Sets the value of the publisherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherName(String value) {
        this.publisherName = value;
    }

    /**
     * Gets the value of the publisherYear property.
     * 
     */
    public int getPublisherYear() {
        return publisherYear;
    }

    /**
     * Sets the value of the publisherYear property.
     * 
     */
    public void setPublisherYear(int value) {
        this.publisherYear = value;
    }

    /**
     * Gets the value of the categury property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategury() {
        return categury;
    }

    /**
     * Sets the value of the categury property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategury(String value) {
        this.categury = value;
    }

    /**
     * Gets the value of the userFK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFK() {
        return userFK;
    }

    /**
     * Sets the value of the userFK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFK(String value) {
        this.userFK = value;
    }

    /**
     * Gets the value of the bookStatuse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookStatuse() {
        return bookStatuse;
    }

    /**
     * Sets the value of the bookStatuse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookStatuse(String value) {
        this.bookStatuse = value;
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
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

}
