# Training1
自社研修課題1
package training;

import java.util.ArrayList;
import java.util.List;

public class Training1 {

	public static void main(String[] args) {
		List<String> fortunes = new ArrayList<String>(); 
		fortunes.add("大吉"); 
		fortunes.add("中吉"); 
		fortunes.add("小吉"); 
		fortunes.add("末吉"); 
		fortunes.add("吉"); 
		fortunes.add("凶"); 
		
		int random = new java.util.Random().nextInt(fortunes.size());
		
		switch(random) {
		    case 0: 
		    	fortunes.get(0);
		    	break;
		    case 1:
		    	fortunes.get(1);
		    	break; 
		    case 2: 
		    	fortunes.get(2); 
		    	break;
		    case 3: 
		    	fortunes.get(3);
		    	break;
		    case 4:
		    	fortunes.get(4);
		    	break;
		    default:
		    	fortunes.get(5);
		    	break;
		}
		
		StringBuilder stringBuilder = new StringBuilder("今日の運勢は"); 
		    stringBuilder.append(fortunes.get(random));
		    stringBuilder.append("です"); 
		    
		    System.out.println(stringBuilder.toString()); 
	}

}
