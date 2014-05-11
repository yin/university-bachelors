#!/bin/bash

download_dir=./download
extract_dir=.
args4j_url="http://maven.jenkins-ci.org/content/repositories/releases/args4j/args4j/2.0.21/args4j-2.0.21.jar"
jgibblda_url="http://optimate.dl.sourceforge.net/project/jgibblda/jgibblda/JGibbLDA/JGibbLDA-v.1.0.tar.gz"
#gibbslda_url="http://skylink.dl.sourceforge.net/project/gibbslda/GibbsLDA%2B%2B/0.2/GibbsLDA%2B%2B-0.2.tar.gz"

mkdir -p $download_dir
wget $args4j_url -O $download_dir/args4j-2.0.21.jar
wget $jgibblda_url -O $download_dir/JGibbLDA-v.1.0.tar.gz
tar xjf $download_dir/JGibbLDA-v.1.0.tar.gz -C $extract_dir
