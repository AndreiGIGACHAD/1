
package Lb10;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
public class CreateXMLFile {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement( tagName: "library");
            doc.appendChild(rootElement);

            Element book1 = doc.createElement( tagName: "book");
            rootElement.appendChild(book1);
            Element title1 = doc.createElement( tagName: "title");
            title1.appendChild(doc.createTextNode( data: "War and peace"));
            book1.appendChild(title1);
            Element author1 = doc.createElement( tagName: "author");
            author1.appendChild(doc.createTextNode(data: "Leo Tolstoy"));
            book1.appendChild(author1);
            Element year1 = doc.createElement( tagName: "year");
            year1.appendChild(doc.createTextNode( data: "1869"));
            book1.appendChild(year1);

            Element book2 = doc.createElement( tagName: "book");
            rootElement.appendChild(book2);
            Element title2 = doc.createElement( tagName: "title");
            title2.appendChild(doc.createTextNode( data: "Master and Margarita"));
            book2.appendChild(title2);
            Element author2 = doc.createElement( tagName: "author");
            author2.appendChild(doc.createTextNode(data: "Mikhail Bulgakov"));
            book2.appendChild(author2);
            Element year2 = doc.createElement( tagName: "year");
            year2.appendChild(doc.createTextNode( data: "1967"));
            book2.appendChild(year2);
// Writing an XML file
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.set0utputProperty(javax.xml.transform.OutputKeys.ENCODING, value: "UTF-8");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.STANDALONE, value: "yes");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, value: "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result =
                    new javax.xml.transform.stream.StreamResult(new File( pathname: "src/lr10/example1/example.xm
            transformer.transform(source, result);
            System.out.println("XML file successfully created!");
        } catch (Exception pce) {
            pce.printStackTrace();

        }
    }
}