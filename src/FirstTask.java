import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FirstTask {
    public static void main(String[] args) {
        File file = new File("files/first_task_original.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
////        file.delete();

        try {
            FileWriter fw = new FileWriter("files/first_task_original.txt");
            fw.write("first line\n");
            fw.write("second line\n");
            fw.write("third line\n");
            fw.write("fourth line\n");
            fw.write("fifth line\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> list = new LinkedList<>();
        try {
            FileReader fr = new FileReader("files/first_task_original.txt");
            LineNumberReader lnr = new LineNumberReader(fr);
            String s;
            while ((s = lnr.readLine()) != null) {
                list.add(s);
            }
            lnr.close();
            fr.close();
        } catch (IOException e) {
                e.printStackTrace();
        }

        try {
            FileWriter fw = new FileWriter("files/first_task_new.txt");
            for (int i = list.size() - 1; i >= 0; i--) {
                fw.write(list.get(i) + "\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
