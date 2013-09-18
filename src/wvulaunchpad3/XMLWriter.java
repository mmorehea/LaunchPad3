/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wvulaunchpad3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dom
 */
public class XMLWriter {
    private String setViewXML;
        
    public XMLWriter(Set set){
        setViewXML = set.toXML();
    }
    
    public void write() throws FileNotFoundException, IOException{
    FileWriter fw = new FileWriter("/home/callie/Desktop/middle.xml");
            fw.write(this.setViewXML);
    fw.close();
    String[] params = new String [6];
    params[0] = "python";
    params[1] = "/home/callie/Desktop/xmlWriter.py";
    params[2] = "/home/callie/Desktop/beginning.xml";
    params[3] = "/home/callie/Desktop/middle.xml";
    params[4] = "/home/callie/Desktop/end.xml";
    params[5] = "/home/callie/Desktop/new.xml";
    Runtime.getRuntime().exec(params);

    }
}
