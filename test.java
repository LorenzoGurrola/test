import java.util.*;

public class test {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Bret");
        myList.add("Suhas");
        myList.add("Shilad");
        myList.add("Susan");
        List<String> removeList = new ArrayList<>();
        for(String name : myList){
            if (name.equals("Suhas") || name.equals("Shilad")){
                removeList.add(name);
            }
        }
        for(String name : removeList){
                myList.remove(name);
        }
    
        myList.stream().forEach(System.out::println);
    }


}