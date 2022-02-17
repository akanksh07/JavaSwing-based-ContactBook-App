# JavaSwing-based-ContactBook-App

**User Guide
<br>
<br> Steps to run the application**

1.	Log on to clever cloud. Open PHP MyAdmin Console.
 
![alt text](https://github.com/akanksh07/JavaSwing-based-ContactBook-App/blob/master/readme_images/img1.png)
<br>
<br>
2.	Run csvTablePopulation.java program.
![alt text](https://github.com/akanksh07/JavaSwing-based-ContactBook-App/blob/master/readme_images/img2.png) 
<br>
<br>
3.	Tables have been created and populated on the SQL server
 <br>
![alt text](https://github.com/akanksh07/JavaSwing-based-ContactBook-App/blob/master/readme_images/img3.png) 
<br>
<br>
4.	Build, Compile and Run MyFrame.java program to launch the phonebook application:
 
 

![alt text](https://github.com/akanksh07/JavaSwing-based-ContactBook-App/blob/master/readme_images/img4.png) 
![alt text](https://github.com/akanksh07/JavaSwing-based-ContactBook-App/blob/master/readme_images/img5.jpg) 





**Using the phonebook application**
<br>
<br>
 <br>
 <br>
**Display Tab**

 ![alt text](https://github.com/akanksh07/JavaSwing-based-ContactBook-App/blob/master/readme_images/img6.jpg) 
 <br>
 <br>
 
 <br>
 
 
**Add Tab**

 
 <br>

![alt text](https://github.com/akanksh07/JavaSwing-based-ContactBook-App/blob/master/readme_images/img7.jpg) 


<br>
<br>
 
 <br>1.	The phonebook application has two tabbed windows; Add and Display (self explanatory functions).
 
 <br>2.	The Display window features a scrollable list which displays the [ Contact id  First-name Last-name] for all the contacts stored on the database server. Clicking on one of these contacts would enable user to see the fields on the RHS to be populated with the corresponding values.
 
 <br>3.	The search bar enables users to search any string (which might occur in any of the details of a particular contact record) and the matching searches get displayed in the scrollable list.
 
 <br>4.	The Contacts Found: label indicates the total number of searchs found. When the back button is pressed right next to the search magnifiying glass, the count of the total contacts storedon the application gets displayed.
 
 <br>5.	The contact details fields on the RHS of the scrollable list display the values of the  corresponding to the contact record.
 The Address Type dropdown displays all the address types of the contact which are stored in the application. Selecting one of these address types will autopopulate the StreetAddress, City, State, Zipcode corresponding to that address type.
The Contact Type and Calendar Type  dropdowns perform similar functions as the Address Type dropdown.
 
 <br>6.	The Delete button at the bottom of the window deletes the entire contact card of the the selection. 
 
 <br>7.	The Modify button on the bottom of the window will modify the contact card with the new/updated values for each of the fields. The 3 dropdowns are editable; in order to add a new address-type/contact-type/calendar event-type, enter the desired type in the editable drop down and add the corresponding details. 
 
 <br>8.	The Add window features a form containing all the optional and mandatory fields. The Add button on the bottom is used to enter the contact record on the database. 
 
 <br>9.	The application alerts dialog prompts for any CRUD action performed by the user. 
 
 <br>10.	 Form validation has not been programmed for the fields and it is expected that apt values for each of the fileds must be entered.



***
