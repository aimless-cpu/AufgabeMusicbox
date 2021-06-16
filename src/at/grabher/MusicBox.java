package at.grabher;

import java.util.*;

public class MusicBox {

    List<Records> recordsList = new ArrayList<>();

    public MusicBox(List<Records> recordsList) {
        this.recordsList = recordsList;
    }

    public List<Records> getRecordsList() {
        return recordsList;
    }
}

