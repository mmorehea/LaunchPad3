package fileCrawler;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JTree;
import wvulaunchpad3.*;


public class FileCrawler {
	    

    public static ArrayList<File> crawl(File f) {
        ArrayList<File> aS = new ArrayList<File>();
    	//System.out.println(f.getAbsoluteFile().toString());
        aS.add(f);
    	if (f.isDirectory()) {
        	File[] subFiles = f.listFiles();
    	  	for (int i = 0; i < subFiles.length; i++) {
                 	aS.add((subFiles[i]));
        	}

    	}
        return aS;
    }
}