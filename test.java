using java

public static void main(String[] args) {

    List<String> myList = new ArrayList<>();

    myList.add("Bret");

    myList.add("Suhas");

    myList.add("Shilad");

    myList.add("Susan");



    for(String name : myList){

        if (name.equals("Suhas") || name.equals("Shilad")){

            myList.remove(name);

        }

    }

    myList.stream().forEach(System.out::println);

}