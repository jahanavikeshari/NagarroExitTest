#ApiDemos Automation Suite Information:-
**To Run The ApiDemos Automation From command line in the project folder**



mvn clean test </br>
or </br>
mvn test </br>
or
appium.bat file
####testng files Description
define all the runner class  across the application



####Packages Description and its classes
1. *base*:Defining all the capabilities of application and starting and stop of application

**BaseClass** : The main class which defines capabilities- @BeforeMethod - to open the browser and @AfterMethod- to close the browser -@AfterTest-to close extent report. </br>



2. *screens*:Defining a screen pages and locating all the elements of screen feature.
  
a.**AddButtons** Defining the operation perform in adding buttons by locating its element
b.**HideShowScreens** defining the operation perform in Hidding and Showing buttons by locating its element
c.**MessageScreens** defining the operation perform in Messaging  by locating its element
d.**ReversingScreens** defining the operation perform in reversing by locating its element
e.**ShowTitle** defining the operation perform in show title by locating its element




3. *utils*:Defining all the utilities needed for the tests 
.
a.**AppiumServer** Used for opening and closing of appium server. 
b.**ExcelReader** Used for reading data from excel sheet.

4. *features*: Defining all the features of application.

a.**AddButtons** Defining the features for how to add buttons
b.**HideShowScreens** Defining the features for Hidding buttons and Showing buttons.
c.**MessageScreens** Defining the features for Messaging to recipents.
d.**ReversingScreens** Defining the features for how to perform reverse action.
e.**ShowTitle** Defining the features for how to Show Title by clicking button.

5.*hooks*:Defining all the hooks of application.

a. **hooks**Hooks used in application.

6.*runner*:runner is used for running the application.
a.**AddButtonRunner** runner class is used to run all the application by glue tags and features.

7.*stepDefinitions*:Defining all the steps of feature file.
a.**AddButtonsStepDefinitions** Step definition bind the feature file with step definitions.
b.**HideShowStepDefinitions**Step definition bind the feature file with step definitions.
c.**MessageStepDefinitions** Step definition bind the feature file with step definitions.
d.**ReversingStepDefinitions** Step definition bind the feature file with step definitions.
e.**ShowTitleStepDefinitions** Step definition bind the feature file with step definitions.






####Class.java file description





####Others Files Description
**Reports** : The generation of screenshot and pass fail details of test cases.</br>
**Screenshots** : Defines functions for taking screenshots. </br>
**Resources** : Contains all the driver path property in config.properties under the resouces folder.</br>
**Application**: Having the ApiDemos-debug.apk to run the application.
**config**:having all the value of capability and waits.
**Headless Mode**: Using Headless mode to run all the test cases in headless mode without running the application.


####Reports and Screenshots
1. Extent report gets generated after the run under \Reports\extentreport.html</br>
2. TestNG report as "emailable-report.html" gets generated under \test-output. </br>
3. Screenshot gets placed under \FailedScreenshots folder.
