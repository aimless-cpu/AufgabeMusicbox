package at.grabher;

import java.util.List;
import java.util.Map;

public class RecordTitle{

    //instances
    private String titleName;
    private int titleLength;


    //constructor
    public RecordTitle(String titleName, int titleLength) {
        this.titleName = titleName;
        this.titleLength = titleLength;
    }

    //getter setter
    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public int getTitleLength() {
        return titleLength;
    }

    public void setTitleLength(int titleLength) {
        this.titleLength = titleLength;
    }

}
