package days.introspector;

import org.junit.Test;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * Created by 40417 on 2017/1/23 0023.
 */
public class lol {
    @Test
    public void getAllProperty() throws IntrospectionException {
        //Introspector 内省类
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
        //通过BeanInfo获取所有的属性描述器
        PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();//获取一个类中的所有属性描述器
        for (PropertyDescriptor p : descriptors) {
            System.out.println(p.getReadMethod());
        }


    }

    @Test
    public void testProperty() throws Exception {
        Person p = new Person();
        //属性描述器
        PropertyDescriptor descriptor = new PropertyDescriptor("id", Person.class);
        //获取属性对应的get或set方法设置或获取属性
        Method m = descriptor.getWriteMethod();
        //执行该方法设置属性值
        m.invoke(p, 110);
        System.out.println(p);
        Method readMethods = descriptor.getReadMethod();//获取属性的get方法
        System.out.println(readMethods.invoke(p, null));
    }


}
