import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str = "aaaadddddwolls465SWD";
        String[] array = str.split("d");

        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
