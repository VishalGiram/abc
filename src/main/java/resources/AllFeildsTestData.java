package resources;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllFeildsTestData {

	private static final String REGEX_PATTERN = "[-+,()\\d]{10,20}";
	private static final String REGEX_PATTERN2 = "[-.,_\\[\\]/' a-zA-ZÀ-ÖØ-öø-ÿ\\d]{0,255}";
	private static final String MOBILE_NUMBER_REGEX = "^\\+\\d{1,3}-\\d{6,14}$";
	public static String mail = AllFeildsTestData.generateEmail();

	
	private static final String REGEX_PATTERN3 = "[-.,_\\[\\]/' a-zA-ZÀ-ÖØ-öø-ÿ\\d]{0,255}";
    private static final int MAX_LENGTH = 50;
    private static final Random RANDOM = new Random();
    
    
    private static final String REGEX_PATTERN4 = "[-+,()\\d]{10,20}";
    private static final int MIN_LENGTH2 = 10;
    private static final int MAX_LENGTH2 = 20;
    private static final Random RANDOM2 = new Random();
    public static String generateRandomFaxNumber() {
        StringBuilder sb = new StringBuilder();
        int length = RANDOM2.nextInt(MAX_LENGTH2 - MIN_LENGTH2 + 1) + MIN_LENGTH2;
        for (int i = 0; i < length; i++) {
            char c = (char) (RANDOM2.nextInt(43) + 48);
            if (String.valueOf(c).matches(REGEX_PATTERN4)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    public static String getFaxNumber() {
    	String faxNumber = generateRandomFaxNumber();
        System.out.println("Random fax number: " + faxNumber);
		return faxNumber;
    }
    public static String generateRandomJobTitle() {
        StringBuilder sb = new StringBuilder();
        int length = RANDOM.nextInt(MAX_LENGTH + 1);
        for (int i = 0; i < length; i++) {
            char c = (char) (RANDOM.nextInt(94) + 32);
            if (String.valueOf(c).matches(REGEX_PATTERN3)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    public static String getJobTtile() {
    	String jobTitle = generateRandomJobTitle();
        System.out.println("Random job title: " + jobTitle);
		return jobTitle;
    	
    }
	public static String generateRandomString(Random random) {
		String allowedChars = "[-.'a-zA-ZÀ-ÖØ-öaø-ÿ][^\\d]{1,50}"; // Include accentuated characters
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			int randomIndex = random.nextInt(allowedChars.length());
			sb.append(allowedChars.charAt(randomIndex));
		}
		return sb.toString();
	}

	public static String Username(int length) {
		String regex = "[-.'a-zA-ZÀ-ÖØ-öø-ÿ][^\\d]{0,20}"; // Specify allowed characters in character class
		Pattern pattern = Pattern.compile(regex);
		Random random = new Random();
		String UserName = "";

		do {
			UserName = generateRandomString(random);
		} while (!pattern.matcher(UserName).matches()); // Check if generated string matches the pattern

		System.out.println("UserName = " + UserName);
		return UserName;
	}

	public static String firstName(int length) {
		String regex = "[-.'a-zA-ZÀ-ÖØ-öaø-ÿ][^\\d]{1,50}"; // Specify allowed characters in character class
		Pattern pattern = Pattern.compile(regex);
		Random random = new Random();
		String firstName = "";

		do {
			firstName = generateRandomString(random);
		} while (!pattern.matcher(firstName).matches()); // Check if generated string matches the pattern

		System.out.println("firstName = " + firstName);
		return firstName;
	}

	public static String middleName(int length) {
		String regex = "[-.'a-zA-ZÀ-ÖØ-öø-ÿ][^\\d]{0,20}"; // Specify allowed characters in character class
		Pattern pattern = Pattern.compile(regex);
		Random random = new Random();
		String middleName = "";

		do {
			middleName = generateRandomString(random);
		} while (!pattern.matcher(middleName).matches()); // Check if generated string matches the pattern

		System.out.println("middleName = " + middleName);
		return middleName;
	}

	public static String lastName(int length) {
		String regex = "[-.'a-zA-ZÀ-ÖØ-öø-ÿ][^\\d]{0,20}"; // Specify allowed characters in character class
		Pattern pattern = Pattern.compile(regex);
		Random random = new Random();
		String lastName = "";

		do {
			lastName = generateRandomString(random);
		} while (!pattern.matcher(lastName).matches()); // Check if generated string matches the pattern

		System.out.println("lastName = " + lastName);
		return lastName;
	}

	public static String suffixName(int length) {
		String regex = "[-.'a-zA-ZÀ-ÖØ-öø-ÿ][^\\d]{0,20}"; // Specify allowed characters in character class
		Pattern pattern = Pattern.compile(regex);
		Random random = new Random();
		String suffixName = "";

		do {
			suffixName = generateRandomString(random);
		} while (!pattern.matcher(suffixName).matches()); // Check if generated string matches the pattern

		System.out.println("suffixName = " + suffixName);
		return suffixName;
	}

	private static String generateRandomTelephoneNumber() {
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		int length = 10 + random.nextInt(11); // generate a random length between 10 and 20
		for (int i = 0; i < length; i++) {
			char c = getRandomChar(random);
			sb.append(c);
		}
		return sb.toString();
	}

	public static String generateRandomTelephoneExtentionNum() {
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		int length = 3 + random.nextInt(11); // generate a random length between 10 and 20
		for (int i = 0; i < length; i++) {
			char c = getRandomChar(random);
			sb.append(c);
		}
		System.out.println("telephone extention :  " + sb.toString());
		return sb.toString();
	}

	private static char getRandomChar(Random random) {
		String chars = "-+,()0123456789";
		int index = random.nextInt(chars.length());
		return chars.charAt(index);
	}

	public static String getTelePhoneNum() {
		String randomTelephoneNumber = generateRandomTelephoneNumber();
		System.out.println("Random telephone number: " + randomTelephoneNumber);
		return randomTelephoneNumber;
	}

	public static String generateRandomDOB(String regex) {
		Random rand = new Random();
		String randomDOB = "";

		while (!randomDOB.matches(regex)) {
			int year = rand.nextInt(200) + 1900; // generate year between 1900 and 2099
			int month = rand.nextInt(12) + 1; // generate month between 1 and 12
			int day = rand.nextInt(31) + 1; // generate day between 1 and 31

			String yearStr = Integer.toString(year);
			String monthStr = (month < 10) ? "0" + Integer.toString(month) : Integer.toString(month);
			String dayStr = (day < 10) ? "0" + Integer.toString(day) : Integer.toString(day);

			randomDOB = yearStr + "-" + monthStr + "-" + dayStr;
		}

		return randomDOB;
	}

	public static String getDOB() {
		String regex = "(19[34567890]\\d|2[0-9]\\d{2})-[0-9]{2}-[0-9]{2}";
		String randomDOB = generateRandomDOB(regex);
		System.out.println("Random DOB: " + randomDOB);
		return randomDOB;
	}

	public static String generateRandomEmployerName() {
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		int length = random.nextInt(25); // Max length of 255 characters

		for (int i = 0; i < length; i++) {
			char c = (char) (random.nextInt(94) + 32); // Generate a random printable ASCII character
			if (String.valueOf(c).matches(REGEX_PATTERN2)) {
				sb.append(c);
			} else {
				i--; // Retry generating a new character
			}
		}

		return sb.toString();
	}

	public void getEmployerName() {
		String randomEmployerName = generateRandomEmployerName();
		System.out.println("Random employer name: " + randomEmployerName);
	}

	public static String generateMobileNumber() {
		Random rand = new Random();

		// generate a random country code between 1 and 999
		int countryCode = rand.nextInt(999) + 1;

		// generate a random phone number between 1000000 and 9999999999
		long phoneNumber = (rand.nextLong() % 9000000000L) + 1000000000L;

		// format the mobile number using the regular expression
		String mobileNumber = String.format("+%d-%010d", countryCode, phoneNumber);
		System.out.println("mobileNumber :   " + mobileNumber);
		// check if the generated mobile number matches the regular expression
		if (mobileNumber.matches(MOBILE_NUMBER_REGEX)) {
			return mobileNumber;
		}

		// if the generated mobile number is invalid, generate a new one
		return generateMobileNumber();
	}

	public static String generateEmail() {
		// Define a RegEx pattern for a simple email address
		String pattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

		// Generate a random email address that matches the pattern
		Pattern p = Pattern.compile(pattern);
		String email = "";
		while (email.isEmpty()) {
			String candidate = generateRandomString(10) + "@" + generateRandomString(5) + ".com";
			Matcher m = p.matcher(candidate);
			if (m.matches()) {
				email = candidate;
				System.out.println("email :   "+email);
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
			String candidate = "";
			while (candidate.isEmpty()) {
				char c = (char) (Math.random() * 256);
				Matcher m = p.matcher(String.valueOf(c));
				if (m.matches()) {
					candidate = String.valueOf(c);
				}
			}
			sb.append(candidate);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		AllFeildsTestData ref = new AllFeildsTestData();
		AllFeildsTestData.Username(10);
		AllFeildsTestData.firstName(10);
		AllFeildsTestData.middleName(10);
		AllFeildsTestData.lastName(10);
		AllFeildsTestData.suffixName(10);
		AllFeildsTestData.getTelePhoneNum();
		AllFeildsTestData.generateRandomTelephoneExtentionNum();
		AllFeildsTestData.getDOB();
		ref.getEmployerName();
		AllFeildsTestData.generateMobileNumber();
		AllFeildsTestData.generateEmail();
		AllFeildsTestData.getJobTtile();
		AllFeildsTestData.getFaxNumber();

	}
}
