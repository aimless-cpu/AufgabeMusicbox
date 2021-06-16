package at.grabher;

import at.grabher.loader.LoaderDummy;

import java.util.ArrayList;
import java.util.List;

public class RepositoryAnalog implements Records {
    private List<RecordVinyl> recordVinyls = new ArrayList<>();

    RecordVinyl recordToLoad;


    //methods
    public void printList() {
        for (int i = 0; i < recordVinyls.size(); i++) {
            System.out.print(recordVinyls.get(i).getRecordName());
            System.out.print(" at position: ");
            System.out.println(recordVinyls.get(i).getRecordID());
        }

    }
    public void addRecord(int input, MusicBox musicBox) {

        recordVinyls.add((RecordVinyl) musicBox.getRecordsList().get(input));
        System.out.println(recordVinyls.get(input).getRecordName() + " is added to the repository");

    }

    public void loadRecord(int input) {

            recordToLoad = recordVinyls.get(input);
            System.out.println(recordToLoad.getRecordName());

    }

    public void playRecord() {
        if (recordToLoad != null) {
            System.out.println("playing now: " + recordToLoad.getRecordName());
        } else {
            System.out.println("no record loaded!");    //error
        }
    }



    public List<RecordVinyl> getRecordVinyls() {
        return recordVinyls;
    }

    public void setRecordVinyls(List<RecordVinyl> recordVinyls) {
        this.recordVinyls = recordVinyls;
    }
}
