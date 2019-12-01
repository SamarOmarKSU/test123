
package serve;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SearchWS", targetNamespace = "http://serve/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SearchWS {


    /**
     * 
     * @param searchatt
     * @param searchvalue
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod(operationName = "SearchBy")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchBy", targetNamespace = "http://serve/", className = "serve.SearchBy")
    @ResponseWrapper(localName = "SearchByResponse", targetNamespace = "http://serve/", className = "serve.SearchByResponse")
    @Action(input = "http://serve/SearchWS/SearchByRequest", output = "http://serve/SearchWS/SearchByResponse")
    public List<Object> searchBy(
        @WebParam(name = "searchatt", targetNamespace = "")
        String searchatt,
        @WebParam(name = "searchvalue", targetNamespace = "")
        String searchvalue);

}
