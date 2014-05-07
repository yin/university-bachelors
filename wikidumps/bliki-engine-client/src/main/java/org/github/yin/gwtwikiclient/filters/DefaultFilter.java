package org.github.yin.gwtwikiclient.filters;

import org.github.yin.gwtwikiclient.text.ArticleNormalizing;

import info.bliki.wiki.dump.IArticleFilter;
import info.bliki.wiki.dump.Siteinfo;
import info.bliki.wiki.dump.WikiArticle;
import info.bliki.wiki.filter.PlainTextConverter;
import info.bliki.wiki.model.WikiModel;

public class DefaultFilter implements IArticleFilter {
	private WikiModel model = new WikiModel(
			"http://www.mywiki.com/wiki/${image}",
			"http://www.mywiki.com/wiki/${title}");
	private PlainTextConverter converter = new PlainTextConverter();
	private ArticleConsumer consumer = new StdoutConsumer();
	
	public WikiModel getModel() {
		return model;
	}

	public void setModel(WikiModel model) {
		this.model = model;
	}

	public PlainTextConverter getConverter() {
		return converter;
	}

	public void setConverter(PlainTextConverter converter) {
		this.converter = converter;
	}

	public ArticleConsumer getConsumer() {
		return consumer;
	}

	public void setConsumer(ArticleConsumer consumer) {
		this.consumer = consumer;
	}

	public void process(WikiArticle page, Siteinfo site) {
		String plainStr = model.render(converter, page.getText());
		if (consumer != null) {
			consumer.article(plainStr, page);
		}
	}

	public static class StdoutConsumer implements ArticleConsumer {
		@Override
		public void article(String text, WikiArticle orig) {
			System.out.println(orig.getTitle() + ": " + text);
		}
	}
	
	public static class NormalizingStdoutConsumer implements ArticleConsumer {
		private ArticleNormalizing normalize = new ArticleNormalizing();
		@Override
		public void article(String text, WikiArticle orig) {
			String norm = normalize.normalize(orig.getTitle() + ": " + text);
			System.out.println(norm + '\n');
		}
	}
	
	public static interface ArticleConsumer {
		public void article(String text, WikiArticle orig);
	}
	
}
