# springstead-app1-impl
Hi and welcome as this is my user guide to my implementation on the todoList. 

In my application there three text fields that are used to get data from the user. These being one for the date, one for the description, and one being for if the task has been completed or not. When the user has filled all three of these boxes they can press the add button. 
This button will take all three text boxes and combine them togeter with _ as the space inbetween the fields. It is important that in the field for is it complete or not that the user enters a 1 or 0. This _ is important because it allows the code to parse through the information because it is stored in an arrayList. 

The next button the user will see is the remove button to remove a row from the table the user has to click the row they want to be deleted and then click the remove button. This will remove both the elements from the table and from the arrayList.

The next button is the clear button when this button is clicked all the elements in both the table and arrayList will be deleted resulting in a blank table and arrayList. 

If the user wishes to edit any information in the todoList all they have to do is simply double click the the element they wish to change and they will have the ability to edit that information. This edits it both on the table and in the arrayList. 

The next three buttons that are on the right hand side are the show all, show uncompleted, and show completed. These buttons will only change the items that are visable in the table and not modify the elements arrayList. This makes sure no data is lost when these buttons are pressed. The show all button will show all the elements in the arrayList in the table, the show uncompleted will show any element with a 0 in the completed column, and the show completed will show any element with a 1 in the completed column. 

The last two buttons are the Save and Load buttons. These buttons will do what they say. The load button will delete all the information in that is in the table and the arrayList and open a txt file on your computer. The load function works by going line by line of an inputed file and parsing through the information after _. And the save button will convert the data in the arrayList into a txt file by writing it line by line and saving it where the user specifies. 