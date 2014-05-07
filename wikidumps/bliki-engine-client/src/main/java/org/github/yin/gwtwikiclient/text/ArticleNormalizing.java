package org.github.yin.gwtwikiclient.text;

public class ArticleNormalizing {
	private static final boolean FILTER_ONLY_APLHANUM = false;
	private static final boolean FILTER_NORMALiZE_WHITEPACE = true;
	private static final boolean FILTER_TRIM_WHITESPACE = false;
	private static final boolean FILTER_TO_LOWERCASE = false;
	private static final boolean FILTER_APPEND_NEWLINE = false;
	public String normalize(String articleText) {
		if (FILTER_ONLY_APLHANUM) {
			articleText = articleText.replaceAll("[^a-zA-Z0-9 ]", " ");
		}
		if (FILTER_NORMALiZE_WHITEPACE) {
			articleText = articleText.replaceAll("\\s+", " ");
		}
		if (FILTER_TRIM_WHITESPACE) {
			articleText = articleText.trim();
		}
		if (FILTER_TO_LOWERCASE) {
			articleText = articleText.toLowerCase();
		}
	    if (FILTER_APPEND_NEWLINE) {
	    	articleText = articleText + "\n";
	    }
	    return articleText;
	}
	
	
}
