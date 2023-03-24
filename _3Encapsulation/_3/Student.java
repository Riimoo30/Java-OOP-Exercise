package javaoop._3Encapsulation._3;

public class Student {
   private String name;
   private Integer age;
   private Integer minAge = 5;
   private String surname;
   private String course;
   private Integer yearOfBirth;
   private Integer counter = 0;

   //Declaring the elements of Students
    Student(String name, Integer age, String surname, String course, Integer yearOfBirth) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.course = course;
        this.yearOfBirth = yearOfBirth;
    }

    //Setters of name and its costrain
    public void setName(String name){
        if (name.equals("Lorenzo")) {
            this.name = name;
        } else System.out.println("This is a new student");
    }
    //Getters of name
     String getName(){
        return this.name;
    }
    //Setters of age and its costrain
    public void setAge(Integer age){
        if(age < minAge){
            System.out.println("Can't be a student");
        } else this.age = age;
    }
    //Getter of age
    Integer getAge(){
        counter = counter + 1;
        return this.age;
    }
    public String getSurname(){
        return surname;
    }

    public void setCourse(String course){
        if(course.equals("Math")){
            this.course = course;
        } else System.out.println("This is not the right course");
    }
    String getCourse(){
        return course;
    }
    public  Integer getYearOfBirth(){
        return yearOfBirth;
    }
    int getCounter(){
        return this.counter;
    }
}


