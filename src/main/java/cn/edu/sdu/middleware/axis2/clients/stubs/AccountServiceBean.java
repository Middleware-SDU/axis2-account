
package cn.edu.sdu.middleware.axis2.clients.stubs;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AccountServiceBean", targetNamespace = "http://services.axis2.middleware.sdu.edu.cn/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AccountServiceBean {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "save", targetNamespace = "http://services.axis2.middleware.sdu.edu.cn/", className = "stub.Save")
    @ResponseWrapper(localName = "saveResponse", targetNamespace = "http://services.axis2.middleware.sdu.edu.cn/", className = "stub.SaveResponse")
    @Action(input = "http://services.axis2.middleware.sdu.edu.cn/AccountServiceBean/saveRequest", output = "http://services.axis2.middleware.sdu.edu.cn/AccountServiceBean/saveResponse")
    public String save(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Double arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "draw", targetNamespace = "http://services.axis2.middleware.sdu.edu.cn/", className = "stub.Draw")
    @ResponseWrapper(localName = "drawResponse", targetNamespace = "http://services.axis2.middleware.sdu.edu.cn/", className = "stub.DrawResponse")
    @Action(input = "http://services.axis2.middleware.sdu.edu.cn/AccountServiceBean/drawRequest", output = "http://services.axis2.middleware.sdu.edu.cn/AccountServiceBean/drawResponse")
    public Double draw(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Double arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBalance", targetNamespace = "http://services.axis2.middleware.sdu.edu.cn/", className = "stub.GetBalance")
    @ResponseWrapper(localName = "getBalanceResponse", targetNamespace = "http://services.axis2.middleware.sdu.edu.cn/", className = "stub.GetBalanceResponse")
    @Action(input = "http://services.axis2.middleware.sdu.edu.cn/AccountServiceBean/getBalanceRequest", output = "http://services.axis2.middleware.sdu.edu.cn/AccountServiceBean/getBalanceResponse")
    public Double getBalance(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deposit", targetNamespace = "http://services.axis2.middleware.sdu.edu.cn/", className = "stub.Deposit")
    @ResponseWrapper(localName = "depositResponse", targetNamespace = "http://services.axis2.middleware.sdu.edu.cn/", className = "stub.DepositResponse")
    @Action(input = "http://services.axis2.middleware.sdu.edu.cn/AccountServiceBean/depositRequest", output = "http://services.axis2.middleware.sdu.edu.cn/AccountServiceBean/depositResponse")
    public Double deposit(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Double arg1);

}
