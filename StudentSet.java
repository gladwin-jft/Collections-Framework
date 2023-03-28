import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class StudentSet //Define a class named StudentSet
{

    public static void main(String[]args)
    {
        Student s1 = new Student("James", 21, "B.Sci");
        Student s2 = new Student("harry", 26, "B.Art");
        Student s3 = new Student("Sally", 30, "M.Art");
        Student s4 = new Student("Tom", 20, "B.Ed");
        Student s5 = new Student("Jerry", 30, "M.Ed");

        //in the main method create an HashSet object
        Set<Student> StudentSet = new HashSet<>();

        //add some Student objects to it
        StudentSet.add(s1);
        StudentSet.add(s2);
        StudentSet.add(s3);
        StudentSet.add(s4);
        StudentSet.add(s5);

         //display the elements of the set
        
         System.out.println("Elements in Set ::"+StudentSet + "\n");

         Student temp = new Student("harry", 26, "B.Art");

         for(Student obj: StudentSet)
         {
             if(obj.equals(temp))
             {
                 System.out.println(obj.hashCode()+ " "+obj.display() );
                 System.out.println(temp.hashCode()+ " "+temp.display());
                 
             }
         }


      
    }
}