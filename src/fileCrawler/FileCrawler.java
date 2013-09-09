package fileCrawler;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JTree;
import wvulaunchpad3.*;


public class FileCrawler {
	    

    public static ArrayList<String> crawl(File f) {
        ArrayList<String> aS = new ArrayList<String>();
    	//System.out.println(f.getAbsoluteFile().toString());
        aS.add(f.getName());
    	if (f.isDirectory()) {
        	File[] subFiles = f.listFiles();
    	  	for (int i = 0; i < subFiles.length; i++) {
              	aS.add((subFiles[i].getName()));
        	}

    	}
            return aS;
    }
}