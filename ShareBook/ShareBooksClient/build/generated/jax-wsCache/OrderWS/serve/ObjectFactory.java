
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

    private final static QName _CreatNewOrder_QNAME = new QName("http://serve/", "CreatNewOrder");
    private final static QName _CreatNewOrderResponse_QNAME = new QName("http://serve/", "CreatNewOrderResponse");
    private final static QName _UpdateOrderStatus_QNAME = new QName("http://serve/", "UpdateOrderStatus");
    private final static QName _UpdateOrderStatusResponse_QNAME = new QName("http://serve/", "UpdateOrderStatusResponse");
    private final static QName _ViewOrders_QNAME = new QName("http://serve/", "viewOrders");
    private final static QName _ViewOrdersResponse_QNAME = new QName("http://serve/", "viewOrdersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serve
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreatNewOrder }
     * 
     */
    public CreatNewOrder createCreatNewOrder() {
        return new CreatNewOrder();
    }

    /**
     * Create an instance of {@link CreatNewOrderResponse }
     * 
     */
    public CreatNewOrderResponse createCreatNewOrderResponse() {
        return new CreatNewOrderResponse();
    }

    /**
     * Create an instance of {@link UpdateOrderStatus }
     * 
     */
    public UpdateOrderStatus createUpdateOrderStatus() {
        return new UpdateOrderStatus();
    }

    /**
     * Create an instance of {@link UpdateOrderStatusResponse }
     * 
     */
    public UpdateOrderStatusResponse createUpdateOrderStatusResponse() {
        return new UpdateOrderStatusResponse();
    }

    /**
     * Create an instance of {@link ViewOrders }
     * 
     */
    public ViewOrders createViewOrders() {
        return new ViewOrders();
    }

    /**
     * Create an instance of {@link ViewOrdersResponse }
     * 
     */
    public ViewOrdersResponse createViewOrdersResponse() {
        return new ViewOrdersResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatNewOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "CreatNewOrder")
    public JAXBElement<CreatNewOrder> createCreatNewOrder(CreatNewOrder value) {
        return new JAXBElement<CreatNewOrder>(_CreatNewOrder_QNAME, CreatNewOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatNewOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "CreatNewOrderResponse")
    public JAXBElement<CreatNewOrderResponse> createCreatNewOrderResponse(CreatNewOrderResponse value) {
        return new JAXBElement<CreatNewOrderResponse>(_CreatNewOrderResponse_QNAME, CreatNewOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "UpdateOrderStatus")
    public JAXBElement<UpdateOrderStatus> createUpdateOrderStatus(UpdateOrderStatus value) {
        return new JAXBElement<UpdateOrderStatus>(_UpdateOrderStatus_QNAME, UpdateOrderStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrderStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "UpdateOrderStatusResponse")
    public JAXBElement<UpdateOrderStatusResponse> createUpdateOrderStatusResponse(UpdateOrderStatusResponse value) {
        return new JAXBElement<UpdateOrderStatusResponse>(_UpdateOrderStatusResponse_QNAME, UpdateOrderStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "viewOrders")
    public JAXBElement<ViewOrders> createViewOrders(ViewOrders value) {
        return new JAXBElement<ViewOrders>(_ViewOrders_QNAME, ViewOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "viewOrdersResponse")
    public JAXBElement<ViewOrdersResponse> createViewOrdersResponse(ViewOrdersResponse value) {
        return new JAXBElement<ViewOrdersResponse>(_ViewOrdersResponse_QNAME, ViewOrdersResponse.class, null, value);
    }

}
