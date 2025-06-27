package rock.n.patterns.ramones.firstrehearsal;

public class Main {
    public static void main(String[] args) {
        Ramone deeDee = new DeeDee();
        Ramone joey = new Joey();
        Ramone johnny = new Johnny();

        deeDee.reharse();
        johnny.reharse();
        joey.reharse();
    }

}