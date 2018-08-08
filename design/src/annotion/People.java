package annotion;

import java.util.Date;

/**
 * Created by lucas on 2018/8/7.
 */
public class People {
    private String name;
    private long age;
    @Tag(dataFormat = "yyyy-mm-dd")
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
