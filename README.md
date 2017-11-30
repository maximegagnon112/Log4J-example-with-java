# Log4J-example-with-java
this is sample program to show how to use log4j for logging in java program
 - 1. download the sample program herewith and see the log4j maven devependencies
 - 2. you can take those dependecies and add to you project pom.xml
 - 3. go to the src/main/resources and copy the log4j.properties file and add to your project 
 - 4. See the loggin options and make changes accordingly.
 		- a. https://www.tutorialspoint.com/log4j/log4j_logging_levels.htm
 		- b. https://logging.apache.org/log4j/2.x/manual/customloglevels.html
 - 5. see the sample two java files to get how to use logging in class level


 ## Sample output from the given program 

 ```
 2017-11-29 19:22:31,580 [main] DEBUG (LoggingHelper.java:19) - This is debug log..
  2017-11-29 19:22:31,581 [main] INFO  (LoggingHelper.java:23) - This is info  log ...
  2017-11-29 19:22:31,581 [main] WARN  (LoggingHelper.java:26) - This is warn log ...
  2017-11-29 19:22:31,581 [main] ERROR (LoggingHelper.java:27) - This is error log... 
  2017-11-29 19:22:31,582 [main] FATAL (LoggingHelper.java:28) - This is fatal log ...
  2017-11-29 19:23:44,026 [main] DEBUG (LoggingHelper.java:19) - This is debug log..
  2017-11-29 19:23:44,028 [main] INFO  (LoggingHelper.java:23) - This is info  log ...
  2017-11-29 19:23:44,028 [main] WARN  (LoggingHelper.java:26) - This is warn log ...
  2017-11-29 19:23:44,028 [main] ERROR (LoggingHelper.java:27) - This is error log... 
  2017-11-29 19:23:44,028 [main] FATAL (LoggingHelper.java:28) - This is fatal log ...
  2017-11-29 19:25:15,181 [main] ERROR (LogginHelperOps.java:15) - Sorry, something wrong in your calculation!
  java.lang.ArithmeticException: / by zero
	at com.itos.LogginHelperOps.divide(LogginHelperOps.java:23)
	at com.itos.LogginHelperOps.main(LogginHelperOps.java:13)
 ```
