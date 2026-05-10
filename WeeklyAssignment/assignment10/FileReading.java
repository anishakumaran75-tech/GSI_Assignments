package assignment10;

import java.io.*;

public class FileReading {
 public static void main(String[] args) {
	 
	 try {
	 File file=new File("E:\\Automation Testing GSI_ANU\\java practice\\File Reading.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);

		String st;
		String longWord="";
		int lineCount=0;
		int wordCount=0;
		int charCount=0;
		while((st=br.readLine())!=null)
		{
			lineCount++;
			
			charCount = charCount + st.length();
			String[] words=st.split(" ");
			
			wordCount=wordCount+words.length;
			
			for (String w:words)
			{
				if(w.length()>longWord.length())
					longWord=w;
			}
			
		}
		
		System.out.println("Total Lines: "+lineCount);
		System.out.println("Total Words: "+wordCount);
		System.out.println("Total Characters: "+charCount);
		System.out.println("Longest Word: "+longWord);
		
		br.close();
		
	 }
	 catch (Exception e) {
         System.out.println("File not found");
		}
	 }
 }

