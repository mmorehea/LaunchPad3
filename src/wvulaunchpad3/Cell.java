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
    private String name;
    
    
    public Cell(File cellDirectory){
        name = cellDirectory.toString();
        String dendriteRegex = "dendrite1.obj";
        String inputRegex = "input[0-9]+.obj";
        parts = new ArrayList<Part>();
        File[] partFiles = cellDirectory.listFiles();
        
        for (File partFile : partFiles){
            parts.add(new Part(partFile));
        }
        
    }
    
    public String getName(){
        return name;
    }
    
    public String toXML() throws GeneralException{
        String xml = "<NumLayers value=\""+parts.size()+"\"/>\n";
        for (int i = 0; i < parts.size(); i++){
            xml += "<Layer"+i+">\n";
            xml += parts.get(i).toXML();
            xml += "</Layer"+i+">\n";
        }
        return xml;
    }
}
