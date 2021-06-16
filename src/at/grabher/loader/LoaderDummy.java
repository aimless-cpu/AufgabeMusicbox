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

        RecordTitle recordTitle2 = new RecordTitle("Title Two", 260);

        RecordTitle recordTitle3 = new RecordTitle("Title Three", 260);

        //making record
        RecordVinyl recordZero = new RecordVinyl("Record Zero", 0);
        RecordVinyl recordOne = new RecordVinyl("Record One", 1);
        RecordVinyl recordTwo = new RecordVinyl("Record Two", 2);


        //adding titles
        recordZero.getRecordTitles().add(recordTitle);
        recordZero.getRecordTitles().add(recordTitle1);

        recordOne.getRecordTitles().add(recordTitle2);

        recordTwo.getRecordTitles().add(recordTitle3);

        //adding records
        recordsList.add(recordZero);
        recordsList.add(recordOne);
        recordsList.add(recordTwo);


        MusicBox musicBox = new MusicBox(recordsList);

        return musicBox;

    }


}
