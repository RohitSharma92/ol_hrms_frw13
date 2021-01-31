set projectLocation=C:\Users\dell1\Desktop\Selenium Testing\Workplace\ol_hrms_frw13
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*java org.testng.TestNG %projectLocation%\testng.xml