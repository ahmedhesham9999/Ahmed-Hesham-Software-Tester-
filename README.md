# Way2automation Testing Task
##
* This project contains the flow for crud system in adding a new account in "Way2automation" website.
*  ###  What I have implemented :
 ##### 1- Home Page Test case to launch the browser, click on Banking link.
 ####  2- Banking Page Test case to open "Bank Manager Login " button, add new customer , fill the formm , handle alerts , assert on values.
 #### 3-  Account page Test case to view account page , open customer tab , choose last customer , add a random currency , handle alerts , assert on account ID, delete existing customer and assert that is no longer present.
 
 ## How To run the project
* Run from TESTNG or run each test case separetly
* Project supports Chrome Driver , Firefox and Safari.
 
 ## Issues I faced during the project
 * "Bank Manager Login " button is not working and always displaying the error "No such element exception" even after locating it by many locators (Xpath, CssSelector , linkText) and using Actions(MoveToElement).
 * Asserting on Values sometimes doesn't work for me and display an error in the xpath
 
