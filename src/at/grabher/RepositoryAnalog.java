package at.grabher;

import java.util.ArrayList;
import java.util.List;

public class RepositoryAnalog implements RecordInterface{
    private List<RecordVinyl> recordVinyls = new ArrayList<>();

    RecordVinyl recordToLoad;


    //methods
    public void addRecord(int input) {
        //if (recordVinyls.add(input) != null) {
        recordVinyls.add(recordVinyls.add(input));
        //} else {
        System.out.println("no record found to add!");  //error
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
