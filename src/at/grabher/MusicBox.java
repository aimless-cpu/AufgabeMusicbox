package at.grabher;

import java.util.*;

public class MusicBox{

    List<Records> recordsList = new ArrayList<>();

    //methods
    public void printList() {

        for (int i = 0; i < recordsList.size(); i++) {
            RecordVinyl print;
            print = (RecordVinyl) recordsList.get(i);
            System.out.print(print.getRecordID());
            System.out.print(" at postion: ");
            System.out.println(print.getRecordName());
        }

    }


    //getter setter

    public MusicBox(List<Records> recordsList) {
        this.recordsList = recordsList;
    }

    public List<Records> getRecordsList() {
        return recordsList;
    }



}

