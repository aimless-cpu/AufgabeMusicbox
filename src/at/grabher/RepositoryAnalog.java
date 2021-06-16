package at.grabher;

import java.util.ArrayList;
import java.util.List;

public class RepositoryAnalog {
    private List<RecordVinyl> recordVinyls = new ArrayList<>();

    public List<RecordVinyl> getRecordVinyls() {
        return recordVinyls;
    }

    public void setRecordVinyls(List<RecordVinyl> recordVinyls) {
        this.recordVinyls = recordVinyls;
    }
}
