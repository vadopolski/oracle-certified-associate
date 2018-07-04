package garbagecollection;
public class Scope {
    public static void main(String[] args) {
        String one, two;
        one = new String("o");
        two = new String("b");
        one = two;
        String three = one;
        one = null;
    }



}
