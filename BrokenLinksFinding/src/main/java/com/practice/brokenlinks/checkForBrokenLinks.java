package com.practice.brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class checkForBrokenLinks {

	public static String isLinkBroken(URL url) throws IOException
	{
		String str=null;
		HttpURLConnection httpconnection= (HttpURLConnection)url.openConnection();
	
		httpconnection.connect();
		str=httpconnection.getResponseMessage();
		httpconnection.disconnect();
		return str;
	}
}
