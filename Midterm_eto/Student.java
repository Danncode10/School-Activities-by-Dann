package Midterm_eto;

public class Student {
    //Attributes
    private String name;
    private int age;
    private String course;
    private char grade;

    //Constructors
    public Student(){}

    public Student(String name, int age, String course, char grade){
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }


    //get function
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCourse(){
        return course;
    }
    public char getGrade(){
        return grade;
    }

    //set fun
   public void setName(String name){
    this.name = name;
   }
   public void setAge(int age){
    this.age = age;
   }
   public void setCourse(String course){
    this.course = course;
   }
   public void setGrade(char grade){
    this.grade = grade;
   }

   //Shows Studnets Info
   public void showInfo(){
    System.out.println("Name: " + name);
    System.out.printf("Age: %d \n", age);
    System.out.println("Course: " + course);
    System.out.println("Grade: " + grade);
   }

}

