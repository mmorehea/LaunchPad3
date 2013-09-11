/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wvulaunchpad3;

import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author calvr
 */
public class Set {
    private ArrayList<Cell> cells;
    private String name;
    
    Pattern pattern = Pattern.compile("(");
    
    public Set(String[] filePaths){
        cells = new ArrayList<Cell>();
        
        
    }
}
