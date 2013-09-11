/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wvulaunchpad3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author dom
 */
public class Part {
    private String type;
    private String filePath;
    
    Pattern pattern = Pattern.compile("([a-zA-Z0-9]+)");
    
    public Part(String filePath){
        this.filePath = filePath;
        Matcher matcher = pattern.matcher(filePath);
        if (matcher.find()){
            type = matcher.group(0);
        }
    }
    
    public String getType(){
        return type;
    }
}
