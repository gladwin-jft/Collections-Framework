import java.util.HashMap;

import java.util.Set;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
public class MapTest 
{
    public static void main(String[] args)
    {
        //in the main method create a HashMap object,
        //add country names and their capitals as key value pairs
        Map<String, String> map_obj = new HashMap<>();
        map_obj.put("Manama","Bahrain");
        map_obj.put("Brasilia", "Brazil");
        map_obj.put("Havana", "Cuba");
        map_obj.put("Addis Ababa", "Ethiopia");
        map_obj.put("Kingston", "Jamaica");

        System.out.println("Hash Map ::::" + map_obj);//display all the key value pairs

        //Create a TreeMap and 
        //add the key-value pairs of the HashMap to it and display them.

        Map<String, String> tree_map_obj = new TreeMap<>();

        tree_map_obj.putAll(map_obj);

        System.out.println("Tree Map ::::" + tree_map_obj);


    }
}
