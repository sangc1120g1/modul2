import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        String string = "";
        try{
//            Scanner Sc = new Scanner(System.in);
//            System.out.println("Input file");
            File inFile = new File("D:\\modul2\\JavaIO\\data\\test.txt");
            FileReader reader = new FileReader(inFile);
            String line = null;
            BufferedReader bufferedReader = new BufferedReader(reader);
            while ((line=bufferedReader.readLine()) != null){
                string+=line;
            }
            bufferedReader.close();
            FileWriter writer = new FileWriter("D:\\modul2\\JavaIO\\data\\Test1.txt");
            writer.write(string);
            writer.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(string);
    }
}
