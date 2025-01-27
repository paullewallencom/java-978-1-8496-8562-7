package packt;

import java.io.File;
import java.io.IOException;

public class RedirectingInputAndOutputFromOperatingSystemsProcesses {

    public static void main(String[] args) {
        try {
        File commands = new File("C:/Projects/ProcessCommands.txt");
        File output = new File("C:/Projects/ProcessLog.txt");
        File errors = new File("C:/Projects/ErrorLog.txt");

        ProcessBuilder pb = new ProcessBuilder("cmd");
        System.out.println(pb.redirectInput().toString());
        System.out.println(pb.redirectOutput().toString());
        System.out.println(pb.redirectError().toString());

        pb.redirectInput(commands);
        pb.redirectError(errors);
        pb.redirectOutput(output);
        System.out.println(pb.redirectInput().toString());
        System.out.println(pb.redirectOutput().toString());
        System.out.println(pb.redirectError().toString());

        pb.start();
        } 
        catch(IOException ex) {
            ex.printStackTrace();
        }

    }
}
