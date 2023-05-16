package resources;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class TestDataByRegEx {


	//Email
	public static String generateEmail() {
		// Define a RegEx pattern for a simple email address
		String pattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		// Generate a random email address that matches the pattern
		Pattern p = Pattern.compile(pattern);
		String email = "";
		while (email.isEmpty()) {
			String candidate = generateRandomString(20) + "@" + generateRandomString(10) + ".com";
			Matcher m = p.matcher(candidate);
			if (m.matches()) {
				email = candidate;
			}
		}
		return email;
	}

	public static String generateRandomString(int length) {
		// Define a RegEx pattern for a string of alphanumeric characters
		String pattern = "[a-zA-Z0-9]{1}";
		// Generate a random string that matches the pattern
		Pattern p = Pattern.compile(pattern);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			String name = "";
			while (name.isEmpty()) {
				char c = (char) (Math.random() * 256);
				Matcher m = p.matcher(String.valueOf(c));
				if (m.matches()) {
					name = String.valueOf(c);
				}
			}
			sb.append(name);
		}
		return sb.toString();
	}

	public void getEmail() {
		System.out.println("Email id : " + TestDataByRegEx.generateEmail());
	}

	//USERNAME
	  public static String generateUsername() {
	        // Define a RegEx pattern for a username consisting of letters, numbers, and underscores
	        String pattern = "^[-.'a-zA-ZÀ-ÖØ-öø-ÿ][^\\d]{0,20}$";

	        // Generate a random username that matches the pattern
	        Pattern p = Pattern.compile(pattern);
	        String username = "";
	        while (username.isEmpty()) {
	            String candidate = generateRandomString(10);
	            Matcher m = p.matcher(candidate);
	            if (m.matches()) {
	                username = candidate;
	            }
	        }
	        return username;
	    }

	  public void getUserName() {
	    	System.out.println("UserName : "+TestDataByRegEx.generateUsername());
	    }
	
	  
	  public void gettestData() {
		  String regex = "[-.'À-ÖØ-öø-ÿ][^\\d]{0,20}";
	        Pattern pattern = Pattern.compile(regex);

	        Random random = new Random();
	        StringBuilder sb = new StringBuilder();
	        int maxLength = 20;

	        while (sb.length() < maxLength) {
	            char c = (char)(random.nextInt(26) + 'a');
	            sb.append(c);
	        }

	        String randomString = sb.toString();
	        System.out.println(randomString);
	        Matcher matcher = pattern.matcher(randomString);

	        if (matcher.matches()) {
	            System.out.println("Generated Random String: " + randomString);
	        } else {
	            System.out.println("Could not generate a random string that matches the given regex.");
	        }
	    }
	  
	   public static String Username(int length) {
	    	 String regex = "[-.'a-zA-ZÀ-ÖØ-öø-ÿ][^\\d]{0,20}"; // Specify allowed characters in character class
	         Pattern pattern = Pattern.compile(regex);
	         Random random = new Random();
	         String UserName = "";

	         do {
	        	 UserName = generateRandomString(random);
	         } while (!pattern.matcher(UserName).matches()); // Check if generated string matches the pattern

	         System.out.println(UserName);
			return UserName;
	     }
	   

	    public static String generateRandomString(Random random) {
	        String allowedChars = "[-.'a-zA-ZÀ-ÖØ-öø-ÿ][^\\d]{0,20}"; // Include accentuated characters
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < 10; i++) {
	            int randomIndex = random.nextInt(allowedChars.length());
	            sb.append(allowedChars.charAt(randomIndex));
	        }
	        return sb.toString();
	    }

	
	public static void main(String[] args) {
		TestDataByRegEx ref = new TestDataByRegEx();
//		ref.getEmail();
//		ref.getUserName();
//		ref.gettestData();
		ref.Username(20);
	}
}
