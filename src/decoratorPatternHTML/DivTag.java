package decoratorPatternHTML;

public class DivTag extends TagWithInformation{

	public DivTag(String text, String name, String idAttribute) {
		this(text);
		this.name = name;
		this.idAttribute = idAttribute;
	}
	
	public DivTag(String text) {
		super("div", text);
	}
	

}
