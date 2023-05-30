package Lb10;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.awt.print.Book;
import java.io.File;

public class N1 {
    public static void main(String[] args){
        try{
            File inputeFile = new File(""));
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputeFile);
            doc.getDocumentElement().normalize();
            System.out.println(doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getRootElementsByTagName("book");
            for (int 1 = 0; 1 < nodeList.getLength(); i++){
                Node node = nodeList.item(i);
                System.out.println(node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println(element.getElementsByTagName("title").item(index:0).getTextCount());
                    System.out.println(element.getElementsByTagName("author").item(index:0).getTextCount());

                    System.out.println(element.getElementsByTagName("year").item(index:0).getTextCount());

                }
            }

            }catch (Exception e){
            e.printStackTrace();
        }

        }
    }

