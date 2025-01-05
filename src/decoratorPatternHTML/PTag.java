package decoratorPatternHTML;

public class PTag extends TagWithInformation{

	public PTag(String text, String name, String idAttribute) {
		this(text);
		this.name = name;
		this.idAttribute = idAttribute;
	}
	
	public PTag(String text) {
		super("p", text);
	}
	
}
