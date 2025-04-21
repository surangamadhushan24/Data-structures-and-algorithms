package stack;

public class StackMain {
    public static void main(String[] args) {
//        String str = "abcd";
//        StringReverser sr = new StringReverser();
//        System.out.println(sr.stringreverse(str));
        String str = "(1 + 2)";
        BalancedString bs = new BalancedString();
        System.out.println(bs.isBalance(str));
    }
}
