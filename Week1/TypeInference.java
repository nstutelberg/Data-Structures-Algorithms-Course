package Week1;

public class TypeInference {
    public static int addFunc(int a, int b) {
        return a + b;
    }
    public static String addTextFunc(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(addFunc(4,6));
        //System.out.println(addFunc("hi","hello")); //returns an error because you need to specify the type
        System.out.println(addTextFunc("hi", "hello"));
    }
}
