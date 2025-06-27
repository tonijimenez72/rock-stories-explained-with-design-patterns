package rock.n.patterns.ramones.firstrehearsal;

abstract class Ramone {
    protected String name;

    public Ramone(String name) {
        this.name = name;
    }

    public void reharse() {
        counTilFour();
        playDrums();
        playGuitar();
        playBass();
        sing();

    }

    private void playGuitar() {
        System.out.println(name + " plays guitar.");
    }

    private void playDrums() {
        System.out.println(name + " plays drums.");
    }

    private void playBass() {
        System.out.println(name + " plays Bass.");
    }

    private void sing() {
        System.out.println(name + " sings.");
    }

    private void counTilFour() {
        System.out.println(name + " says 1, 2, 3, 4 !!!.");
    }
}
