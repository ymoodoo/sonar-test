package gg.jte.generated.precompiled;
public final class JtefirsttestGenerated {
	public static final String JTE_NAME = "firsttest.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,7,7,7,7,10,10,12,12,13,13,13,14,14,15,15,15,18};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String title, String heading, String message) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html>\n<head>\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(title);
		jteOutput.writeContent("</title>\n</head>\n<body>\n");
		if (heading.equals("test")) {
			jteOutput.writeContent("\n    <h1>we are testing</h1>\n");
		} else {
			jteOutput.writeContent("\n    <h1>");
			jteOutput.setContext("h1", null);
			jteOutput.writeUserContent(heading);
			jteOutput.writeContent("</h1>\n");
		}
		jteOutput.writeContent("\n<p>");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(message);
		jteOutput.writeContent("</p>\n</body>\n</html>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String title = (String)params.get("title");
		String heading = (String)params.get("heading");
		String message = (String)params.get("message");
		render(jteOutput, jteHtmlInterceptor, title, heading, message);
	}
}
