// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;




import java.util.*;


public class TrainingRecord {
    private List<Entry> tr;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } //constructor


    // add a record to the list
   public void addEntry(Entry e){
            tr.add(e);
   } // addClass
   
   // look up the entry of a given day and month
   public String lookupEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "No entries found";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result = current.getEntry();
            }
       return result;
   } // lookupEntry

    /**
     * Task 2
     * Returns all entries of a given day, month and year
     * @param d day
     * @param m month
     * @param y year
     * @return list of all matching entries Or "No entries found"
     */
    public String FindAllEntries(int d, int m, int y) {
        ListIterator<Entry> iteratr = tr.listIterator();
        ArrayList<Entry> entries = new ArrayList<>();
        while (iteratr.hasNext()) {
            Entry current = iteratr.next();
            if (current.getDay() == d && current.getMonth() == m && current.getYear() == y) {
                entries.add(current);
            }
        }
        if (entries.isEmpty()) {
            return "No entries found";
        } else {
            return matchedEntriesToString(entries);
        }
    }

        /**
         * Task 2
         * Returns all matching entries as a String
         * @param entries ArrayList of entry objects of entries
         * @return all matching entries as a String
         */
        public String matchedEntriesToString(ArrayList<Entry> entries) {
            StringBuilder strings = new StringBuilder();
            for (Entry entry : entries) {
                strings.append(entry.getEntry());
            }
            return strings.toString();
        }

    /**
     * Task 11 implementation of remove button
     * @param name
     * @param day
     * @param month
     * @param year
     */
    public void removeEverything(String name, int day, int month, int year) {
        ListIterator<Entry> iter = tr.listIterator();
        Entry search = null;

        while (iter.hasNext()) {
            Entry current = iter.next();
            if ( current.getName().equals(name) &&
                    current.getDay()== day &&
                    current.getMonth()== month &&
                    current.getYear()== year) {
                search = current;
            }
        }

        if (search != null) {
            tr.remove(search);
        }
    }


   // Count the number of entries
   public int getNumberOfEntries(){
       return tr.size();
   }
   // Clear all entries
   public void clearAllEntries(){
       tr.clear();
   }
   
} // TrainingRecord