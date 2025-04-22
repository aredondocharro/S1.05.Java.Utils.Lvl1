package IO;

import Util.DirectoryFormatter;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Comparator;

public class DirectoryWriter {
    private final DirectoryFormatter formatter;

    public DirectoryWriter(DirectoryFormatter formatter) {
        this.formatter = formatter;
    }


    public void writeDirectoryTree(File directory, int level, Writer writer) throws IOException {

        if (!directory.exists() || !directory.isDirectory()) {
            writer.write(formatter.getIndent(level) + "Invalid directory: " + directory.getPath() + "\n");
            return;
        }

        File[] files = directory.listFiles();
        if (files == null) return;

        Arrays.sort(files, Comparator.comparing(f -> f.getName().toLowerCase()));

        for (File file : files) {
            writer.write(formatter.formatFile(file, level) + "\n");
            if (file.isDirectory()) {
                writeDirectoryTree(file, level + 1, writer);
            }
        }
    }
}