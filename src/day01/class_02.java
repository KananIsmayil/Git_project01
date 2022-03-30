package day01;

public class class_02 {

    public static void main(String[] args) {

        String name ="Java";

        String reversed ="";

        for (int i = name.length()-1; i >=0 ; i--) {
            reversed+=name.charAt(i);
        }

        System.out.println(reversed);


    }

}
