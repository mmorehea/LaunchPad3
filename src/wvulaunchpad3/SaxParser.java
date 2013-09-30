/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wvulaunchpad3;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author callie
 */
public class SaxParser extends DefaultHandler{

    private String description;
    private File savedSet;
    private StringBuffer descBuffer;

    public SaxParser(File savedSet) {
        this.savedSet = savedSet;
        parseDocument();
    }
    
   
    
    public String parseDocument() {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            SAXParser parser = factory.newSAXParser();
            parser.parse(savedSet, this);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(SaxParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(SaxParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SaxParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return description;
    }
    
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
        if (qName.equalsIgnoreCase("desc")){
            descBuffer = new StringBuffer(2000);
        }
    }
    
    public void characters(char ch[], int start, int length) throws SAXException {
        descBuffer.append(ch, start, length);
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("desc")) {
            description = descBuffer.toString();
        }
    }
}
