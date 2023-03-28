import java.util.TreeSet;

public class StudentTreeSet {
    public static void main(String[] args) {
        //in the main method create an TreeSet object,
        TreeSet<Student> studentTree = new TreeSet<>();

        //add some Student objects to it

        studentTree.add(new Student("James", 20, "B.Art"));
        studentTree.add(new Student("Harry", 22, "M.Sc"));
        studentTree.add(new Student("Sally", 21, "B.It"));
        studentTree.add(new Student("Jerry", 21, "B.Sc"));
        studentTree.add(new Student("Sally", 21, "M.Art"));

        for(Student st: studentTree) {
            st.display();
        }
        System.out.println("");


        Student temp = new Student("Gladwin", 22, "Mathematics");
        if (studentTree.contains(temp)) {
            System.out.println("found");
        } else {
            System.out.println("Not found");
        }





    }
    
}
