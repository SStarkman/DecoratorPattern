package decoratorPatternHTML;

public class HTag extends TagWithInformation {
	public HTag(String text, String name, String idAttribute, int hTagNumber) {
		this(text, hTagNumber);
		this.name = name;
		this.idAttribute = idAttribute;

	}

	public HTag(String text, String name, int hTagNumber) {
		this(text, hTagNumber);
		this.name = name;

	}

	public HTag(String text, int hTagNumber) {
		// Super constructor call needs to be the first statement, but there needs to be
		// input validation
		// So I used the ternary operator, calling the checkValidTagNumber method, which
		// will throw an exception if invalid before it completes this operator
		super((checkValidTagNumber(hTagNumber) ? ("h" + hTagNumber) : "Invalid"), text);
	}

	private static boolean checkValidTagNumber(int tagNumber) {
		if (tagNumber < 1 || tagNumber > 6) {
			throw new IllegalArgumentException("h tag number must be between 1 and 6");
		}
		return true;
	}

}
