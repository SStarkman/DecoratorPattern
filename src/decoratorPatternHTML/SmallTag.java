package decoratorPatternHTML;

public class SmallTag extends TagDecorator{
	public SmallTag(Tag tag) {
		super("small", tag);
	}
}
