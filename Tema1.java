import java.util.ArrayList;

public class Tema1 {

    public static void main(String[] args) {
        
        ArrayList<Object> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");  
        
        swapFirstLast(list);
        System.out.println(list); 
    }

    private static void swapFirstLast(ArrayList<Object> list) {
        
        Object nr = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.set(list.size() - 1, nr);
    }
}