import java.util.HashMap;

public class Hash_MapProg {
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Chaitanya",50);
        map.put("Sai",17);
        map.put("Raghu",74);
        map.put("Array",34);
        System.out.println("Size of map is:- "+ map.size());
        System.out.println(map);
        map.replace("Chaitanya",45);
        System.out.println(map);
    }
}