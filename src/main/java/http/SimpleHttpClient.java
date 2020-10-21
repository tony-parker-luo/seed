package http;

import com.google.gson.JsonObject;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName SimpleHttpClient.java
 * @Description Simple HTTP Client
 * @Author Calen Luo
 * @Version 1.0.0
 * @Date 2020/9/29 16:18
 */
public class SimpleHttpClient {
    /**
     * @param url url
     * @param param param
     * @return jsonString
     * @title POST(JSON)
     * @description
     * @author Galen Luo
     * @date 2020/9/29 16:15
     */
    public static String postJson(String url, JsonObject param) throws IOException {
        HttpClient client = new HttpClient();

        PostMethod postMethod = new PostMethod(url);
        postMethod.addRequestHeader("Content-Type", "text/xml; charset=utf-8");

        postMethod.setRequestEntity(new StringRequestEntity(param.toString(), null, "utf-8"));
        client.executeMethod(postMethod);
        return new String(postMethod.getResponseBodyAsString().getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
    }

    /**
     * @param url url
     * @title GET
     * @description
     * @author Galen Luo
     * @date 2020/9/29 16:15
     */
    public static String doGet(String url) throws IOException {
        HttpClient client = new HttpClient();
        GetMethod getMethod = new GetMethod(url);

        client.executeMethod(getMethod);
        return new String(getMethod.getResponseBodyAsString().getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
    }
}
