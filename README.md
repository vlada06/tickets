# What Have I Learned So Far

### Section 3: Building REST Web Services:
  
  
 - "**Implementing the EventController**"
   - URL cannot be https! Has to be non-secured, http.
   - IntelliJ has a bit of problem running services. Need to run HTTP REST request as a scratch file
   - URL used: `GET http://localhost:8078/organizers`
   - Another way to run a REST request:
     - in services pane click `+`, add and name request. Theoretically, right-click on the request name should
  
  
 - "**Implementing the RegistrationController**" - REST CRUD Operations
   - POST Request needs to specify the request's body type, using `@RequestBody` annotation
   - Q: Is the `path = ` important as an annotation parameter?  A: It is NOT!


- **"Handling Exceptions for Controllers"** 


### Reference Documentation
 * Further reference, and links can be found in [HELP.md](HELP.md) 