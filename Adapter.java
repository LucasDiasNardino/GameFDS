

import java.util.LinkedList;

public class Adapter {

    LinkedList<String> lista = new LinkedList();

    public void add(Position p, String s) {
        if (p == Position.First) {
            lista.addFirst(s);
        } else {
            lista.addLast(s);
        }

    }

    public void remove(Position p, String s) {
        if (p == Position.First) {
            lista.removeFirst();
        } else {
            lista.removeLast();
        }

    }

    public String get(Position p) {
        String aux;
        if (p == Position.First) {
            aux = lista.getFirst();
        } else {
            aux = lista.getLast();
        }
        return aux;
    }

}
