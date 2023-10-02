package training;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Training1 {

	public static void main(String[] args) {
		List<String> fortunes = new ArrayList<String>();
		fortunes.add("大吉");
		fortunes.add("中吉");
		fortunes.add("小吉");
		fortunes.add("末吉");
		fortunes.add("吉");
		fortunes.add("凶");

		Random rand = new Random();
		int random = rand.nextInt(fortunes.size());

		switch (random) {
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
			case 5:
				fortunes.get(5);
				break;
		}

		StringBuilder stringBuilder = new StringBuilder("今日の運勢は");
		stringBuilder.append(fortunes.get(random));
		stringBuilder.append("です");

		System.out.println(stringBuilder.toString());
	}

}
