/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formdemo;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Student implements Comparable<Student>{
    private String id;
    private String name;
    private int age;
    private String sex;
    private String address;
    private ArrayList<Student> arr = new ArrayList<>();
    
    public Student(String id, String name, int age, String sex, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }
    
    public Student(StudentBuilder studenBuilder){
        this.id = studenBuilder.id;
        this.name = studenBuilder.name;
        this.age = studenBuilder.age;
        this.sex = studenBuilder.sex;
        this.address = studenBuilder.address;
    }
    
    public static class StudentBuilder{
        private String id;
        private String name;
        private int age;
        private String sex;
        private String address;
        public StudentBuilder id(String id){
            this.id = id;
            return this;
        }
        public StudentBuilder name(String name){
            this.name = name;
            return this;
        }
        public StudentBuilder age(int age){
            this.age = age;
            return this;
        }
        public StudentBuilder sex(String sex){
            this.sex = sex;
            return this;
        }
        public StudentBuilder address(String address){
            this.address = address;
            return this;
        }
        public Student Build(){
            return new Student(this);
        }
    }
    
    public void info(){
            System.out.println("Id:"+id);
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Sex:"+sex);
            System.out.println("Address:"+address);
       
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

//    public static void main(String[] args) {
//        Student st = new Student.StudentBuilder().id("1").name("nguyen van nguyen").age(19).sex("male").address("thanh hoa").Build();
//        Student st2 = new Student.StudentBuilder().id("2").name("nguyen van").age(19).sex("male").address("thanh hoa").Build();
//        Student st3 = new Student.StudentBuilder().id("3").name("nguyen").age(19).sex("male").address("thanh hoa").Build();
//        arr.add(st);
//        arr.add(st2);
//        arr.add(st3);
//        for(Student s : arr){
//            arr.info();
//        }       
//}
@Override
    public int compareTo(Student o) {
        if(o.getAge()<getAge()) return -1;
        else if(o.getAge()==getAge()) return 0;
        else return 1;
    }
}
