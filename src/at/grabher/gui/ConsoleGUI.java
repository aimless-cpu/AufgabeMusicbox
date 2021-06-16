package at.grabher.gui;

import at.grabher.MusicBox;
import at.grabher.RepositoryAnalog;

import java.util.Scanner;

public class ConsoleGUI implements GUI{

    //instance
    private MusicBox musicBox;

    //methods
    @Override
    public void start() {
        String searchString;
        int input;
        Scanner scanner = new Scanner(System.in);

        RepositoryAnalog repositoryAnalog = new RepositoryAnalog();

        input = scanner.nextInt();
        repositoryAnalog.addRecord(input,musicBox);

        repositoryAnalog.playRecord();

        input = scanner.nextInt();
        repositoryAnalog.loadRecord(input);

        repositoryAnalog.playRecord();
    }


    @Override
    public void setBox(MusicBox box) {
        this.musicBox = box;
    }

}
