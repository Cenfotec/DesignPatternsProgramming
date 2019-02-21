package cenfotec.katas.fbq;

public class FooBarQix {

	public static String process(int number) {
        if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0)
            return "FOOBARQIX";
        if (number % 3 == 0 && number % 5 == 0)
            return "FOOBAR";
        if (number % 3 == 0 && number % 7 == 0)
            return "FOOQIX";
        if (number % 5 == 0 && number % 7 == 0)
            return "BARQIX";
		if (number % 3 == 0) {
			return "FOO";
		}
		if (number % 5 == 0) {
            return "BAR";
		}
		if (number % 7 == 0) {
            return "QIX";
		}

		return number + "";
	}
	
}
