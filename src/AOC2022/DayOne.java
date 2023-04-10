package AOC2022;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DayOne {
	private static int indexTopElderlyCalories(List<ArrayList<Integer>> caloriesElfies){
		List<Integer> sumCalories = new ArrayList<>();
		for (int i = 0; i < caloriesElfies.size(); i++) {
			int sum = 0;
			for (int j = 0; j < caloriesElfies.get(i).size(); j++) {
				sum += caloriesElfies.get(i).get(j);
			}
			sumCalories.add(sum);
		}
		Collections.sort(sumCalories, Collections.reverseOrder());
		/* 
		LinkedList<Integer> orderElderly = new LinkedList<>();
		for (int i = 0; i < sumCalories.size(); i++) {
			if(sumCalories.get(i) > numElderly){
				orderElderly.addFirst(sumCalories.get(i));
			}
		}*/
		
		return sumCalories.get(0) + sumCalories.get(1) + sumCalories.get(2); 
	}

	private static int indexElderlyCalories(List<ArrayList<Integer>> caloriesElfies){
		int indexElderly = 0;
		int numElderly = 0;
		List<Integer> sumCalories = new ArrayList<>();
		for (int i = 0; i < caloriesElfies.size(); i++) {
			int sum = 0;
			for (int j = 0; j < caloriesElfies.get(i).size(); j++) {
				sum += caloriesElfies.get(i).get(j);
			}
			sumCalories.add(sum);
		}

		for (int i = 0; i < sumCalories.size(); i++) {
			if(sumCalories.get(i) > numElderly){
				numElderly = sumCalories.get(i);
				indexElderly = i;
			}
		}
		return sumCalories.get(indexElderly);
	}

	public static void main(String[] args) {
		List<ArrayList<Integer>> caloriesElfies = new ArrayList<>();
		int index = 0;
		try {
			BufferedReader fileRead = new BufferedReader(new FileReader("dayOne.txt"));
			String input = fileRead.readLine();
			while(input != null){
				caloriesElfies.add(new ArrayList<>());
				while(input != null && !input.equals("")){
					caloriesElfies.get(index).add(Integer.parseInt(input));
					input = fileRead.readLine();
				}
				index++;
				input = fileRead.readLine();
			}
			fileRead.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}
		
		System.out.println(indexElderlyCalories(caloriesElfies));
		System.out.println("--------------------");
		System.out.println(indexTopElderlyCalories(caloriesElfies));
	}
}
