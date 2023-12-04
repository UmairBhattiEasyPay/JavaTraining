package com.training.java.training.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Application.class, args);
		var input =FileReader.readDocument("src/main/resources/inputDay1.txt");
		ElfDocument elfDocument = new ElfDocument();
		int calibrationValue = elfDocument.getCalibrationValue(input);
		System.out.println("CalibrationValue: " + calibrationValue);
	}

}
