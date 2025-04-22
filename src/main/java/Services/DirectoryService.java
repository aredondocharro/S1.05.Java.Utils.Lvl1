package Services;

import IO.DirectoryPrinter;
import IO.DirectoryWriter;
import Util.DirectoryFormatter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DirectoryService {
    private final DirectoryFormatter formatter = new DirectoryFormatter();
    private final DirectoryPrinter printer = new DirectoryPrinter(formatter);
    private final DirectoryWriter writer = new DirectoryWriter(formatter);

    public void printListDirectory(String path) {
        printer.printDirectoryTree(new File(path), 0);
    }

    public void writeListDirectory(String dirToScan, String outputFilePath) {
        File directory = new File(dirToScan);
        File outputFile = new File(outputFilePath);

        try (FileWriter fw = new FileWriter(outputFile)) {
            writer.writeDirectoryTree(directory, 0, fw);
        } catch (IOException e) {
            System.err.println("Error saving file: " + e.getMessage());
        }
    }
}