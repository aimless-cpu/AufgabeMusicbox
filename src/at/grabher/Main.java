package at.grabher;

import at.grabher.gui.ConsoleGUI;
import at.grabher.gui.GUI;

public class Main {
    public static void main (String[]argv) {

        MusicBox musicBox = MusicBoxFactory.getBox();

        GUI gui = new ConsoleGUI();
        gui.setBox(musicBox);
        gui.start();

    }
}
