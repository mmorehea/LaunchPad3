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
import java.awt.Component;
import java.awt.PopupMenu;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.Properties;
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
    FileWriter fw = new FileWriter("/home/calvr/NetBeansProjects/WVULaunchPad3/src/wvulaunchpad3/middle.xml");
            fw.write(this.setViewXML);
    fw.close();
    String[] params = new String [6];
    params[0] = "python";
    params[1] = "/home/calvr/NetBeansProjects/WVULaunchPad3/src/wvulaunchpad3/xmlWriter.py";
    params[2] = "/home/calvr/NetBeansProjects/WVULaunchPad3/src/wvulaunchpad3/beginning.xml";
    params[3] = "/home/calvr/NetBeansProjects/WVULaunchPad3/src/wvulaunchpad3/middle.xml";
    params[4] = "/home/calvr/NetBeansProjects/WVULaunchPad3/src/wvulaunchpad3/end.xml";
    params[5] = "/home/calvr/setconfig/runtimeConfig.xml";
    Runtime.getRuntime().exec(params);
    
    }
}
