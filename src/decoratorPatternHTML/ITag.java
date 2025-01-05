package decoratorPatternHTML;

public class ITag extends TagDecorator{
	public ITag(Tag tag) {
		super("i", tag);
	}
}
