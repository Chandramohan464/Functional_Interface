//Simple Example
@FunctionalInterface
interface sayable{
    void say(String msg);
}

class FunctionalInterface1 implements sayable{
    public void say(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterface1 f=new FunctionalInterface1();
        f.say("Hello, World!");
    }
}