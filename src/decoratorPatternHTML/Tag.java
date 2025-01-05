package decoratorPatternHTML;

public abstract class Tag {
	// Main Tag Class
	
	// All types of tags, including decorators, require a tag name
	private String tag;
	
	// Add a protected constructor so children are forced to send a tag name, which is crucial to the correct functioning of the code
	protected Tag(String tag) {
		this.tag = tag;
	}

	// Children must implement this getInner method - concrete tags can use it for the actual text, decorators can use it for the inner tag's html
	public abstract String getInnerText();
	
	// Optional hook - can have attributes if wanted. This idea is borrowed from the Template pattern
	public String getRenderedAttributes() {
		return "";
	}

	// Rending of HTML, applicable to both concrete tags and decorators. This idea is borrowed from the Template pattern.
	public String getRenderedHTML() {
		StringBuilder str = new StringBuilder();
		str.append("<");
		str.append(tag);
		if (getRenderedAttributes() != null) {
			str.append(getRenderedAttributes());
		}
		str.append(">");
		str.append(getInnerText());
		str.append("</");
		str.append(tag);
		str.append(">");
		return str.toString();
	}

}
