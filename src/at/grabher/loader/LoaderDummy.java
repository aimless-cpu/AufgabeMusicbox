package at.grabher.loader;

import at.grabher.MusicBox;
import at.grabher.RecordTitle;
import at.grabher.RecordVinyl;

public class LoaderDummy implements Loader {

    @Override
    public MusicBox getBox() {

        MusicBox musicBox = new MusicBox();

        RecordTitle recordTitle = new RecordTitle("Title Zero", 260);
        RecordTitle recordTitle1 = new RecordTitle("Title One", 260);

        RecordVinyl recordZero = new RecordVinyl("Record Zero", 0);

        recordZero.getRecordTitles().add(recordTitle);
        recordZero.getRecordTitles().add(recordTitle1);

        return musicBox;
    }
}
