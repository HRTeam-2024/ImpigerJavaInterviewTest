public class Itinerary {

    public static void printItenerary() {
           String[][] srcDstn = {
                   {"KOL", "DEL"},
                   {"TVM", "CHN"},
                   {"CHN", "TVM"},
                   {"MUM", "PUN"},
                   {"BBSR", "KOL"},
                   {"CHN", "BBSR"},
                   {"HYD", "CHN"},
                   {"DEL", "MUM"},
                   {"PUN", "HYD"},
           };
           List<String,String> a = new ArrayList<>(String.asList(srcDstn));
           System.out.println(Collections.sort(a));
    }
   
       public static void main(String[] args) {
   //        begin here
           System.out.println("hello");
           printItenerary();
       }
   }