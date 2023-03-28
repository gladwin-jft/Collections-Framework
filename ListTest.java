import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class ListTest{

    public static void main(String[] args)
    {
        /*Create ArrayList object, 
        add some strings to it */

        //driver();
        String input = null;
        int position ;
        List <String> names = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        names.add("Harry");
        names.add("Sally");
        names.add("James");
        names.add("Tom");
        names.add("Jerry");
        display(names);

       /*  do
        {
            input = sc.next();
            names.add(input); 
            
            display(names);
        }while(!(input.equals("0")));*/

        System.out.println("Enter name : ");
        input = sc.nextLine();
        System.out.println("Enter Position : ");
        position = sc.nextInt();
        names.add(position-1, input);


        display(names);

        System.out.println("Enter name to remove ");
        input = sc.next();
    
        names.remove(input);
        display(names);

    }
    static void driver()
    {
        List <String> names = new ArrayList<>();

        names.add("Harry");
        names.add("Sally");
        names.add("James");
        names.add("Tom");
        names.add("Jerry");

        display(names);//display the elements of the list

        names.add(2, "Bill");//insert some strings at specified positions

        display(names);//display the elements of the list


        //Search an element in the list and remove an element from the list

        Iterator iter = names.iterator();
        for(String s: names)
        {
            if(s.equals("James"))
            {
                System.out.println("True");
            }
        }

    }
    static void display(List names)
    {
        System.out.println(names);
    }
    
}
