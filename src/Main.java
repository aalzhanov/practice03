import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {5, 6, -9, 5, 67, 90, 34};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        numbers[3] = 88;
        System.out.println(numbers[3]);

        String[] names = new String[3];
        names[0] = "john";
        names[1] = "Maksat";
        names[2] = "Ivan";
        System.out.println("введите индекс 0 - 2:");
        Scanner s = new Scanner(System.in);
        System.out.println(names[s.nextInt()]);

        int[][] arr = {{1, 55}, {4, 7}, {9, -7}};
        System.out.println(arr[0][1]);
        System.out.println(arr[2][0]);

        for (int i = 1; i < 5; i = i + 2) {
            System.out.println(i);

        }
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + "*7=" + (i * 7));
        }
        int i = 1;
        while (i <= 9) {
            System.out.println(i + "*5=" + (i * 5));
            i = i + 1; // i ++;
        }
        String str = "#";
        while (str.length() <= 10) {
            str = str + "#";
            System.out.println(str);
            System.out.println(" размер слова =" + str.length());
            str = str + "#";
        }
String name ="BAKYT";
        System.out.println(name .length()>=2);

        String [] robots = new String[100];
        for  (int j=0; j < 100; j++){
            robots[j] = "robot" + j;
            System.out.println(robots [j]);
        }
    }
}
