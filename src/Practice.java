import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Practice {
    public static void reverseIntegerArray(int[] array){
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i< array.length; i++){
            stack.push(array[i]);
        }
        int size = stack.size();
        for (int j=0; j<size; j++){
            array[j] = stack.pop();
        }
    }

    public static String[] reverseStringArray(String string){
        Stack<String> stack = new Stack<>();
        String[] strings = string.split("\\s");
        for (int i=0; i< strings.length; i++){
            stack.push(strings[i]);
        }
        int size = stack.size();
        for (int j = 0; j<size; j++){
            strings[j] = stack.pop();
        }
        return strings;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3,4,5};
        reverseIntegerArray(array);
        for (int arr : array){
            System.out.println(arr);
        }
        String chuoi = sc.nextLine();
        String[] strings = reverseStringArray(chuoi);
        System.out.println(Arrays.toString(strings));
    }
}
