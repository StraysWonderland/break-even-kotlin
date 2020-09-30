#!/bin/sh
docker build . -t break-even-sam-test 
mkdir -p build
docker run --rm --entrypoint cat break-even-sam-test  /home/application/function.zip > build/function.zip 

sam local start-api -t sam.yaml -p 3000 