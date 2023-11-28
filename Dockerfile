## Build
FROM ghcr.io/graalvm/graalvm-community:21 AS build
WORKDIR /app
COPY . .
RUN ./gradlew nativeCompile

## Deploy
FROM fedora
WORKDIR /app
COPY --from=build /app/applications/app-service/build/native/nativeCompile/app-service /app/app-service
CMD [ "/app/app-service" ]
