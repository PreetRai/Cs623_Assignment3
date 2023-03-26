package com.part_3;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import java.io.File;
import java.io.IOException;

public class DomParserSchema {

    public static void main(String[] args) {
        try {
            File xmlFile = new File("library.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            dbFactory.setNamespaceAware(true);
            dbFactory.setValidating(true);
            dbFactory.setAttribute("http://java.sun.com/xml/jaxp/properties/schemaLanguage", "http://www.w3.org/2001/XMLSchema");
            dbFactory.setAttribute("http://java.sun.com/xml/jaxp/properties/schemaSource", new File("library.xsd"));
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            System.out.println("XML document is valid.");
        } catch (SAXException | IOException e) {
            System.out.println("XML document is NOT valid because " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}