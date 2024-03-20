# Medrep Web Automation

## Pre-requests
1. JDK 8 should be installed and environment varibale should be configured.
2. Google Chrome Version: 98.0.4758.82 or greater
3. IDE Eclipse Version: 2020-12 or Intellij

## Headless - How to Run The Tests in Headless Mode
1. Clone the repo
2. Open the project in Eclipse/Intellij
3. Open project explorer.
4. Update pom.xml maven file.
5. Go to the TestNG file name runTest.xml. You can find it following path : src/test/resources/runner/runTest.xml
6. Right click in the open file and select Run As > TestNG Suite
7. The tests will start running.

## UI - How to Run The Tests in UI Mode
1. Go to file src/test/main/base/BaseClass.java
2. Go to function 'initConfiguration()'.
3. Comment/Remove the line : options.addArguments("--headless");
4. Go to the TestNG file name runTest.xml in the path src/test/resources/runner/runTest.xml
5. Right click in the open file and select Run As > TestNG Suite
6. The tests will starts running in UI Mode.

	
