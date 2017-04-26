# Bridge-Pattern
Implementation of Bridge Pattern
Bridge pattern implementation:
Chris Elliott
Neil Christensen
Siv Yeramati

Definition:
-	The bridge pattern is used to decouple an abstraction from its implementation so that the two can vary independently.

Used to:
-	Provide multiple implementations under the same interface.
-	Allow different implementations of an interface to be decided upon dynamically.

Implementation:
- We used the bridge pattern to construct code that will provide details for a shopping center and it's respective theatre. 
- There are two layers of abstraction in the code: The facility abstract class, and the theatre abstract class.
- Shopping Center is a refined abstraction of the facility class whereas theatre 1 and theatre 2 are refined abstractions of the theatre class.
- With the bridge pattern, it is easier to maintain two different inheritance hierarchies, which in our example are the shopping center and the theatre.

- In our example, what separates our refined abstractions of the facility is location and layout. Both shopping centers that were created are in different areas, have three floors, and on one of the floors is a theatre. However, what makes each of the refined abstractions different, is that they can have any variety of the three floors, and the theatre could be on any one of the three floors. As for theatre, what separates each refined abstraction from the other is that they can have different showings and showtimes depending on what theatre it is. Through utilizing abstraction and the bridge pattern, we can hide data from classes that do not have a need for it and maintain an advanced level of cooperation amongst the classes.
