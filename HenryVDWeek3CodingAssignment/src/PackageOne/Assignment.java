package PackageOne;

public class Assignment {
	
	//For Question 7 -Start-
	static String repeatWordTimes(String word, int times) {
		String word1 = word;
		for (int i = 1; i < times; ++i)	{
		    word += word1;
		}
			return word;
		}
	//For Question 7 -End-
	
	//For Question 8 -Start-
    static String fullNameGen(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        return fullName;
    }
	//For Question 8 -End-
    
	//For Question 9 -Start-
    static boolean moreHundred(int arr5[]){
    	boolean arr5TotalMoreHundred = false;
    	int arr5Total = 0;
    	for (int i:arr5) {
    		arr5Total += i;
    	if (arr5Total > 100) {
        	 arr5TotalMoreHundred = true;
        } else arr5TotalMoreHundred = false;
    }
    	return arr5TotalMoreHundred;
   }
    //For Question 9 -End-
    
	//For Question 10 -Start-
    static double averageNum(double arr6[]){
    	double arr6Total = 0;
    	for (double i:arr6) {
    		arr6Total += i;
    	}
    	double arry6Average = arr6Total/(arr6.length);
    	return arry6Average;
    }
	//For Question 10 -End-
    
	//For Question 11 -Start-
    static boolean averageGreaterHundred(double arr7[], double arr8[]){
    	double arr7Total = 0;
    	double arr8Total = 0;
    	for (double i:arr7) {
    		arr7Total += i;
    	}
    	for (double j:arr8) {
    		arr8Total += j;
    	}
    	double arry7Average = arr7Total/(arr7.length);
    	double arry8Average = arr8Total/(arr8.length);
    	boolean arr7GreaterArr8 = false;
    	if(arry7Average > arry8Average) {
    		arr7GreaterArr8 = true;
    	} else arr7GreaterArr8 = false;
    	return arr7GreaterArr8;
    }
    //For Question 11 -End-

    //For Question 12 -Start-
    static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket){
    	boolean buyDrink = false;
    	if(isHotOutside == true && moneyInPocket > 10.50) {
    		buyDrink = true;
    	} else buyDrink = false;
    	return buyDrink;
    }	
    //For Question 12 -End-
    
    //For Question 13 -Start-
    static boolean passCheck(String password){
    	boolean passGood = false;
    	if(password.length() > 8
    			&& ( password.contains("!")
    					|| password.contains("@")
    					|| password.contains("#")
    					|| password.contains("$")
    					|| password.contains("%")
    					|| password.contains("^")
    					|| password.contains("&")
    					|| password.contains("*")
    					|| password.contains("(")
    					|| password.contains(")"))) {
    		passGood = true;
    	} else passGood = false;
    	return passGood;
    }  
    //For Question 13 -End-
   	
	public static void main(String[] args) {
		System.out.println("1,");
		int arr[] = {3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println("Part A,");
		System.out.println((arr[arr.length - 1]) + " - " + (arr[0]) + " = " + (arr[arr.length - 1] - arr[0]));
		
		System.out.println("Part B,");
		int arr2[] = new int[arr.length + 1];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr2[i] = arr[i];
		}
		arr2[arr2.length - 1] = 97;
		System.out.println((arr2[arr2.length - 1]) + " - " + (arr2[0]) + " = " + (arr2[arr2.length - 1] - arr2[0]));
		
		System.out.println("Part C,");
		int count1 = 0;
		double arrTotal = 0;
		for (int j: arr) {
			arrTotal += arr[count1];
			count1 += 1;
		}
		System.out.println("Original array average age: " + (arrTotal/arr.length));
		
		int count2 = 0;
		double arr2Total = 0;
		for (int k: arr2) {
			arr2Total += arr2[count2];
			count2 += 1;
		}
		System.out.println("New array average age: " + (arr2Total/arr2.length));

		System.out.println("2,");		
		System.out.println("Part A,");
		String arr3[] = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		double totalName = 0;
		for (String i:arr3) {
			totalName += i.length();
		}
		System.out.println("Average name length: " + (totalName/arr3.length));

		System.out.println("Part B,");
		String allNames = "";
		for (String j:arr3) {
			allNames += j + " ";
		}
		System.out.println("All names together: " + (allNames));
		
		System.out.println("3,");
		System.out.println("array[array.length - 1]");
		
		System.out.println("4,");
		System.out.println("array[0]");
		
		System.out.println("5,");
		int nameLengths[] = new int[arr3.length];
		int count3 = 0;
		for (String i:arr3) {
			nameLengths[count3] = i.length();
			count3 += 1;
		}
		
		System.out.println("6,");
		int nameLengthsTotal = 0;
		for (int i:nameLengths) {
			nameLengthsTotal += i;
		}
		System.out.println(nameLengthsTotal);
		
		System.out.println("7,");
		int times = 3;
		String word = "Hello";
		System.out.println(repeatWordTimes(word,times));
		
		System.out.println("8,");
		String firstName = "Henry";
		String lastName = "Dufloth";
		System.out.println(fullNameGen(firstName,lastName));

		System.out.println("9,");
    	int arr5[] = {1,99,3};
        System.out.println(moreHundred(arr5));
        
		System.out.println("10,");
		double arr6[] = {1.5,33,45.67,55,3};
        System.out.println(averageNum(arr6));
        
        System.out.println("11,");
        double arr7[] = {1.3,44,78};
        double arr8[] = {2.6,89,56,0.99};
        System.out.println(averageGreaterHundred(arr7,arr8));
        
        System.out.println("12,");
        boolean isHotOutside = true;
        double moneyInPocket = 44.25;
        System.out.println(willBuyDrink(isHotOutside,moneyInPocket));
        
        System.out.println("13,");
        //Enter Password with 8+ Characters and include a special character. 
        String password = "password1#";
        System.out.println(passCheck(password));
        if((passCheck(password)) == true) {
            System.out.println("Password Good :)");
        }	else System.out.println("Password Bad :(");

	}
	
}
