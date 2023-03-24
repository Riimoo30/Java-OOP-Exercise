package javaoop._3Encapsulation._3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     * <p>
     * Make sure there are 5 fields inside, if they are not simply create some more.
     * make every field private first.
     * <p>
     * Then create getters and setters for each of these 5 fields.
     * <p>
     * Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!
        //Declaring the elements of "new student"
        Student student = new Student("Luca", 23, "Rossi", "Math", 2000
        );
        System.out.println("Name = " + student.getName() +
                " ,Age = " + student.getAge() +
                " ,Surname = " + student.getSurname() +
                " ,Course = " + student.getCourse() +
                " ,Year of birth = " + student.getYearOfBirth());


    }




    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        //Write your code here
        Student student = new Student(
                "Luca", 8, "Rossi", "Math", 1999
        );
        student.setAge(student.getAge());
        student.setName(student.getName());
        student.setCourse(student.getCourse());
        System.out.println(student.getCounter());
    }
}
