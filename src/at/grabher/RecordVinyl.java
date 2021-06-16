package at.grabher;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RecordVinyl implements Records{
    //instance
    private String recordName;
    private int recordID;
    private List<RecordTitle> recordTitles = new ArrayList<>();


    //constructor

    public RecordVinyl(String recordName, int recordID) {
        this.recordName = recordName;
        this.recordID = recordID;
    }


    //method





    //get set

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public int getRecordID() {
        return recordID;
    }

    public void setRecordID(int recordID) {
        this.recordID = recordID;
    }

    public List<RecordTitle> getRecordTitles() {
        return recordTitles;
    }

    public void setRecordTitles(List<RecordTitle> recordTitles) {
        this.recordTitles = recordTitles;
    }

}
