package com.ontariotechu.sofe3980U;

public class Binary {

	private String number = "0";

	public Binary(String number) {
		if (number == null || number.isEmpty()) {
			this.number = "0";
			return;
		}

		for (int i = 0; i < number.length(); i++) {
			char ch = number.charAt(i);
			if (ch != '0' && ch != '1') {
				this.number = "0";
				return;
			}
		}

		int i = 0;
		while (i < number.length() - 1 && number.charAt(i) == '0') {
			i++;
		}
		this.number = number.substring(i);
	}

	public String getValue() {
		return this.number;
	}

	public static Binary add(Binary a, Binary b) {
		int i = a.number.length() - 1;
		int j = b.number.length() - 1;
		int carry = 0;
		String result = "";

		while (i >= 0 || j >= 0 || carry != 0) {
			int sum = carry;

			if (i >= 0) {
				sum += (a.number.charAt(i) == '1') ? 1 : 0;
				i--;
			}
			if (j >= 0) {
				sum += (b.number.charAt(j) == '1') ? 1 : 0;
				j--;
			}

			carry = sum / 2;
			result = (sum % 2) + result;
		}

		return new Binary(result);
	}

	public static Binary multiply(Binary a, Binary b) {
		if (a.number.equals("0") || b.number.equals("0")) {
			return new Binary("0");
		}

		Binary result = new Binary("0");
		int shift = 0;

		for (int i = b.number.length() - 1; i >= 0; i--) {
			if (b.number.charAt(i) == '1') {
				String shifted = a.number;
				for (int k = 0; k < shift; k++) {
					shifted += "0";
				}
				result = add(result, new Binary(shifted));
			}
			shift++;
		}

		return result;
	}

	public static Binary and(Binary a, Binary b) {
		String x = a.number;
		String y = b.number;

		int len = Math.max(x.length(), y.length());
		while (x.length() < len) x = "0" + x;
		while (y.length() < len) y = "0" + y;

		String result = "";
		for (int i = 0; i < len; i++) {
			result += (x.charAt(i) == '1' && y.charAt(i) == '1') ? "1" : "0";
		}

		return new Binary(result);
	}

	public static Binary or(Binary a, Binary b) {
		String x = a.number;
		String y = b.number;

		int len = Math.max(x.length(), y.length());
		while (x.length() < len) x = "0" + x;
		while (y.length() < len) y = "0" + y;

		String result = "";
		for (int i = 0; i < len; i++) {
			result += (x.charAt(i) == '1' || y.charAt(i) == '1') ? "1" : "0";
		}

		return new Binary(result);
	}
}
