import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SixthTask {
    public static void main(String[] args) {
        List<String> song = new ArrayList<>();
        try {
            FileReader fr = new FileReader("files/sixth_task_original.txt");
            LineNumberReader lnr = new LineNumberReader(fr);
            String s;
            while ((s = lnr.readLine()) != null) {
                song.add(s);
            }
            lnr.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        song.sort(new PoemStringLineComporator1());

        try {
            FileWriter fw = new FileWriter("files/sixth_task_new.txt");
            for (int i = 0; i < song.size(); i++) {
                fw.write(song.get(i) + "\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class PoemStringLineComporator1 implements Comparator<String> {
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
