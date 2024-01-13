package project2;

public class task9 {
    public static void main(String[] args) {

String s="abracadabra";

for(Character c: s.toCharArray()){
                if(s.indexOf(c) == s.lastIndexOf(c)){
                    System.out.println("First nonrepeating character is "+c);
                    break;
                }
            }


    }
}
