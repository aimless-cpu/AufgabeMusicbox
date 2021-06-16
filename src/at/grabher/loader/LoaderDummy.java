package at.grabher.loader;

import at.grabher.MusicBox;
import at.grabher.RecordTitle;
import at.grabher.RecordVinyl;
import at.grabher.Records;

import java.util.ArrayList;
import java.util.List;

public class LoaderDummy { // implements Loader {

    public static MusicBox getBox() {
        //instances

        List<Records> recordsList = new ArrayList<>();

        //making titles
        RecordTitle recordTitle = new RecordTitle("Title Zero", 260);
        RecordTitle recordTitle1 = new RecordTitle("Title One", 260);

        //making record
        RecordVinyl recordZero = new RecordVinyl("Record Zero", 0);

        //adding titles
        recordZero.getRecordTitles().add(recordTitle);
        recordZero.getRecordTitles().add(recordTitle1);

        //adding records
        recordsList.add(recordZero);
        MusicBox musicBox = new MusicBox(recordsList);
        return musicBox;
    }
}
