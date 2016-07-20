package lab1;

import cse131.ArgsProcessor;

public class Nutrition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ask user for nutrition facts
		ArgsProcessor ap = new ArgsProcessor(args);
		String foodName = ap.nextString("What is the name of your food?");
		double carbs = ap.nextDouble("How many carbs does it have?");
		double fat = ap.nextDouble("How much fat does it contain?");
		double protein = ap.nextDouble("How much protein?");
		double statedCals = ap.nextDouble("How much stated calories?");
		//User provided nutrition facts printed out
		System.out.println("Food Name = " + foodName);
		System.out.println("Carbs = " + carbs);
		System.out.println("Fat = " + fat);
		System.out.println("Protein = " + protein);
		System.out.println("Stated Calories = " + statedCals + "\n");
		
		
		//Break down of Calories rounded to nearest 10th
		double carbsCals = (double)Math.round((carbs*4)*10)/10;
			//double rndCarbsCals = (double)Math.round(carbsCals * 10) / 10;
		double fatCals = (double)Math.round((fat*9)*10)/10;
			//double rndFatCals = (double)Math.round(fatCals * 10) / 10;
		double proteinCals = (double)Math.round((protein*4)*10)/10; 
			//double rndProteinCals = (double)Math.round(proteinCals * 10) / 10;
		System.out.println(foodName + " has " + carbs + " grams of carbohydrates = " + carbsCals + " Calories, \n"+ fat + " grams of fat = " + fatCals + " Calories, \n" + "and " + protein + " grams of protein = " + proteinCals + " Calories.\n");
		
		
		// Grams of fiber determined from unavailable Calories rounded to nearest 100th
		double actualCals = (carbsCals + fatCals + proteinCals);
		double unavailCals = (double)Math.round((actualCals - statedCals)*10)/10;
			//double rndUnavailCals = (double)Math.round(unavailCals * 10) / 10;
		double carbFiber = (double)Math.round((unavailCals/4.0)*100)/100;
			//double rndCarbFiber = (double)Math.round(carbFiber * 100) / 100;
		System.out.println(foodName + " is said to have " + statedCals + " (available) Calories.\n" + "With " + unavailCals + " unavailable Calories, " + foodName + " has " + carbFiber + " grams of fiber.\n");
		
		
		// Percentages of carbs, fat, and protein rounded to nearest 10th
		double carbsPerc = (double)Math.round(((carbsCals/statedCals)*100)*10)/10;
			//double rndCarbsPerc = (double)Math.round(carbsPerc * 10) / 10;
		double fatPerc = (double)Math.round(((fatCals/statedCals)*100)*10)/10;
			//double rndFatPerc = (double)Math.round(fatPerc * 10) / 10;
		double proteinPerc = (double)Math.round(((proteinCals/statedCals)* 100)*10)/10;
			//double rndProteinPerc = (double)Math.round(proteinPerc * 10) / 10;
		System.out.println("Approximately\n" + "\t" + carbsPerc + "% of " + foodName + " is carbohydrates\n" + "\t" + fatPerc + "% of " + foodName + " is fat\n" + "\t" + proteinPerc + "% of " +foodName + " is protein\n");
		
		
		// Acceptability of food being low-carb and/or low-fat, and if you should still randomly eat it
		boolean lowCarbDiet = (carbsPerc <= 25.0);
		System.out.println(foodName + " is acceptable for a low-carb diet? " + lowCarbDiet);
		boolean lowFatDiet = (fatPerc <= 15.0);
		System.out.println(foodName + " is acceptable for a low-fat diet? " + lowFatDiet);
		boolean heads = (Math.random() < 0.5);
		System.out.println("By coin flip, you should eat " + foodName + "? " + heads);
	}

}
