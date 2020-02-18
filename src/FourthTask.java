import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class FourthTask {
    public static void main(String[] args) {
        List<String> poem = new LinkedList<>();
        try {
            FileReader fr = new FileReader("files/fourth_task_original.txt");
            LineNumberReader lnr = new LineNumberReader(fr);
            String s;
            while ((s = lnr.readLine()) != null) {
                poem.add(s);
            }
            lnr.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        poem.sort(new PoemStringLineComporator());

        try {
            FileWriter fw = new FileWriter("files/fourth_task_new.txt");
            for (int i = 0; i < poem.size(); i++) {
                fw.write(poem.get(i) + "\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class PoemStringLineComporator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() - o2.length() > 0) {
            return 1;
        } else if (o1.length() - o2.length() < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
