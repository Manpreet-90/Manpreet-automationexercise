com.api.base (Core Layer): This package typically contains the base class (e.g., BaseTest or TestSetup) responsible for loading configurations (config.properties), setting up base URLs, headers, and other global objects needed for all tests.

RequestPOJo & ResponsePOJo (Data Model Layer): This framework follows the Model portion of the pattern. These packages contain simple Java objects that map directly to the JSON payloads sent to (request) and received from (response) the API, enabling type-safe interaction and easier validation.

com.api.filters (RestAssured Filters): These are used to intercept, log, or modify requests and responses before they are processed, which is useful for debugging.

com.api.listeners (TestNG Listeners): Contains classes that "listen" to the test execution, allowing you to generate custom reports, log detailed results (e.g., in a database or Extent Reports), or take specific actions on test failure.

testcases (Test Layer): This is where you write the actual test methods (annotated with @Test from TestNG). They call methods from other utility classes or use the POJO classes to send requests and validate responses.

AppTest.java: Likely an example or boilerplate test provided by the IDE during project setup.

🔧 Dependencies & Configuration
The screenshot confirms the use of several key tools:

Java: The project is configured with JRE System Library [JavaSE-1.8].

Maven (pom.xml): The standard project management and build automation tool for Java. All project dependencies (like RestAssured and TestNG) are managed here.

TestNG (suite.xml): The testing framework being used. The suite.xml file is crucial for defining how your tests are categorized and executed.
