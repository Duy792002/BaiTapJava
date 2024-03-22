import java.lang.reflect.Array;

public class arr {
    public static void main(String[] args) {
        int[] arr = {1, 7, 5, 6, 2, 9, 8, -1};

        System.out.println("Hien thi mang:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Vi tri phan tu thu 5 la: "+arr[4]);

        System.out.println("Vi tri cac phan tu chan la:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
