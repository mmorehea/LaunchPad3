/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wvulaunchpad3;

import java.io.File;

/**
 *
 * @author calvr
 */
public class CellDirectory extends File{
    public CellDirectory(String filePath){
        super(filePath);
    }
    public CellDirectory(File f){
        super(f.getAbsolutePath());
    }
    @Override
    public String toString(){
        return(this.getName());
    }
}
