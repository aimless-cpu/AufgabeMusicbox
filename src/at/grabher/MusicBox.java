package at.grabher;

import java.util.*;

public class MusicBox {
    public static void main (String[]argv) {

        List<RecordVinyl> recordList;
        RecordVinyl recordToLoad;
        String searchString;
        Scanner scanner = new Scanner(System.in);


        RecordTitle recordTitle = new RecordTitle("Title Zero", 260);
        RecordTitle recordTitle1 = new RecordTitle("Title One", 260);

        RecordVinyl recordZero = new RecordVinyl("Record Zero", 0);

        recordZero.getRecordTitles().add(recordTitle);
        recordZero.getRecordTitles().add(recordTitle1);


        recordZero.getRecordTitles().add(recordTitle);

        recordZero.getRecordTitles();

        System.out.println("whatever");


//        RecordVinyl recordVinyl;
//
//        recordVinyl.recordTitles.add(recordTitle);
//
//        List<RecordTitle> recordTitles;
//        recordVinyl = new RecordVinyl("Record Zero", 0, recordTitles);



//
//        RecordVinyl recordVinyl = new RecordVinyl("Record Zero", 0);
//
//        recordList = new ArrayList<>();
//        recordList.add(recordVinyl);
//
//        searchString = scanner.nextLine();
//        searchRecord(recordList, searchString);


        //add record
        //remove record
        //get sum of music == length all loaded records
        //play record

        //public void loadRecord(VinylRecord recordToLoad) {


    }

    private static void searchRecord(List<RecordVinyl> recordList, String searchString) {

        for (int i = 0; i < recordList.size(); i++ ) {
            if (recordList.get(i).getRecordName().matches(searchString)) {
                System.out.print("found: ");
                System.out.println(recordList.get(i).getRecordName() + " with the ID: " + recordList.get(i).getRecordID());
            }
        }
    }

}

