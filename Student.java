import java.util.Comparator;
public class Student implements Comparable<Student>//Create a class named Student
    {
        //which has name, age, course as data members
        String name;
        int age;
        String course;
      
    
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String display() {
        
        return "\nName: " + name + " Age: " + age + " Course: " + course +"\n";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
               name.equals(student.name) &&
                course.equals(student.course);

    }
    @Override
    public int hashCode(){
        return this.age + this.name.hashCode() + this.course.hashCode();
        

    }
    public int compareTo(Student obj) {
        if(!this.equals(obj))
            return (this.name.compareToIgnoreCase(obj.name));
        return 0;
    }
}

