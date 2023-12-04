package com.training.java.training.java;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class FileReader {

    private FileReader(){

    }

    /**
     * Create a method that find the calibration value per line. Afterward add this value to the currently accumulated number of calibration values you find previously
     * @return
     * @throws IOException
     */
    public static List<String> readDocument(String documentPath) throws IOException {
        return Files.readAllLines(new File(documentPath).toPath(), Charset.defaultCharset());
    }
}
