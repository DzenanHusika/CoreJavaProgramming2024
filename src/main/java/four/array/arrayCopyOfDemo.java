package four.array;

import java.util.Arrays;

public class arrayCopyOfDemo {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'a', 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n', 'a', 't', 'e'};
        char[] copyTo = Arrays.copyOfRange(copyFrom, 2, 10);
        System.out.println(copyTo);
    }
}
