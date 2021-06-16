package at.grabher;

import java.util.ArrayList;
import java.util.List;

public class RepositoryAnalog implements RecordInterface{
    private List<RecordVinyl> recordVinyls = new ArrayList<>();
    RecordVinyl recordToLoad;


    //methods
    public void loadRecord(int input) {
        recordToLoad = recordVinyls.get(input);
        System.out.println(recordToLoad.getRecordName());
    }

    public void playRecord() {
        System.out.println("playing now: " + recordToLoad.getRecordName());
    }



    public List<RecordVinyl> getRecordVinyls() {
        return recordVinyls;
    }

    public void setRecordVinyls(List<RecordVinyl> recordVinyls) {
        this.recordVinyls = recordVinyls;
    }
}
