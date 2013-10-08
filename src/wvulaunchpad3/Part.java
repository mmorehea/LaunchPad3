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
    private String inputRegex = "input([0-9]+)";
    private String dendriteRegex = "dendrite[0-9]+";
    private String axonRegex = "axon";
    private String cellBodyRegex = "cellbody";
    private String nucleusRegex = "nucleus";
    
    public Part(File partFile){
        filePath = partFile.getAbsolutePath();
        type = filePath.substring(filePath.lastIndexOf("_")+1);
        type = type.substring(0, type.indexOf("."));
    }
    
    public String getType(){
        return type;
    }
    public String toSetViewXML() {
        String in = "in$1";
        String dend = "dendrite";
        if (type.matches(inputRegex)){
            String t = type.replaceAll(inputRegex, in);
            String xml = "<name value=\""+t+"\"/>\n";
            xml += "<file value=\""+filePath+"\"/>\n";
            return xml;
            
        }
        //else if (type.matches(dendriteRegex)){
            //String t = type.replaceAll(dendriteRegex, dend);
          //  String xml = "<name value=\""+type+"\"/>\n";
            //xml += "<file value=\""+filePath+"\"/>\n";
            //return xml;
        //}
        else if (type.matches(axonRegex) || type.matches(cellBodyRegex) || type.matches(nucleusRegex) || type.matches(dendriteRegex)){
            String xml = "<name value=\""+type+"\"/>\n";
            xml += "<file value=\""+filePath+"\"/>\n";
            return xml;
        }
        else return "";
        
    }
    public String toModelLoaderXML(){
        String name = filePath.substring(filePath.lastIndexOf("/") + 1, filePath.lastIndexOf("."));
        String xml = "<" + name + " path=\"" + filePath + "\" mask=\"0\" />\n";
        return xml;
    }
}