/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wvulaunchpad3;

import java.io.File;

/**
 *
 * @author dom
 */
public class Part {
    private String type;
    private String filePath;
    
    public Part(File partFile){
        filePath = partFile.getAbsolutePath();
        type = filePath.substring(filePath.lastIndexOf("_")+1);
        type = type.substring(0, type.indexOf("."));
    }
    
    public String getType(){
        return type;
    }
    public String toXML(){
        String inputRegex = "input([0-9]+)";
        String dendriteRegex = "dendrite[0-9]+";
        String IN = "in$1";
        String dend = "dendrite";
        if (type.matches(inputRegex)){
            String t = type.replaceAll(inputRegex, IN);
            String xml = "<name value=\""+t+"\"/>\n";
            xml += "<file value=\""+filePath+"\"/>\n";
            return xml;
            
        }
        else if (type.matches(dendriteRegex)){
            String t = type.replaceAll(dendriteRegex, dend);
            String xml = "<name value=\""+t+"\"/>\n";
            xml += "<file value=\""+filePath+"\"/>\n";
            return xml;
        }
        else {
        String xml = "<name value=\""+type+"\"/>\n";
        xml += "<file value=\""+filePath+"\"/>\n";
        return xml;
        }
    }
}