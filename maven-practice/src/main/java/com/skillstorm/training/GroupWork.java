package com.skillstorm.training;

public class GroupWork {
	// TODO getUserID implementations and getQueryParameterValue test

	public static int getUserID(String url) {

		if (url.contains("/user/")) {
			int user = url.indexOf("/user/");
			int endOfUsername;
			if (url.substring(user + 6, url.length() - 1).contains("/")) {
				endOfUsername = url.indexOf("/", user + 6);
			} else {
				endOfUsername = url.length();
			}
			String userId = url.substring(user + 6, endOfUsername);
			return Integer.parseInt(userId);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public static String getQueryParameterValue(String url, String key) {
		if (key.contains("?") || key.contains(";") || key.contains("/")
				|| key.contains("?") || key.contains(":") || key.contains(",") || key.contains("@") || key.contains("&")
				|| key.contains("=") || key.contains("+") || key.contains("$")) {
			throw new IllegalArgumentException("Key cannot contain invalid characters");
		}
		if (url.substring(0, 7) != "https://") {
			throw new IllegalArgumentException("invalid URL");
		}
			if (key.isEmpty()) {
				throw new IllegalArgumentException("Key cannot be empty");
			}
		
		if (key.isEmpty() || url.isEmpty()) {
			throw new NullPointerException();
		}
		
		if (url.contains("?") && !url.isEmpty() && url.contains(key)) {
			int start = url.indexOf("?");
			int valueIndex = start + key.length() + 1;
			int valueEnd = url.indexOf(valueIndex,
					url.indexOf(Math.min(url.indexOf("&"), valueIndex), url.length() - 1));
			String value = url.substring(valueIndex, valueEnd);
		} else {
		return "URL cannot be resolved to a query"; // TODO implemented by Team Oranges
	}
		return null;
	}


	public static boolean isCSV(String filepath) { // numbers.csv or C://home/user/numbers.csv etc
		// don't want it to return true if the String filepath is ".csv"
		// don't want it to return true if someone named their text file data.csv.txt
		return filepath.endsWith(".csv");
	}
}
