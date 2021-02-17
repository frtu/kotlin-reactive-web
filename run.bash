echo "-> Run bash individually - Type 'kotlin-reactive-webbuild' to build the project"
kotlin-reactive-webbuild() {
  echo "mvn clean package"
  mvn clean package
}
echo "-> Run bash individually - Type 'kotlin-reactive-webrun' to run the executable"
kotlin-reactive-webrun() {
  echo "Running executable > mvn spring-boot:run"
  mvn spring-boot:run
}

kotlin-reactive-webbuild
kotlin-reactive-webrun