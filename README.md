# Spring-Out-of-Memory-Samples
This sample project is used to show example circumstances under which out of memory exceptions would occur in spring-boot applications of Azure Spring Cloud.

## Deploy the application with JVM Options

`az spring-cloud app deployment create -n <deployment name> --app <app name> -s <service instance name> -g <resource group name> --jvm-options="-XX:+UseG1GC -XX:+UseStringDeduplication [--artifact-path] [--runtime-version {Java_11, Java_8}]"`
