import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        int i = 2;//除数
        int j;//被除数
        boolean flag = true;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("please input prime number:");
        int input_number = input.nextInt();
            while (count < input_number) {
                for (j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag == true) {
                    System.out.print(i + "\t");
                    count++;
                    if (count % 10 == 0) {
                        System.out.println();
                    }
                }
                i++;
                flag = true;

            }
    }
}
