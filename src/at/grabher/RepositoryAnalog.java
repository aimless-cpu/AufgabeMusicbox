package at.grabher;

import at.grabher.loader.LoaderDummy;

import java.util.ArrayList;
import java.util.List;

public class RepositoryAnalog implements Records {
    private List<RecordVinyl> recordVinyls = new ArrayList<>();

    RecordVinyl recordToLoad;


    //methods
    public void addRecord(int input, MusicBox musicBox) {
        //if (recordVinyls.add(input) != null) {

        //musicBox.getRecordsList().
        recordVinyls.add((RecordVinyl) musicBox.getRecordsList().get(input));
        System.out.println(recordVinyls.get(input).getRecordName() + "is added to the repository");


        //} else {
        //System.out.println("no record found to add!");  //error
        //}
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
