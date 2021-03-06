//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.21 at 05:14:44 PM CEST 
//


package pl.coderstrust.soapinvoices;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each Java content interface and Java element interface
 * generated in the pl.coderstrust.soapinvoices package. <p>An ObjectFactory allows you to
 * programatically construct new instances of the Java representation for XML content. The Java
 * representation of XML content can consist of schema derived interfaces and classes representing
 * the binding of schema type definitions, element declarations and model groups.  Factory methods
 * for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {


  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes
   * for package: pl.coderstrust.soapinvoices
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link GetInvoiceRequest }
   */
  public GetInvoiceRequest createGetInvoiceRequest() {
    return new GetInvoiceRequest();
  }

  /**
   * Create an instance of {@link GetInvoiceResponse }
   */
  public GetInvoiceResponse createGetInvoiceResponse() {
    return new GetInvoiceResponse();
  }

  /**
   * Create an instance of {@link InvoiceWS }
   */
  public InvoiceWS createInvoiceWS() {
    return new InvoiceWS();
  }

  /**
   * Create an instance of {@link SetInvoiceRequest }
   */
  public SetInvoiceRequest createSetInvoiceRequest() {
    return new SetInvoiceRequest();
  }

  /**
   * Create an instance of {@link InvoiceAttributes }
   */
  public InvoiceAttributes createInvoiceAttributes() {
    return new InvoiceAttributes();
  }

  /**
   * Create an instance of {@link GetInvoicesRequest }
   */
  public GetInvoicesRequest createGetInvoicesRequest() {
    return new GetInvoicesRequest();
  }

  /**
   * Create an instance of {@link SelectByDate }
   */
  public SelectByDate createSelectByDate() {
    return new SelectByDate();
  }

  /**
   * Create an instance of {@link SelectByYearAndMonth }
   */
  public SelectByYearAndMonth createSelectByYearAndMonth() {
    return new SelectByYearAndMonth();
  }

  /**
   * Create an instance of {@link GetInvoicesResponse }
   */
  public GetInvoicesResponse createGetInvoicesResponse() {
    return new GetInvoicesResponse();
  }

  /**
   * Create an instance of {@link SetInvoiceResponse }
   */
  public SetInvoiceResponse createSetInvoiceResponse() {
    return new SetInvoiceResponse();
  }

  /**
   * Create an instance of {@link AddressWS }
   */
  public AddressWS createAddressWS() {
    return new AddressWS();
  }

  /**
   * Create an instance of {@link InvoiceItemWS }
   */
  public InvoiceItemWS createInvoiceItemWS() {
    return new InvoiceItemWS();
  }

  /**
   * Create an instance of {@link InvoiceBodyWS }
   */
  public InvoiceBodyWS createInvoiceBodyWS() {
    return new InvoiceBodyWS();
  }

  /**
   * Create an instance of {@link CounterpartyWS }
   */
  public CounterpartyWS createCounterpartyWS() {
    return new CounterpartyWS();
  }

}
