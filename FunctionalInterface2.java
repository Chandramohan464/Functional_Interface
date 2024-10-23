//Example for Functional Interface with object class methods
@FunctionalInterface
interface sayable {
    void say(String msg);
    int hashCode();
    String toString();
    boolean equals(Object obj);
}

public class FunctionalInterface2 implements sayable{
    public void say(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterface2 f2 = new FunctionalInterface2();
        f2.say("Hello there!");
    }
}
