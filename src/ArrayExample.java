import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    private Integer[] createRandom() {
        Random rd = new Random();
        Integer[] array = new Integer[100];
        System.out.println("danh sách phan tư trong mang :  ");
        for (int i = 0; i < 100; i++) {
            array[i] = rd.nextInt(100);
            System.out.println(array[i] + " ");

        }
        return array;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] array = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" input  chi so cua mot phan tu bat ki : ");
        int x = scanner.nextInt();
        try {
            System.out.println("gia tri cua phan tu co chi so 5"+x+ "la" +array[x]);
        }catch (IndexOutOfBoundsException k){
            System.out.println("chi so vuot qua gioi han cua mang ");
        }

    }
}
