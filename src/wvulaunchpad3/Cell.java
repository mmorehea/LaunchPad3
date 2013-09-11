/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wvulaunchpad3;

import java.util.ArrayList;

/**
 *
 * @author dom
 */
public class Cell {
    private ArrayList<Part> parts;
    
    public Cell(String[] filePaths){
        for (String filePath : filePaths){
            parts.add(new Part(filePath));
        }
    }
    
}
