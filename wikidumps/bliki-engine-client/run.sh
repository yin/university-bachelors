export jar=target/wiki-preprocessor-0.1-SNAPSHOT.jar
export cp=../gwtwiki/trunk/info.bliki.wiki/bliki-core/target/bliki-core-3.1.01-SNAPSHOT-jar-with-dependencies.jar

java -cp $cp -jar $jar ../download/skwiki-20131006-pages-articles.xml.bz2

