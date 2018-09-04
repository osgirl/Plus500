package utils;

import org.apache.commons.lang3.RandomStringUtils;

import com.mifmif.common.regex.Generex;

public class Randoms {
		
	public static String generateEmail() {
		
		return RandomStringUtils.randomAlphanumeric(7) + "@gmail.com";
	}
	
	public static String generatePassword() {
		return RandomStringUtils.randomAlphanumeric(10);
	}

}
