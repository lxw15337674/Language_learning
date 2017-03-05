package day22;


import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class properties {
    public static void main(String[] args) {

    }
    public static void createProperties(){
        Properties properties = new Properties();
        properties.setProperty("lixiwang","123");
        properties.setProperty("qwe","asd");
        properties.setProperty("dfg","123");
        Set<Map.Entry<Object, Object>> entrySet = properties.entrySet();
    }

}

