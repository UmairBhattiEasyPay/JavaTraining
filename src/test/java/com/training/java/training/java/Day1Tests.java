package com.training.java.training.java;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Day1Tests {

    @Test
    void scenario1() throws IOException {
        var input =FileReader.readDocument("src/main/resources/sampleDay1.txt");
        ElfDocument elfDocument = new ElfDocument();
        int calibrationValue = elfDocument.getCalibrationValue(input);
        assertThat(calibrationValue).isEqualTo(142);
    }

    @Test
    void scenario2() throws IOException {
        var input =FileReader.readDocument("src/main/resources/sampleDay1.txt");
        ElfDocument elfDocument = new ElfDocument();
        int calibrationValue = elfDocument.getCorrectedCalibrationValue(input);
        assertThat(calibrationValue).isEqualTo(281);
    }

}
