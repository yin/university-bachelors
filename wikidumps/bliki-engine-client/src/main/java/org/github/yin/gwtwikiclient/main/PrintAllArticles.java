package org.github.yin.gwtwikiclient.main;

import info.bliki.wiki.dump.IArticleFilter;
import info.bliki.wiki.dump.WikiXMLParser;

import org.github.yin.gwtwikiclient.filters.DefaultFilter;

public class PrintAllArticles {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: PrintAllArticles <XML-FILE>");
            System.exit(-1);
        }
        String bz2Filename = args[0];
        try {
            IArticleFilter handler = new DefaultFilter();
            WikiXMLParser wxp = new WikiXMLParser(bz2Filename, handler);
            wxp.parse();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
