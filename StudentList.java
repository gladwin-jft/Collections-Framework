import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/*class Student//Create a class named Student
    {
        //which has name, age, course as data members
        String name;
        int age;
        String course;
        Student(String name , int age, String course)
        {
            this.name = name;
            this.age = age;
            this.course = course;
        }
        public void display()
        {
            System.out.print("Name : " + this.name + "\n" + "Age : " + this.age + "Course : " +this.course);
        }
    }*/

class StudentList {
    //Define a class named StudentList, 
    //Search a Student object in the list (Searching will fail, find out the reason 
    //and modify the Student class to enable successful searching).
    
    public static void main(String[] args)
    {
        Student s1 = new Student("James", 21, "B.Sci");
        Student s2 = new Student("harry", 26, "B.Art");
        Student s3 = new Student("Sally", 30, "M.Art");
        Student s4 = new Student("Tom", 20, "B.Ed");
        Student s5 = new Student("Jerry", 30, "M.Ed");


        //in the main method create an ArrayList object, 
        List<Student> Student_list = new ArrayList<>();
        Student_list.add(s1);
        Student_list.add(s2);
        Student_list.add(s3);
        Student_list.add(s4);
        Student_list.add(s5);

        for(Student s : Student_list)//Display the Elements
        {
            System.out.print(s.display());
        }
        
        
        //Search a Student object in the list (Searching will fail, find out the reason 
        //and modify the Student class to enable successful searching)

        Student temp = new Student("harry", 26, "B.Art");

        for(Student obj: Student_list)
        {
            if(obj.equals(temp))
            {
                System.out.println("\nObject Found");
            }
        }
        
        System.out.println("\nObject Not Found");

    }
    
}

    

