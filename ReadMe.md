## Toast
	- Toast is like an alert in Android
	- Syntax
```	
		Toast toast = Toast.makeText(Context, TextToPrintOnScreen, DurationForToastToAppear); 
		toast.setGravity(Gravity.[TOP|CENTER|BOTTOM|RIGHT|LEFT], x-axis-coordinate, y-axis-coordinate); //Alignment of Toast
		toast.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 100, 200); //to display toast at Bottom-Right of the screen
		toast.show(); //Show Toast
```		
		where,
		Context can be ```ActivityName.this``` or ```getApplicationContext()```
		DurationForToastToAppear can be ```Toast.[LENGTH_SHORT | LENGTH_LONG]```
	- Toast messages are queued and shown inorder/FIFO
	
## Custom Toast
	- You can create a custom Toast with the following steps:
		- Create an XML layout file defininf the view you want to have for the custom toast
		- Inflate the layout using LayoutInflater
		- Create a Taost instance and set its View as the inflated Layout created in the previous step
