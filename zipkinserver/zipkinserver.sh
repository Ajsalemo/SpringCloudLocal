#!/bin/bash

# Run zipkin through Docker
docker run -d -p 9411:9411 openzipkin/zipkin

# Or by Java 
curl -sSL https://zipkin.io/quickstart.sh | bash -s
java -jar zipkin.jar

# See https://zipkin.io/pages/quickstart

