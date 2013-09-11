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
    
    public Cell(File cellDirectory){
        File[] partFiles = cellDirectory.listFiles();
        for (File partFile : partFiles){
            parts.add(new Part(partFile));
        }
    }
}
