import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> hehe = new MyArrayList<>();
        Integer ok = 2;
        hehe.add(ok);
        hehe.add(ok);
        System.out.println(hehe.get(1));
        hehe.clear();
        System.out.println(hehe.get(1));
    }
}
