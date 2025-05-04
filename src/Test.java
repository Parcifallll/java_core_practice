import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] arr = {2000, 2020, 1900, 0, 400, 8};
        for (int year : arr) {
            if (year % 400 == 0) System.out.println(year + "True");
            else if (year % 4 == 0 && year % 100 != 0) System.out.println(year + "True");
        }
    }
}
