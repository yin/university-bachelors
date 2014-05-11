#!/bin/bash

home_dir=JGibbLDA-v.1.0/
out_dir=../model02
megadoc=../../test-data/megadoc-1000n-every51th

cd $home_dir
mkdir -p $out_dir

java -mx512M -cp bin/:lib/args4j-2.0.6.jar jgibblda.LDA -est -dir $out_dir -dfile $megadoc
