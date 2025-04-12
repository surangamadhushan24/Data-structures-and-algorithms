package arrays;

public class ArraysMain {
    public static void main(String[] args) {

        Arrays numbers = new Arrays(3);
        numbers.insert(1);
        numbers.insert(3);
        numbers.insert(5);
        numbers.insert(7);
        numbers.removeAt(3);
        System.out.println("index of 5 :" + numbers.indexOf(5));
        numbers.print();

    }
}
