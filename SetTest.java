import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
public class SetTest 
{
    public static void main(String[] args)
    {
        /*Define a class named SetTest, in the main method create a HashSet object, */
        Set<String> hash_obj = new HashSet<String>();
        hash_obj.add("A");//Add Strings to them
        hash_obj.add("B");
        hash_obj.add("C");
        hash_obj.add("D");
        hash_obj.add("E");

        System.out.println("Elements in HashSet Object "+ hash_obj);// Display them

        //create a TreeSet and all the elements of the hashset to 
        //it and display the elements of the TreeSet.

        Set<String> tree_obj = new TreeSet<>();

        
        tree_obj.addAll(hash_obj);
           
        
        System.out.println("Elements in Tree Objects " + tree_obj);


    }
}
