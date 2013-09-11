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
 * @author calvr
 */
public class Set {
    private ArrayList<Cell> cells;
    private String name;
    
    public Set(File[] cellDirectories){
        for (File cellDirectory : cellDirectories){
            cells.add(new Cell(cellDirectory));
        }
    }
}
