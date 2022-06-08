public class App {

    public static void main(String[] args) {

        Adapter Adapter = new Adapter();

        Adapter.add(Position.First, "A");
        Adapter.add(Position.Last, "b");
        Adapter.add(Position.First, "C");

        System.out.println("getFirst:");
        System.out.printf("esperado: C; obtido %s", Adapter.get(Position.First));

        System.out.println("\nremove: C");
        Adapter.remove(Position.First, "C\n");
        System.out.println("getFirst:");
        System.out.printf("esperado: A; obtido %s\n", Adapter.get(Position.First));

        System.out.println("getLast:");
        System.out.printf("esperado: b; obtido %s\n", Adapter.get(Position.Last));
        System.out.println("remove: b");
        Adapter.remove(Position.Last, "b");
        Adapter.add(Position.Last, "C");
        System.out.println("getLast:");
        System.out.printf("esperado: C; obtido %s\n", Adapter.get(Position.Last));
    }

}
