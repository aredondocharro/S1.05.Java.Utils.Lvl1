package IO;

import Util.DirectoryFormatter;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class DirectoryPrinter {
    private final DirectoryFormatter formatter;

    public DirectoryPrinter(DirectoryFormatter formatter) {
        this.formatter = formatter;
    }

    public void printDirectoryTree(File directory, int level) {
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println(formatter.getIndent(level) + "Invalid directory: " + directory.getPath());
            return;
        }

        File[] files = directory.listFiles();
        if (files == null) return;

        Arrays.sort(files, Comparator.comparing(f -> f.getName().toLowerCase()));

        for (File file : files) {
            System.out.println(formatter.formatFile(file, level));
            if (file.isDirectory()) {
                printDirectoryTree(file, level + 1);
            }
        }
    }

}