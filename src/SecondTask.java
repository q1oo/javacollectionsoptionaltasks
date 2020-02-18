import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class SecondTask {
    public static void main(String[] args) {
//        File file = new File("files/second_task_original.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        file.delete();

        try {
            FileWriter fw = new FileWriter("files/second_task_original.txt");
            fw.write(String.valueOf(13579));
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stack<Integer> stack = new Stack<>();
        String data = "";
        try {
            FileReader fr = new FileReader("files/second_task_original.txt");
            LineNumberReader lnr = new LineNumberReader(fr);
            String s;
            while ((s = lnr.readLine()) != null) {
                data += s;
            }
            lnr.close();
            fr.close();
        } catch (IOException e) {
                e.printStackTrace();
        }

        char[] arr = data.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            stack.push((int)(arr[i]));
        }

        try {
            FileWriter fw = new FileWriter("files/second_task_new.txt");
            while (!stack.isEmpty()) {
                fw.write(stack.pop());
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
