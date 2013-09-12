/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wvulaunchpad3;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author dom
 */
public class Cell {
    private ArrayList<Part> parts;
    
    public Cell(File cellDirectory){
        parts = new ArrayList<Part>();
        File[] partFiles = cellDirectory.listFiles();
        
        for (File partFile : partFiles){
            parts.add(new Part(partFile));
        }
    }
    
    public String toXML(){
        String xml = "<NumLayers value=\""+parts.size()+"\"/>\n";
        for (int i = 0; i < parts.size(); i++){
            xml += "<Layer"+i+">\n";
            xml += parts.get(i).toXML();
            xml += "</Layer"+i+">\n";
        }
        return xml;
    }
}
