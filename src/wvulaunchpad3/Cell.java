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
    private Part fullModel = null;
    
    
    
    public Cell(File cellDirectory){
        name = cellDirectory.toString();
        parts = new ArrayList<Part>();
        File[] partFiles = cellDirectory.listFiles();

        for (File partFile : partFiles){
            String filePath = partFile.getPath();
            if (filePath.substring(filePath.lastIndexOf("_") + 1, filePath.lastIndexOf(".")).equalsIgnoreCase("FULL")){
                fullModel = new Part(partFile);
            } else parts.add(new Part(partFile));
        }
    }
    
    public String getName(){
        return name;
    }
    
    public String toSetViewXML() throws GeneralException{
        String xml = "<NumLayers value=\""+parts.size()+"\"/>\n";
        for (int i = 0; i < parts.size(); i++){
            xml += "<Layer"+i+">\n";
            xml += parts.get(i).toSetViewXML();
            xml += "</Layer"+i+">\n";
        }
        return xml;
    }
    public String toModelLoaderXML(){
        String xml = "";
        if (fullModel!=null){
            xml = fullModel.toModelLoaderXML();
        }
        return xml;
    }
}
