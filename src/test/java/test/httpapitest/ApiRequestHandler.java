package test.httpapitest;

import org.apache.commons.lang3.time.StopWatch;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeUnit;

public class ApiRequestHandler {
    //define a method for get request----get all customers request
    public ApiResponseHandler getAllCustomers(String username,String password,String url,int port,String endponit) {
        ApiResponseHandler apiResponseHandler=new ApiResponseHandler();
        AuthenticationProvider authenticationProvider=new AuthenticationProvider();
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        //create client
         CloseableHttpClient httpClient= HttpClientBuilder.create().setDefaultCredentialsProvider(
                 authenticationProvider.getCredential(username,password,url,port)
         ).build();
         //define request type
        HttpGet httpGet=new HttpGet(url+":"+port+"/"+endponit);
        CloseableHttpResponse response= null;
        try {
            response = httpClient.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int responseCode=response.getStatusLine().getStatusCode();
        if(responseCode!=0){
            apiResponseHandler.setResponseCode(responseCode);
            apiResponseHandler.setResponseTime(stopWatch.getTime(TimeUnit.MILLISECONDS));

        }
        //get the content
        HttpEntity entity=response.getEntity();//returns response object entity
        if(entity!=null){
            String responseContent= null;
            try {
                responseContent = EntityUtils.toString(entity);
            } catch (IOException e) {
                e.printStackTrace();
            }
            apiResponseHandler.setResponseContent(responseContent);
        }
        return apiResponseHandler;
    }
    public ApiResponseHandler addCategory(String username,String password,String url,int port,String endponit,String payLoad) {
        ApiResponseHandler apiResponseHandler=new ApiResponseHandler();
        AuthenticationProvider authenticationProvider=new AuthenticationProvider();
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        //create client
        CloseableHttpClient httpClient= HttpClientBuilder.create().setDefaultCredentialsProvider(
                authenticationProvider.getCredential(username,password,url,port)
        ).build();
        //define request type
        HttpPost httpPost=new HttpPost(url+":"+port+"/"+endponit);
        httpPost.setHeader("Content-Type","application/json");
        try {
            httpPost.setEntity(new StringEntity(payLoad));//set request payload
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        CloseableHttpResponse response= null;

        try {
            response = httpClient.execute(httpPost);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int responseCode=response.getStatusLine().getStatusCode();
        if(responseCode!=0){
            apiResponseHandler.setResponseCode(responseCode);
            apiResponseHandler.setResponseTime(stopWatch.getTime(TimeUnit.MILLISECONDS));

        }
        //get the content
        HttpEntity entity=response.getEntity();//returns response object entity
        if(entity!=null){
            String responseContent= null;
            try {
                responseContent = EntityUtils.toString(entity);
            } catch (IOException e) {
                e.printStackTrace();
            }
            apiResponseHandler.setResponseContent(responseContent);
        }
        return apiResponseHandler;
    }



}
