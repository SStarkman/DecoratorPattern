package decoratorPatternHTML;

public class EmTag extends TagDecorator{
	public EmTag(Tag tag) {
		super("em", tag);
	}
}
