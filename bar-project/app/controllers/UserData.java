package controllers;

import play.data.validation.Constraints;

public class UserData {

    @Constraints.Required
    private String name;

    @Constraints.Required
    private Integer age;

    @Constraints.Required
    private String sex;
    public UserData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex(){return sex;}

    public void setSex(String sex){
        this.sex = sex;
    }


    @Override
    public String toString() {
        return String.format("The User: (%s, %s, %s)", name, age, sex);
    }

}
