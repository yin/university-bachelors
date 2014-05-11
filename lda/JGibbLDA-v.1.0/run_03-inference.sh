#!/bin/bash

model_dir=models/model03
megadoc=test-data/megadoc-1000n-every51th
#model=megadoc-1000n-every51th
testdoc=test-data/testdoc-01

java -mx512M -cp bin/:lib/args4j-2.0.6.jar jgibblda.LDA -inf -dir $model_dir -dfile $testdoc

