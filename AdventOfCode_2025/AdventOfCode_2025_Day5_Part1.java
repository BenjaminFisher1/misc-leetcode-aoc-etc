import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException; 
import java.io.*;

public class AdventOfCode_2025_Day5_Part1 {
    public static void main(String[] args) throws IOException {
        ArrayList<long[]> al = new ArrayList<>();
        ArrayList<Long> ids = new ArrayList<>();
        int count = 0;
        boolean ranges = true;
        FileReader fr = new FileReader("aoc_input.txt");
        try  (Scanner scanner = new Scanner(fr)){

            //read ranges
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                
                // Check if this line is blank before processing
                if(data.isBlank()){
                    ranges = false;
                    break;
                }
                
                String[] chunk1 = data.split("-");
                long chunk1Long = Long.parseLong(chunk1[0]);
                long chunk2Long = Long.parseLong(chunk1[1]);

                al.add(new long[]{chunk1Long, chunk2Long});
            }

            //read ids
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();

                if(!data.contains("-")){
                    long id = Long.parseLong(data);
                    ids.add(id);
                }
                
            }
           


            //check ids against ranges
            for(long id : ids){
                System.out.println("Checking ID: " + id);
                for(long[] range : al){
                    if(id >= range[0] && id <= range[1]){
                        count++;
                        break;
                    }
                }
                
            }
            System.out.println("Total IDs in range: " + count);

        }
       


}
}
