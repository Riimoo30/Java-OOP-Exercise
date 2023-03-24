package javaoop._2Constructors._2;

public class Student {
    String name;
    Integer age;

    public Student(String name, Integer age){

        this.name = name;
        this.age = age;
        //System.out.println("Name = " + name + ", Age = " +age);
        //System.out.println("Constructed\n");

    }
    public void printStudent(){
        System.out.println("Constructing");
        System.out.println("Name = " + name + ", Age = " +age);
        System.out.println("Constructed\n");
    }

    public Student(Integer age){
        System.out.println("Constructor 2");
        this.age = age;
        System.out.println(age);

    }

    public Student(String name){
        System.out.println("constructor 3");
        this.name = name;
        System.out.println(name);
    }

    public Student(){
        System.out.println("empty");
    }
}
