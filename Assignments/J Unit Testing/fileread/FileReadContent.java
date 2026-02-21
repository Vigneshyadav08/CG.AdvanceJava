package com.fileread;

import java.io.*;
public class FileReadContent {
	public String readContent(String filePath)
	throws IOException, EmptyFileException
	{
		StringBuilder str = new StringBuilder("");
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String s;
		if(reader.readLine()==null)
		{
			throw new EmptyFileException();
		}
		while((s=reader.readLine())!=null)
		{
			str.append(s);
		}
		reader.close();
		return str.toString();
	}
}
