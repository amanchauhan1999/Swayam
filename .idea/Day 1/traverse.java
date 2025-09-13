import java.util.Scanner;
import java.util.Stack;

public class PRANTHESIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stk = new Stack<>();

        String input = sc.nextLine();

        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == '(' || charArray[i] == '{' || charArray[i] =='['){
                stk.push(charArray[i]);
            } else if ( stk.empty()){
                System.out.println("Balanced");
                return;
            } else{
                if (stk.peek() == charArray[i]){
                    stk.pop();
                }else {
                    System.out.println("Not Balanced");
                    return;
                }
            }

        }
    }
}
