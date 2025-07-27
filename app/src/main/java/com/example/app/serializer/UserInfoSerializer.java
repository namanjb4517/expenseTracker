package com.example.app.serializer;

import com.example.app.eventProducer.UserInfoEvent;
import com.example.app.model.UserInfoDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class UserInfoSerializer implements Serializer<UserInfoEvent> {
    @Override
    public void configure(Map<String, ?> configs, boolean isKey){

    }

    @Override
    public byte[] serialize(String arg0, UserInfoEvent arg1){
        byte[] retVal = null;
        ObjectMapper objectmapper = new ObjectMapper();
        try{
            retVal = objectmapper.writeValueAsString(arg1).getBytes();
        }catch (Exception e){
            e.printStackTrace();
        }
        return retVal;
    }

    @Override
    public void close(){}
}
