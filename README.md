# JavaExamples
This is an example Maven project that prints "Hello World!"

## Build and test

```
[example] mvn package                                                                                                                                                                                                                                                                                                                 master  ✭ ✱
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building marissa-app 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ marissa-app ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /Users/marissanovak/repos/JavaExamples/example/src/main/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ marissa-app ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ marissa-app ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /Users/marissanovak/repos/JavaExamples/example/src/test/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ marissa-app ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /Users/marissanovak/repos/JavaExamples/example/target/test-classes
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ marissa-app ---
[INFO] Surefire report directory: /Users/marissanovak/repos/JavaExamples/example/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.marissa.app.AppTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.026 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ marissa-app ---
[INFO] Building jar: /Users/marissanovak/repos/JavaExamples/example/target/marissa-app-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 2.190 s
[INFO] Finished at: 2016-12-13T17:52:51-08:00
[INFO] Final Memory: 16M/211M
[INFO] ------------------------------------------------------------------------
[example] ls                                                                                                                                                                                                                                                                                                                          master  ✭ ✱
example.iml pom.xml     src         target
[example] java -cp target/marissa-app-1.0-SNAPSHOT.jar com.marissa.app.App                                                                                                                                                                                                                                                            master  ✭ ✱
Hello World!
```
