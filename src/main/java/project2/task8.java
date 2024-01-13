package project2;

import java.util.ArrayList;

public class task8 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Bella");
        names.add("James");
        names.add("Amber");
        names.add("Lily");

        for(int i=0;i< names.size();i++){
            if(names.get(i).startsWith("A"))

                System.out.println(names.get(i).toLowerCase());

        }

}}
