
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

    private final static QName _AddBook_QNAME = new QName("http://serve/", "AddBook");
    private final static QName _AddBookResponse_QNAME = new QName("http://serve/", "AddBookResponse");
    private final static QName _UpdateBook_QNAME = new QName("http://serve/", "UpdateBook");
    private final static QName _UpdateBookResponse_QNAME = new QName("http://serve/", "UpdateBookResponse");
    private final static QName _ViewAllBookAvilable_QNAME = new QName("http://serve/", "viewAllBookAvilable");
    private final static QName _ViewAllBookAvilableResponse_QNAME = new QName("http://serve/", "viewAllBookAvilableResponse");
    private final static QName _ViewTopBooksOrderd_QNAME = new QName("http://serve/", "viewTopBooksOrderd");
    private final static QName _ViewTopBooksOrderdResponse_QNAME = new QName("http://serve/", "viewTopBooksOrderdResponse");
    private final static QName _ViewUserBookList_QNAME = new QName("http://serve/", "viewUserBookList");
    private final static QName _ViewUserBookListResponse_QNAME = new QName("http://serve/", "viewUserBookListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serve
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

    /**
     * Create an instance of {@link AddBookResponse }
     * 
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
    }

    /**
     * Create an instance of {@link UpdateBook }
     * 
     */
    public UpdateBook createUpdateBook() {
        return new UpdateBook();
    }

    /**
     * Create an instance of {@link UpdateBookResponse }
     * 
     */
    public UpdateBookResponse createUpdateBookResponse() {
        return new UpdateBookResponse();
    }

    /**
     * Create an instance of {@link ViewAllBookAvilable }
     * 
     */
    public ViewAllBookAvilable createViewAllBookAvilable() {
        return new ViewAllBookAvilable();
    }

    /**
     * Create an instance of {@link ViewAllBookAvilableResponse }
     * 
     */
    public ViewAllBookAvilableResponse createViewAllBookAvilableResponse() {
        return new ViewAllBookAvilableResponse();
    }

    /**
     * Create an instance of {@link ViewTopBooksOrderd }
     * 
     */
    public ViewTopBooksOrderd createViewTopBooksOrderd() {
        return new ViewTopBooksOrderd();
    }

    /**
     * Create an instance of {@link ViewTopBooksOrderdResponse }
     * 
     */
    public ViewTopBooksOrderdResponse createViewTopBooksOrderdResponse() {
        return new ViewTopBooksOrderdResponse();
    }

    /**
     * Create an instance of {@link ViewUserBookList }
     * 
     */
    public ViewUserBookList createViewUserBookList() {
        return new ViewUserBookList();
    }

    /**
     * Create an instance of {@link ViewUserBookListResponse }
     * 
     */
    public ViewUserBookListResponse createViewUserBookListResponse() {
        return new ViewUserBookListResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "AddBook")
    public JAXBElement<AddBook> createAddBook(AddBook value) {
        return new JAXBElement<AddBook>(_AddBook_QNAME, AddBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "AddBookResponse")
    public JAXBElement<AddBookResponse> createAddBookResponse(AddBookResponse value) {
        return new JAXBElement<AddBookResponse>(_AddBookResponse_QNAME, AddBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "UpdateBook")
    public JAXBElement<UpdateBook> createUpdateBook(UpdateBook value) {
        return new JAXBElement<UpdateBook>(_UpdateBook_QNAME, UpdateBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "UpdateBookResponse")
    public JAXBElement<UpdateBookResponse> createUpdateBookResponse(UpdateBookResponse value) {
        return new JAXBElement<UpdateBookResponse>(_UpdateBookResponse_QNAME, UpdateBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewAllBookAvilable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "viewAllBookAvilable")
    public JAXBElement<ViewAllBookAvilable> createViewAllBookAvilable(ViewAllBookAvilable value) {
        return new JAXBElement<ViewAllBookAvilable>(_ViewAllBookAvilable_QNAME, ViewAllBookAvilable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewAllBookAvilableResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "viewAllBookAvilableResponse")
    public JAXBElement<ViewAllBookAvilableResponse> createViewAllBookAvilableResponse(ViewAllBookAvilableResponse value) {
        return new JAXBElement<ViewAllBookAvilableResponse>(_ViewAllBookAvilableResponse_QNAME, ViewAllBookAvilableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewTopBooksOrderd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "viewTopBooksOrderd")
    public JAXBElement<ViewTopBooksOrderd> createViewTopBooksOrderd(ViewTopBooksOrderd value) {
        return new JAXBElement<ViewTopBooksOrderd>(_ViewTopBooksOrderd_QNAME, ViewTopBooksOrderd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewTopBooksOrderdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "viewTopBooksOrderdResponse")
    public JAXBElement<ViewTopBooksOrderdResponse> createViewTopBooksOrderdResponse(ViewTopBooksOrderdResponse value) {
        return new JAXBElement<ViewTopBooksOrderdResponse>(_ViewTopBooksOrderdResponse_QNAME, ViewTopBooksOrderdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewUserBookList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "viewUserBookList")
    public JAXBElement<ViewUserBookList> createViewUserBookList(ViewUserBookList value) {
        return new JAXBElement<ViewUserBookList>(_ViewUserBookList_QNAME, ViewUserBookList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewUserBookListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "viewUserBookListResponse")
    public JAXBElement<ViewUserBookListResponse> createViewUserBookListResponse(ViewUserBookListResponse value) {
        return new JAXBElement<ViewUserBookListResponse>(_ViewUserBookListResponse_QNAME, ViewUserBookListResponse.class, null, value);
    }

}
