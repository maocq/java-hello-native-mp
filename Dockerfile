## Build
FROM ghcr.io/graalvm/graalvm-community:21
WORKDIR /app
COPY . .
RUN ./gradlew nativeCompile

## Deploy
FROM fedora:latest
WORKDIR /app
COPY --from=build /app/applications/app-service/build/native/nativeCompile/app-service /app/app
CMD [ "/app" ]
