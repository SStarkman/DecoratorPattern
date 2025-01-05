package decoratorPatternHTML;

public class Main {

	public static void main(String[] args) {
		String text = "Touro";
		Tag html = new DivTag(text, "divTag", "divComponent");
		html = new StrongTag(html);
		html = new ATag(html, "www.touro.edu");
		html = new ITag(html);
		
		System.out.println(html.getRenderedHTML());
		
		Tag inputTypeHtml = new InputTag("button", "action", "onclick", "javascript:alert('action')");
		inputTypeHtml = new SmallTag(inputTypeHtml);
		inputTypeHtml = new EmTag(inputTypeHtml);
		
		System.out.println(inputTypeHtml.getRenderedHTML());
		
		String headerText = "Header";
		Tag header = new HTag(headerText, 6);
		header = new UTag(header);
		System.out.println(header.getRenderedHTML());
		
		
		
		

	}

}
