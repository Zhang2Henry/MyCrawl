package com.cppor.mycrawl;

import com.cppor.mycrawl.tools.HttpTools;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.assertFalse;

/**
 * Created by willi on 29/06/2016.
 */
public class MainTest  {
    private HttpTools tools ;

    @Before
    public void setUp() {
        tools = new HttpTools();
    }

    @Test
    public void testHttpTools() {
        try {
            String html = tools.getUrlHtml("http://www.cppor.com");
            assertFalse(html == null || "".equals(html));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
