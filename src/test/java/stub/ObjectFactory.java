
package stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stub package. 
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

    private final static QName _Draw_QNAME = new QName("http://services.axis2.middleware.sdu.edu.cn/", "draw");
    private final static QName _GetBalance_QNAME = new QName("http://services.axis2.middleware.sdu.edu.cn/", "getBalance");
    private final static QName _DepositResponse_QNAME = new QName("http://services.axis2.middleware.sdu.edu.cn/", "depositResponse");
    private final static QName _Save_QNAME = new QName("http://services.axis2.middleware.sdu.edu.cn/", "save");
    private final static QName _Deposit_QNAME = new QName("http://services.axis2.middleware.sdu.edu.cn/", "deposit");
    private final static QName _SaveResponse_QNAME = new QName("http://services.axis2.middleware.sdu.edu.cn/", "saveResponse");
    private final static QName _GetBalanceResponse_QNAME = new QName("http://services.axis2.middleware.sdu.edu.cn/", "getBalanceResponse");
    private final static QName _DrawResponse_QNAME = new QName("http://services.axis2.middleware.sdu.edu.cn/", "drawResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Draw }
     * 
     */
    public Draw createDraw() {
        return new Draw();
    }

    /**
     * Create an instance of {@link GetBalance }
     * 
     */
    public GetBalance createGetBalance() {
        return new GetBalance();
    }

    /**
     * Create an instance of {@link Save }
     * 
     */
    public Save createSave() {
        return new Save();
    }

    /**
     * Create an instance of {@link DepositResponse }
     * 
     */
    public DepositResponse createDepositResponse() {
        return new DepositResponse();
    }

    /**
     * Create an instance of {@link SaveResponse }
     * 
     */
    public SaveResponse createSaveResponse() {
        return new SaveResponse();
    }

    /**
     * Create an instance of {@link Deposit }
     * 
     */
    public Deposit createDeposit() {
        return new Deposit();
    }

    /**
     * Create an instance of {@link GetBalanceResponse }
     * 
     */
    public GetBalanceResponse createGetBalanceResponse() {
        return new GetBalanceResponse();
    }

    /**
     * Create an instance of {@link DrawResponse }
     * 
     */
    public DrawResponse createDrawResponse() {
        return new DrawResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Draw }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.axis2.middleware.sdu.edu.cn/", name = "draw")
    public JAXBElement<Draw> createDraw(Draw value) {
        return new JAXBElement<Draw>(_Draw_QNAME, Draw.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.axis2.middleware.sdu.edu.cn/", name = "getBalance")
    public JAXBElement<GetBalance> createGetBalance(GetBalance value) {
        return new JAXBElement<GetBalance>(_GetBalance_QNAME, GetBalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.axis2.middleware.sdu.edu.cn/", name = "depositResponse")
    public JAXBElement<DepositResponse> createDepositResponse(DepositResponse value) {
        return new JAXBElement<DepositResponse>(_DepositResponse_QNAME, DepositResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.axis2.middleware.sdu.edu.cn/", name = "save")
    public JAXBElement<Save> createSave(Save value) {
        return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.axis2.middleware.sdu.edu.cn/", name = "deposit")
    public JAXBElement<Deposit> createDeposit(Deposit value) {
        return new JAXBElement<Deposit>(_Deposit_QNAME, Deposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.axis2.middleware.sdu.edu.cn/", name = "saveResponse")
    public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
        return new JAXBElement<SaveResponse>(_SaveResponse_QNAME, SaveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBalanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.axis2.middleware.sdu.edu.cn/", name = "getBalanceResponse")
    public JAXBElement<GetBalanceResponse> createGetBalanceResponse(GetBalanceResponse value) {
        return new JAXBElement<GetBalanceResponse>(_GetBalanceResponse_QNAME, GetBalanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DrawResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.axis2.middleware.sdu.edu.cn/", name = "drawResponse")
    public JAXBElement<DrawResponse> createDrawResponse(DrawResponse value) {
        return new JAXBElement<DrawResponse>(_DrawResponse_QNAME, DrawResponse.class, null, value);
    }

}
