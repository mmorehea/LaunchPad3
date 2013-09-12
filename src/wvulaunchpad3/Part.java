/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wvulaunchpad3;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        String xml = "<name value=\""+type+"\"/>\n";
        xml += "<file value=\""+filePath+"\"/>\n";
        return xml;
    }
}