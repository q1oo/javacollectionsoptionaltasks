import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EighthTask {
    public static void main(String[] args) {
        List<Character> listOfChars = new ArrayList<>();
        Set<String> setOfWords = new HashSet<>();
        try {
            FileReader fr = new FileReader("files/eighth_task_original.txt");
            LineNumberReader lnr = new LineNumberReader(fr);
            String s;
            for (int i = 0; i < 3814; i++) {
                listOfChars.add((char)lnr.read());
            }
            lnr.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < listOfChars.size(); i++) {
            if ((int)listOfChars.get(i) != 32 && (int)listOfChars.get(i) < 65) {
                listOfChars.remove(i);
            }
        }
        for (int i = 0; i < listOfChars.size(); i++) {
            if ((int)listOfChars.get(i) > 90 && (int)listOfChars.get(i) < 97) {
                listOfChars.remove(i);
            }
        }
        for (int i = 0; i < listOfChars.size(); i++) {
            if ((int)listOfChars.get(i) > 122) {
                listOfChars.remove(i);
            }
        }
        String word = "";
        for (int i = 0; i < listOfChars.size(); i++) {
            if ((int) listOfChars.get(i) == 32) {
                setOfWords.add(word);
                word = "";
            } else {
                word = word + String.valueOf(listOfChars.get(i));
            }
        }
        try {
            FileWriter fw = new FileWriter("files/eighth_task_new.txt");
            for (String w : setOfWords) {
                fw.write(w + " ");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
