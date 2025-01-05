package decoratorPatternHTML;

public class InputTag extends TagWithInformation {
	public InputTag(String name, String idAttribute, String type, String value, String eventType,
			String event) {
		this(type, value, eventType, event);
		this.name = name;
		this.idAttribute = idAttribute;

	}

	public InputTag(String type, String value, String eventType, String event) {
		super("input", "");
		StringBuilder str = new StringBuilder();
		str.append(" type=\"" + type + "\"");
		str.append(" value=\"" + value + "\"");
		str.append(" " + eventType + "=\"" + event + "\"");
		this.additionalAttributes = str.toString();
	}
}
