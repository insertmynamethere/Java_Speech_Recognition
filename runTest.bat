@ECHO OFF
cd c:\users\will\desktop\clean
if exist test.class (
	del test.class
)
javac -cp core.jar test.java
start cmd /k java test

 
