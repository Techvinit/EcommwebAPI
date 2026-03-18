package org.example.Resources;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

public class JSONReaderUtility {

    private static final ObjectMapper mapper=new ObjectMapper();

    public static <T> T read(String filename, Class<T> clazz){

        try{
            File file= new File("src/test/java/org/example/TestData/"+filename);
            return mapper.readValue(file,clazz);
        }
        catch (Exception e){
            throw new RuntimeException("unable to read json file");
        }
    }

    }

