`Design the API for a Home Automation Remote Control`

- The Remote control has 7 programmable slots(each assigned to a different household item)
along with the corresponding on/off buttons for each. The two on/off buttons are used to 
control the household device stored in a particular slot  

- There is a global undo button

The vendor APIs for controlling different household items are very diverse!
Take a look at the `receiver` package 

`Use command pattern to encapsulate method invocation!`

The command pattern allows you to decouple the `requester` of an action from the `object that actually 
performs the action`!

Do this by introducing `command objects`. A command object encapsulates a request to do something
(like turn on a light) on a specific object(like the bedroom light). We can save the command object 
for each button. Whenever a button is pressed, we ask the particular command object to do the work.

`Players in the command pattern`:

- __Client__ : The client is responsible for creating the command objects. The command object encapsulates
a set of actions on a receiver. The actions and the receiver are bound together in the command object.
- __Command Object__ : The command object provides one method _execute()_, that encapsulates the actions
and can be called to invoke the actions on the receiver.
- __Invoker__ : The client calls the setCommand on an invoker object and passes it the command object,
where it gets stored until it is needed - i.e the Invoker holds a command object and at some point
asks the command to carry out a request by calling its execute method 
- __Receiver__ : At some point in the future, the invoker calls the command object's execute(), which
results in the actions being invoked on the receiver.    

**Command Pattern**
The command pattern encapsulates a request as an object, thereby letting you parameterize other objects
with different requests, queue or log requests, and support undoable operations