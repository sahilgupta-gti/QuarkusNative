# QuarkusNative

This sample project shows how to build
a docker image using native executable in quarkus.

# Requirements
1. Java 17
2. Maven 3.8.1+


# Compile
Goto nativeimage module directory

```shell
mvn package -Pnative
```

# Run docker image
```shell
docker run --rm -p 8080:8080 --name quarkus <image-name>
```

# Execute http endpoint
```bash
curl -v -s http://$(minikube ip):8080/jackson/|jq -C
```