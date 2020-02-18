import java.util.LinkedList;
import java.util.List;

public class ThirdTask {
    public static void main(String[] args) {
        List<Catalog> list = new LinkedList<>();
        list.add(new Catalog());
        list.add(new Subcatalog());
        list.add(new Catalog());
        list.add(new Subcatalog());
        list.add(new Subcatalog());
    }
}

class Catalog{}

class Subcatalog extends Catalog{}
