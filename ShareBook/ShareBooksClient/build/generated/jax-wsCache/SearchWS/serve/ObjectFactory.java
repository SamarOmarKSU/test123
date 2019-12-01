
package serve;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serve package. 
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

    private final static QName _SearchBy_QNAME = new QName("http://serve/", "SearchBy");
    private final static QName _SearchByResponse_QNAME = new QName("http://serve/", "SearchByResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serve
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchBy }
     * 
     */
    public SearchBy createSearchBy() {
        return new SearchBy();
    }

    /**
     * Create an instance of {@link SearchByResponse }
     * 
     */
    public SearchByResponse createSearchByResponse() {
        return new SearchByResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "SearchBy")
    public JAXBElement<SearchBy> createSearchBy(SearchBy value) {
        return new JAXBElement<SearchBy>(_SearchBy_QNAME, SearchBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "SearchByResponse")
    public JAXBElement<SearchByResponse> createSearchByResponse(SearchByResponse value) {
        return new JAXBElement<SearchByResponse>(_SearchByResponse_QNAME, SearchByResponse.class, null, value);
    }

}
