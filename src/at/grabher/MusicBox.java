package at.grabher;

import java.util.*;

public class MusicBox {
    public static void main (String[]argv) {


        List<VinylRecord> recordList;
        VinylRecord recordToLoad;
        String searchString;
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> titleMap = new HashMap<>();

        
        titleMap.put("Title Zero", 120);
        titleMap.put("Title One", 160);

        VinylRecord vinylRecord = new VinylRecord("Record Zero", 0, titleMap);

        recordList = new ArrayList<>();
        recordList.add(vinylRecord);

        searchString = scanner.nextLine();
        searchRecord(recordList, searchString);


        //add record
        //remove record
        //get sum of music == length all loaded records
        //play record

        //public void loadRecord(VinylRecord recordToLoad) {


    }

    private static void searchRecord(List<VinylRecord> recordList, String searchString) {

        for (int i = 0; i < recordList.size(); i++ ) {
            if (recordList.get(i).getRecordName().matches(searchString)) {
                System.out.print("found: ");
                System.out.println(recordList.get(i).getRecordName() + " with the ID: " + recordList.get(i).getRecordID());
            }
        }
    }

}

