package com.training.java.training.java;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() throws IOException {
//		var x = getInput("sampleDay1");
//
//		var result = 0;
// 		System.out.println(x);
//		//assertEquals(x,142);
//		assertThat(result).isEqualTo(142);
	}

	public static List<String> getInput(String fileName) throws IOException {
		var pathname = "src/main/resources/" + fileName + ".txt";
		var sampleInput = Files.readAllLines(new File(pathname).toPath(), Charset.defaultCharset());
		return sampleInput;
	}

}
