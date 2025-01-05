package decoratorPatternHTML;

public abstract class TagWithInformation extends Tag {
	// Additional level of abstraction
	// This class is useful to all concrete tags, but doesn't force the fields or methods on the Decorators, as it would have if these fields were in the main Tag class
	private String text;
	
	// Optional Fields
	// Name and ID are specified since many tags use them as per assignment requirements
	protected String name;
	protected String idAttribute;
	protected String additionalAttributes;
	
	protected TagWithInformation(String tag, String text) {
		super(tag);
		this.text = text;
	}

	@Override
	public String getRenderedAttributes() {
		StringBuilder str = new StringBuilder();
		if (name != null) {
			str.append(" name=\"" + name + "\"");
		}
		if (idAttribute != null) {
			str.append(" id=\"" + idAttribute + "\"");
		}
		if (additionalAttributes != null) {
			str.append(additionalAttributes);
		}
		return str.toString();
	}
	
	@Override
	public String getInnerText() {
		return text;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIdAttribute(String idAttribute) {
		this.idAttribute = idAttribute;
	}

}
