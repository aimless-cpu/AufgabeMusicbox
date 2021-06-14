package at.grabher;

import java.util.Map;

public class VinylRecord {
    //instance
    private String recordName;
    private int recordID;
    private Map<String, Integer> titleMap;

    //constructor

    public VinylRecord(String recordName, int recordID, Map<String, Integer> titleMap) {
        this.recordName = recordName;
        this.recordID = recordID;
        this.titleMap = titleMap;
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

    public Map<String, Integer> getTitleMap() {
        return titleMap;
    }

    public void setTitleMap(Map<String, Integer> titleMap) {
        this.titleMap = titleMap;
    }
}
