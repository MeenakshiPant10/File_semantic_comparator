package com.semantic.comparison;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class FileReaderUtil {
    public static List<String> readFile(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }

    public static List<Path> listFilesInFolder(String folderPath) throws IOException {
        List<Path> fileList = new ArrayList<>();
        Files.walk(Paths.get(folderPath))
             .filter(Files::isRegularFile)
             .forEach(fileList::add);
        return fileList;
    }
}
