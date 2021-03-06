/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wvulaunchpad3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author dom
 */
public class Set {
    private ArrayList<Cell> cells;
    private String description;
    
    public Set(File[] cellDirectories) throws GeneralException {
        cells = new ArrayList<Cell>();
        for (File cellDirectory : cellDirectories){
            
                cells.add(new Cell(cellDirectory));
    
            
        }
    }
    
    public void setDescription(String desc){
        description = desc;
    }
    public String getDescription(){
        return description;
    }
    
    public ArrayList<Cell> getCells(){
        return cells;
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
        return xml;
    }
}
