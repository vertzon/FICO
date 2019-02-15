package qdspurs;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Set;
import java.util.Collections;
import javax.xml.namespace.QName;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.soap.SOAPMessage;
import org.w3c.dom.Document;

// Transformer APIs for extracting DOM object
//
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;

//Bocument Builder APIs for extracting DOM object
//
//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;


// DOM Level 3 APIs for serializing XML DOM objects
//
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;

// xerces2.java APIs for serializing XML DOM objects
//
//import org.apache.xml.serialize.OutputFormat;
//import org.apache.xml.serialize.XMLSerializer;




public class Handler implements SOAPHandler<SOAPMessageContext>
{

  /**
   * Call back method of the handler
   */
  public boolean handleMessage(SOAPMessageContext messageContext)
  {
     Boolean isOutbound = (Boolean)messageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

     if (isOutbound.booleanValue()) {
         System.out.println("\nOutbound Message (from Client to Web Service):");
         System.out.println("================================================");
     } else {
         System.out.println("\nInbound message (from Web Service to Client):");
         System.out.println("\n#############################################");
     }

     SOAPMessage msg = messageContext.getMessage();
     try {
    	 printSOAPMessage(msg);
     }
     catch(Exception e) {
    	 e.printStackTrace();
     }
    return true;
  }

  /**
   * Print out the SOAP Message for debugging
   * @param message
   * @throws Exception
   */
  public void printSOAPMessage(SOAPMessage message) throws Exception
  {
	  Document doc = _transformToDoc(message);
	  String strMsg = _serializeDoc(doc);
	  System.out.println(strMsg);
  }

  /**
   * Extract the W3C Document from the SOAP envelope by using Transformer API
   * @param msg
   * @return
   * @throws Exception
   */
  private Document _transformToDoc(SOAPMessage msg) throws Exception
  {
	  Source src = msg.getSOAPPart().getContent();
	  TransformerFactory f = TransformerFactory.newInstance();
	  Transformer transformer = f.newTransformer();
	  DOMResult result = new DOMResult();
	  transformer.transform(src, result);
	  return (Document)result.getNode();
  }

  /**
   * Extract the W3C Document from the SOAP envelope by using DocumentBuilder APIs
   * @param msg
   * @return
   * @throws Exception
   *
   * Note: you need to uncomment the relevant import statement block above to use
   *       this implementation

  private Document _transformToDoc(SOAPMessage msg) throws Exception
  {
	  ByteArrayOutputStream out = new ByteArrayOutputStream();
	  msg.writeTo(out);

	  ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
	  DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
	  DocumentBuilder b = f.newDocumentBuilder();
	  Document doc = b.parse(in);
	  return doc;
  }
  */


  /**
   * Serialize the W3C Document to a string for printing by using DOM L3 APIs
   * @param document
   * @return serialized XML string
   */
  private String _serializeDoc( Document document) throws Exception
  {
      DOMImplementationRegistry registry = DOMImplementationRegistry.newInstance();
      DOMImplementationLS impl = (DOMImplementationLS) registry.getDOMImplementation("LS");
      StringWriter writer = new StringWriter();
      LSOutput domOutput = impl.createLSOutput();
      domOutput.setEncoding("UTF-8");
      domOutput.setCharacterStream(writer);
      LSSerializer serializer = impl.createLSSerializer();
      serializer.getDomConfig().setParameter("format-pretty-print", new Boolean(true));

      serializer.write(document, domOutput);

      return writer.toString();
  }

  /**
   * Serialize the W3C Document to a string for printing by using Xerces2 APIs
   * @param document
   * @return serialized XML string
   *
   * Note: you need to uncomment the relevant import statement block above to use
   *       this implementation

  private String _serializeDoc(Document document) {
      try {
          OutputFormat format = new OutputFormat(document);
          format.setLineWidth(65);
          format.setIndenting(true);
          format.setIndent(2);
          Writer out = new StringWriter();
          XMLSerializer serializer = new XMLSerializer(out, format);
          serializer.serialize(document);

          return out.toString();
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
  }
  */

  // Following methods are required by the SOAPHandler interface
  // ===========================================================
  //
  public Set<QName> getHeaders()
  {
    return Collections.emptySet();
  }

  public boolean handleFault(SOAPMessageContext messageContext)
  {
    return true;
  }

  public void close(MessageContext messageContext)
  {
  }
}
