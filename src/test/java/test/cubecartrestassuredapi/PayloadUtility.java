package test.cubecartrestassuredapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PayloadUtility {

    public static String getCategoryPayload(String catDescription,String catName,int catImage,
                                            int catParentId,int status){
        long timeStamp=System.currentTimeMillis();
        String payload=null;
        CategoryPayload categoryPayload=new CategoryPayload(catDescription+timeStamp,
                1,catName+timeStamp,1,1);
        ObjectMapper objectMapper=new ObjectMapper();
        try {
            payload=objectMapper.writeValueAsString(categoryPayload);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return payload;
    }
}
