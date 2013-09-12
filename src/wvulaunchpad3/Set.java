/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wvulaunchpad3;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author dom
 */
public class Set {
    private ArrayList<Cell> cells;
    
    public Set(File[] cellDirectories){
        cells = new ArrayList<Cell>();
        for (File cellDirectory : cellDirectories){
            cells.add(new Cell(cellDirectory));
        }
    }
    
    public String toXML(){
        String xml = "<SetView value=\"on\">\n";
        xml += "<Structure>\n";
        xml += "<NumCells value=\""+cells.size()+"\"/>\n";
        
        for (int i = 0; i < cells.size(); i++){
            xml += "<Cell"+i+">\n";
            xml += cells.get(i).toXML();
            xml += "</Cell"+i+">\n";
        }
        
        xml += "</Structure>\n";
        xml += "</SetView>\n";
        System.out.println(xml);
        return xml;
    }
}
