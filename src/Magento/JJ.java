package Magento;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.io.Files;

public class JJ {

	public static void main(String[] args) {
	    String fileName = "./a.txt";
	    try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
	        String result = stream.map(s -> s.split("\\s+"))
	                              .map(s -> Arrays.stream(s).collect(Collectors.joining(","))+"\n")
	                              .collect(Collectors.joining());
	        System.out.println(result);

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
}
}