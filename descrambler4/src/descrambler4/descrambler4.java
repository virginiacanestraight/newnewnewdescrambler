package descrambler4;

import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class descrambler4 {

	public static void main(String[] args) throws FileNotFoundException {
	//Creating list of input characters
			Scanner ScAn = new Scanner(System.in);
			String scr =   ScAn.next();
			List <Character> scrambled = new ArrayList <Character>();
		   
			for (int i = 0; i < scr.length(); i++) {
				scrambled.add(scr.charAt(i));
		    }
		    Collections.sort(scrambled);
			ScAn.close();

	//Creating Dictionary List	
			Scanner dictionary = new Scanner(new File ("/Users/virginiacanestraight/Documents/Programming/descrambler4/src/descrambler4/dictionary_1.txt"));
			ArrayList<String> dictList= new ArrayList<String>();
			while (dictionary.hasNext()) {
				dictList.add(dictionary.next());
			}
			dictionary.close();
	//Creating list of term characters
			for (int f=0;f<58110; f++){
				String word= dictList.get(f);
				List<Character> result = new ArrayList<Character>();
				for (int i = 0; i < word.length(); i++) {
					result.add(word.charAt(i));
				}
			Collections.sort(result);
	//Checking for equality
			if(scrambled.equals(result)){
				System.out.println(dictList.get(f));
			}
					
			}
		
			
		}
		
	}
