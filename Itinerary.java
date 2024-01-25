package org.example;

public class Itinerary {


    public static void main(String[] args) {
//        begin here
    	System.out.println("hello");
        printItenerary();
    }

    // Below are multiple iteneraries from TVM to TVM.
    // Arrange them in order and print
    private static void printItenerary() {
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

        Map<String,String> result = new HashMap<>();
        for (int i=0;i<srcDstn.length;i++){
            for (int j=0;i<srcDstn.length-1;j++){
                if(srcDstn[i][0].equalsIgnoreCase(srcDstn[j][1])){
                    result.put(srcDstn[i][0],srcDstn[j][1]);
                    break;
                }
            }
        }
        System.out.println(result);
    }
}