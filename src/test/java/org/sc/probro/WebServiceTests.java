package org.sc.probro;

import java.io.IOException;
import java.util.*;
import java.io.*;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import org.apache.http.*;

/**
 * User: tdanford
 * Date: 8/4/13
 */
public class WebServiceTests {

    @Test
    public void testTestWebService() throws IOException {
        HttpClient client = new DefaultHttpClient();

        HttpGet get = new HttpGet("http://localhost:8088/obroker/test");
        HttpResponse response = client.execute(get);

        assertEquals(response.getStatusLine().getStatusCode(), 200);

        BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "UTF-8"));
        assertEquals(br.readLine(), "OK");

        br.close();
    }
}
