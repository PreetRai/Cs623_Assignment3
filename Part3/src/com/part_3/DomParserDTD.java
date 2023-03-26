package com.part_3;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import java.io.File;
import java.io.IOException;

public class DomParserDTD {

    public static void main(String[] args) {
        try {
            File xmlFile = new File("catalog.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            dbFactory.setNamespaceAware(true);
            dbFactory.setValidating(true);
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            dBuilder.setErrorHandler(new MyErrorHandler());
            Document doc = dBuilder.parse(xmlFile);
            System.out.println("XML document is valid.");
        } catch (SAXException | IOException e) {
            System.out.println("XML document is NOT valid because " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyErrorHandler implements org.xml.sax.ErrorHandler {
    public void warning(SAXException e) throws SAXException {
        System.out.println("Warning: " + e.getMessage());
    }

    public void error(SAXException e) throws SAXException {
        System.out.println("Error: " + e.getMessage());
    }

    public void fatalError(SAXException e) throws SAXException {
        System.out.println("Fatal Error: " + e.getMessage());
    }

	@Override
	public void warning(SAXParseException exception) throws SAXException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(SAXParseException exception) throws SAXException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fatalError(SAXParseException exception) throws SAXException {
		// TODO Auto-generated method stub
		
	}
}
