# Mobile Application Development

## Exercise 4

1.	Create a List of 20 User objects in the ListActivity. Randomize the name, descriptions and value of Followed.

2.	Replace the ImageView in the ListActivity with a RecyclerView (ID is recyclerView). Populate the RecyclerView with the list created in previous step.

![This is an image](/images/recyclerview.png) 

3.	Add an onClickListener for the image such that it will show an Alert Dialog with the corresponding name. Clicking on the view button will direct the user to the MainActivity to show the profile page. Toggling the Follow button should save the state back in the respective User object.
Hint: You can use static variable. 

Using global static variable is not a good software engineering practice. Are you able to figure other ways of achieving these behaviors?

![This is an image](/images/alertdialog.png) 

4.	Modify the RecyclerView such that if the last digit of the name contains 7, a different layout is used as shown below. This new layout will have an additional ImageView that occupies the width of the screen and has a width-to-height ratio of 1:1.

![This is an image](/images/recyclerview2.png) 
