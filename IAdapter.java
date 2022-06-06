package pucrs;

enum Position {First, Last};

public interface IAdapter{

public void add(Position p, String s);

public void remove(Position p, String s);

public String get(Position p);
}