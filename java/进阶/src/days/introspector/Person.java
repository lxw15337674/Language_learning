package days.introspector;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Created by 40417 on 2017/1/23 0023.
 */
//实体类---javaBean
public class Person {
    private int id;
    private String name;
    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Person(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "编号:" + this.id + "姓名:" + this.name + "生日:" + this.birthday;
    }
}
