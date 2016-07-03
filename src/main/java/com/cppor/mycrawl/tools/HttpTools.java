package com.cppor.mycrawl.tools;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by willi on 29/06/2016.
 */
public class HttpTools {
    public String getUrlHtml(String url) throws IOException {

        HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet("http://www.cppor.com");
        HttpResponse response = null;

        response = httpClient.execute(httpGet);
        Header[] allHeaders = response.getAllHeaders();
        for (Header h : allHeaders) {
            System.out.print(h.getName() + ":" + h.getValue());
        }

        HttpEntity entity = response.getEntity();
        InputStream content = entity.getContent();
        StringBuffer sb = new StringBuffer();
        int len = 0;
        byte[] tmp = new byte[2048];
        while ((len = content.read(tmp)) > 0) {
            sb.append(tmp);
        }



        return sb.toString();
    }
}
