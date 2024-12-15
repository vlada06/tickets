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


### Section 4: Accessing Databases with Spring Data:

- **"Storing Registration in MongoDB"**
   - Need to start MongoDB container **before** launching the application
     - to do that, navigate to where `docker-compose.yaml` is and run: `docker compose up`
     - to get inside the container, run: `docker exec -it <container*> <shell**>`
     - *)The container name or ID;   **) Command shell to be run inside the container
     - i.e.: `docker exec -it ba8047 mongosh`
     - or:  `docker exec -it tickets-mongo-1 mongosh`
     - Once inside the Mongo container, to see all available `collections` (Mongo DB talk for `tables`) run: show collections
     - To search the data of a collections, run: `db.<collection>.find()`, i.e. `db.registrations.find()`
     - To leave the docker container, issue the command: `exit`
     - To turn off the docker container (and destroy its content), run: `docker compose down`
     - To persist data on a local file system, use *docker volume*. 
       - TODO - learn how to use /manipulate `docker volumes`



### Reference Documentation
 * Further reference, and links can be found in [HELP.md](HELP.md) 