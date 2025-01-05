package decoratorPatternHTML;

public class StrongTag extends TagDecorator{
	public StrongTag(Tag tag) {
		super("strong", tag);
	}
}
