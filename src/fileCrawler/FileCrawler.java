import java.io.File;

public class FileCrawler {
	public static void main(String[] args) {
		File f = new File("/home/calvr/Dropbox");
        crawl(f);
	}
    
	
	public static void crawl(File f) {
    	crawl(f, "");
    }
    
    private static void crawl(File f, String indent) {
    	System.out.println(indent + f.getAbsolutePath());
    	if (f.isDirectory()) {
        	File[] subFiles = f.listFiles();
    		indent += "    ";
        	for (int i = 0; i < subFiles.length; i++) {
              	crawl(subFiles[i], indent);
        	}

    	}
    }
}