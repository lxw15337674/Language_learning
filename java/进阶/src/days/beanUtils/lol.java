package days.beanUtils;

import days.introspector.Person;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 40417 on 2017/1/23 0023.
 */
public class lol {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //注册一个类型转换器
        ConvertUtils.register(new Converter() {
            @Override
            public Object convert(Class type, Object value) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = null;
                try {
                    date = dateFormat.parse((String) value);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return date;
            }
        },Date.class);

        //读取的数据都是字符串.
        Person p = new Person();
        BeanUtils.setProperty(p,"name","李希望");
        BeanUtils.setProperty(p,"id",123);
        String birthday = "2012-12-10";
        BeanUtils.setProperty(p,"birthday",birthday);
        System.out.println(p);

    }



}
