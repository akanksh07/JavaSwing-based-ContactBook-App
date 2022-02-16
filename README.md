# JavaSwing-based-ContactBook-App

User Guide
 Steps to run the application

1.	Log on to clever cloud. Open PHP MyAdmin Console.
 

2.	Run csvTablePopulation.java program.
 
3.	Tables have been created and populated on the SQL server
 

4.	Build, Compile and Run MyFrame.java program to launch the phonebook application:
 
 







Using the phonebook application

 
Display Tab
 
Add Tab

1.	The phonebook application has two tabbed windows; Add and Display (self explanatory functions).
2.	The Display window features a scrollable list which displays the [ Contact id  First-name Last-name] for all the contacts stored on the database server. Clicking on one of these contacts would enable user to see the fields on the RHS to be populated with the corresponding values.
3.	The search bar enables users to search any string (which might occur in any of the details of a particular contact record) and the matching searches get displayed in the scrollable list.
4.	The Contacts Found: label indicates the total number of searchs found. When the back button is pressed right next to the search magnifiying glass, the count of the total contacts storedon the application gets displayed.
5.	The contact details fields on the RHS of the scrollable list display the values of the  corresponding to the contact record.
 The Address Type dropdown displays all the address types of the contact which are stored in the application. Selecting one of these address types will autopopulate the StreetAddress, City, State, Zipcode corresponding to that address type.
The Contact Type and Calendar Type  dropdowns perform similar functions as the Address Type dropdown.
6.	The Delete button at the bottom of the window deletes the entire contact card of the the selection. 
7.	The Modify button on the bottom of the window will modify the contact card with the new/updated values for each of the fields. The 3 dropdowns are editable; in order to add a new address-type/contact-type/calendar event-type, enter the desired type in the editable drop down and add the corresponding details. 
8.	The Add window features a form containing all the optional and mandatory fields. The Add button on the bottom is used to enter the contact record on the database. 
9.	The application alerts dialog prompts for any CRUD action performed by the user. 
10.	 Form validation has not been programmed for the fields and it is expected that apt values for each of the fileds must be entered.



***
