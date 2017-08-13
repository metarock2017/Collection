package org.redrock.Map;

import java.util.*;

/**
 * Created by wang on 2017/8/6.
 */
public class Parcel11 {
    public static Map<School,Map<DepartMent,List>> map = new HashMap<>();
//    public static Map<Person, List<? extends Pet>>
//        pet_people = new HashMap<>();
//    static {
//        pet_people.put(new Person("将天星"), Arrays.asList(
//                new Pet("小猫"), new Pet("小狗")
//        ));
//        pet_people.put(new Person("严澄"), Arrays.asList(
//                new Pet("小猪"), new Pet("仓鼠")
//        ));
//        pet_people.put(new Person("查森云"), Arrays.asList(
//                new Pet("鹦鹉")
//        ));
//    }

    public static void main(String[] args) {
        //keySet() 方法返回map中所有健组成的Set
//        System.out.println("People: " + pet_people.keySet());
//        System.out.println("Pets: " + pet_people.values());
//        for (Person person : pet_people.keySet()) {
//            System.out.println(person + " has: ");
//            for (Pet pet : pet_people.get(person)) {
//                System.out.print("    " + pet);
//            }
//            System.out.println(" ");
//        }

        //作业：使用map嵌套map，并遍历打印
        Map<DepartMent,List> mapList = new HashMap<>();
        List list = new ArrayList();
        list.add(Arrays.asList(new Student("张三",18),new Student("李四",19)));
        mapList.put(new DepartMent("计算机"),list);
        list = new ArrayList();
        list.add(Arrays.asList(new Student("王五",18),new Student("赵四",19)));
        mapList.put(new DepartMent("通信"),list);
        map.put(new School("重邮"),mapList);

        mapList = new HashMap<>();
        list = new ArrayList();
        list.add(Arrays.asList(new Student("张全蛋",22),new Student("赵铁柱",30),new Student("王尼玛",30)));
        mapList.put(new DepartMent("传媒"),list);
        list = new ArrayList();
        list.add(Arrays.asList(new Student("12",22),new Student("123",30),new Student("王222",88)));
        mapList.put(new DepartMent("土木"),list);
        map.put(new School("重大"),mapList);
//        System.out.println(map.keySet());
//        System.out.println(map.values());
        for (School school : map.keySet()) {
            System.out.println("---------学校分割线-------------");
            System.out.println("School: " + school);
            Map<DepartMent,List> map1 = map.get(school);
            for (DepartMent departMent:map1.keySet()) {
                System.out.println("departMent :" + departMent);
                List list1 = map1.get(departMent);
                for (Object object : list1) {
                    System.out.println("student:" + object);
                }

            }

        }

    }
}

class Person {
    private String name;

    Person() {}

    Person(String name) {this.name = name;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class Student{
    private String name;
    private int age;

    Student(){}

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return this.name + " " + this.age ;
    }
}

class School{
    private String name;
    School(){}

    School(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString(){
        return this.name;
    }
}

class DepartMent{
    private String departName;

    DepartMent(){}
    DepartMent(String departName){
        this.departName = departName;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    @Override
    public String toString() {
        return this.departName;
    }
}

