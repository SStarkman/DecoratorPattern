package decoratorPatternHTML;

public class UTag extends TagDecorator{
	public UTag(Tag tag) {
		super("u", tag);
	}
}
