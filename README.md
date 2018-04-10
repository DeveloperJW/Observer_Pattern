# Observer_Pattern

The observer pattern is also referred as "Pub/sub" pattern. According to the definition, Observer Pattern defines "a one-to-many 
dependency between objects so that when one object changes state, all its dependents are notified and updated automatically."


The use of observer pattern is to 

– Maintaining consistency across redundant state

– Optimizing batch changes to maintain consistency

Therefore, I decided to go back to FacilityManagement project and 
see if I can apply observer pattern to it.
Finally, I decided to let class FacilityManagement be the Publisher and 
let customers be subscribers. The way observer pattern works is: when a new Facility is assigned to 
customers and added to FacilityManagement, the addFacility method is been called and also Notify().

In Class Customer, the update method is implemented and check if there is facility in Facility Management which
has the same name of cutomer using CheckFacility Method defined in class Customer.
 
 
