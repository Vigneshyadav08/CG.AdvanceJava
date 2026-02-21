package com.fileread;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class TestFileReadContent {
	@Test
	public void test() throws IOException,EmptyFileException
	{
		FileReadContent f = new FileReadContent();
		
		assertThrows(IOException.class,() -> f.readContent("abc.txt"));
		assertEquals("DudeHow are you",f.readContent("src/com/fileread/text.txt"));
	}
}

