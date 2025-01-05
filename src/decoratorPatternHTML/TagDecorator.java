package decoratorPatternHTML;

public abstract class TagDecorator extends Tag {
	// Tag Decorator holds an innerTag
	private Tag innerTag;

	// Protected Constructor enforces that children enter a tag name (for the tag
	// class) and the innerTag, which is used in this class
	// Since this is an abstract class, the class will not be able to be
	// instantiated by itself.
	protected TagDecorator(String tag, Tag innerTag) {
		super(tag);
		this.innerTag = innerTag;
	}

	@Override
	public String getInnerText() {
		return innerTag.getRenderedHTML();
	}

}
