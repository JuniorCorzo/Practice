package CodeWars;

import java.util.ArrayList;


public class Scramblies {

	public static boolean isScramblies(String srt1, String srt2) {
		String result = "";

		ArrayList<String> srt1List = new ArrayList<>();
		char[] srt1Array = srt1.toCharArray();
		for (int i = 0; i < srt1Array.length; i++) {
			srt1List.add(String.valueOf(srt1Array[i]));
		}

		int indexSrt1 = 0;
		int indexSrt2 = 0;
		while(!result.equals(srt2)) {
			if (indexSrt1 == srt1List.size()) break;

			if (String.valueOf(srt2.charAt(indexSrt2)).equals(srt1List.get(indexSrt1))){
				result = result.concat(srt1List.get(indexSrt1));
				srt1List.remove(indexSrt1);
				indexSrt2++;
				indexSrt1 = 0;
			} else {
				indexSrt1 ++;
			}			
		}
		return result.equals(srt2);
	}

	public static void main(String[] args) {
		System.out.println(isScramblies("scripaatjvjjjx", "javascript"));
	
	}
	


}
