package decoratorPatternHTML;

public class ATag extends TagDecorator{
	private String hrefLink;
	
	public ATag(Tag tag, String hrefLink) {
		super("a", tag);
		this.hrefLink = hrefLink;
	}
	
	@Override
	public String getRenderedAttributes() {
		StringBuilder str = new StringBuilder();
		str.append(" href=\"");
		str.append(hrefLink);
		str.append("\"");
		return str.toString();
	}
}
