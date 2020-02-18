import java.util.Stack;

public class SeventhTask {

    public static void main(String[] args) {
        String givenStr = "()[]{}";
        Stack<Character> stack = new Stack<>();
        for (int i = givenStr.length() - 1; i >= 0; i--) {
            stack.push(givenStr.charAt(i));
        }
        int result = 0;
        switch (stack.pop()) {
            case 40:
                if ((int) stack.pop() == 41) {
                    result++;
                }
                switch (stack.pop()) {
                    case 91:
                        if ((int) stack.pop() == 93) {
                            result++;
                        }
                        if ((int) stack.pop() == 123 && (int) stack.pop() == 125) {
                            result++;
                        }
                        break;
                    case 123:
                        if ((int) stack.pop() == 125) {
                            result++;
                        }
                        if ((int) stack.pop() == 91 && (int) stack.pop() == 93) {
                            result++;
                        }
                        break;
                }
                break;
            case 91:
                if ((int) stack.pop() == 93) {
                    result++;
                }
                switch (stack.pop()) {
                    case 40:
                        if ((int) stack.pop() == 41) {
                            result++;
                        }
                        if ((int) stack.pop() == 123 && (int) stack.pop() == 125) {
                            result++;
                        }
                        break;
                    case 123:
                        if ((int) stack.pop() == 125) {
                            result++;
                        }
                        if ((int) stack.pop() == 40 && (int) stack.pop() == 41) {
                            result++;
                        }
                        break;
                }
                break;
            case 123:
                if ((int) stack.pop() == 125) {
                    result++;
                }
                switch (stack.pop()) {
                    case 40:
                        if ((int) stack.pop() == 41) {
                            result++;
                        }
                        if ((int) stack.pop() == 91 && (int) stack.pop() == 93) {
                            result++;
                        }
                        break;
                    case 91:
                        if ((int) stack.pop() == 93) {
                            result++;
                        }
                        if ((int) stack.pop() == 40 && (int) stack.pop() == 41) {
                            result++;
                        }
                        break;
                }
        }
        System.out.println(result == 3);

    }
}
