## Used Technology:
```bash
* Java Spring Boot 2.2
* Spring Boot Security
* JWT authentication
* H2 database(In memory database)
```

## Communication Protocol:
```bash
* RESTful API.
```

## Username and Password for Authorization
```bash
{"username":"batworld","password": "admin123"},
{"username":"batworld1","password": "admin124"},
{"username":"batworld2","password": "admin125"},
{"username":"batworld3","password": "admin126"}
```

## How to run?
```bash
* Clone this git repository in local repository
* Import this project file as maven project to a IDE like Eclipse or Intellij Idea.
* Run this project as "Java Application"
```
```bash
* Open Postman
* Select request type as POST then add "http://localhost:8200/authenticate" to URL with username and password inside body as JSON object. A token will be returned.
* Again select request type as GET and add "http://localhost:8200/api/v1/user/get/all" to URL and send token with prefix 'Bearer' as 'Authorization'. It will return all users list.
```

## Future Development:
```bash
* Apply JWT in microservice project
* Role based authentication
* Integrate frontend Angular 8
```
