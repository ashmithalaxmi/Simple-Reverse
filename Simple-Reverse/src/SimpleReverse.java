import java.util.Scanner;

public class SimpleReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] arr = str.toCharArray();
        for(int i=str.length()-1;i>=0;i--)
            System.out.print(arr[i]);

    }
}
