package junit.filehandling;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.regexandjunit.junit.filehandling.FileProcessor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class FileProcessorTest {

	// FileProcessor object for testing
	private final FileProcessor fileProcessor = new FileProcessor();

	// Test file path
	private final Path testFile = Path.of("testFile.txt");

	// Tests writing and reading file content
	@Test
	void testWriteAndReadFile() throws IOException {
		String content = "Hello JUnit File Test";

		fileProcessor.writeToFile(testFile.toString(), content);
		String result = fileProcessor.readFromFile(testFile.toString());

		assertEquals(content, result);
	}

	// Tests if file exists after writing
	@Test
	void testFileExistsAfterWrite() throws IOException {
		fileProcessor.writeToFile(testFile.toString(), "File exists test");
		assertTrue(Files.exists(testFile));
	}

	// Tests exception when reading non-existing file
	@Test
	void testReadFileNotFoundException() {
		assertThrows(IOException.class, () -> {
			fileProcessor.readFromFile("non_existing_file.txt");
		});
	}

	// Cleans up test file after each test
	@AfterEach
	void cleanUp() throws IOException {
		Files.deleteIfExists(testFile);
	}
}
