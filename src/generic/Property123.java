package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property123 
{
	public long get123() throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream("./pfile.properties/"));
		String s=p.getProperty("iw");
		long l = Long.parseLong(s);
		return l;
		
	}

}
