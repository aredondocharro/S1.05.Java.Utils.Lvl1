package Util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DirectoryFormatter {
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String formatFile(File file, int level) {
        return String.format("%s%-50s %s  %s",
                getIndent(level),
                file.getName(),
                file.isDirectory() ? "D" : "F",
                dateFormat.format(new Date(file.lastModified())));
    }

    public String getIndent(int level) {
        return "  ".repeat(level);
    }
}