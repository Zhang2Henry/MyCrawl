package com.cppor.mycrawl;

import com.cppor.mycrawl.tools.HttpTools;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        HttpTools ht = new HttpTools();
        String html = null;
        try {
            html = ht.getUrlHtml("http://www.cppor.com");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println(html);
    }
}