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
    
    public void write(){
        Scanner reader = null;
        File configFile = new File("setConfig.xml");
        if (configFile.exists()) configFile.delete();
        try {
            configFile.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(XMLWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*
        FileWriter writer = null;
        try {
            writer = new FileWriter(configFile, true);
            reader = new Scanner(new File("/ConfigFiles/preSetViewXML.xml"));
        } catch (IOException ex) {
            Logger.getLogger(XMLWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (reader.hasNext()){
                writer.write(reader.next());
            }
            writer.write(setViewXML);
            reader = new Scanner(new File("/ConfigFiles/postSetViewXML.xml"));
            while (reader.hasNext()){
                writer.write(reader.next());
            }
            writer.close();
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(XMLWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    }
}
