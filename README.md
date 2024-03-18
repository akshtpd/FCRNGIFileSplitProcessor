# Clone and Configure Project

## Cloning the Project

To clone this project, use the following command:

> git clone git@github.com:Midas-Ngi/project-template.git your_project_name

 [ ignore it if you create repository using template ]

## Required Changes

After cloning, you need to make some changes to the project as follows:

### Renaming Pom.xml Properties

1. Open the `pom.xml` file and rename the following properties:

- `<groupId>com.oracle.fcr.ngi.renameIt</groupId>` changed to your groupid)
- `<artifactId>project-template</artifactId>` (rename it)
- `<name>project-template</name>` (rename it)
- `<description>project-template</description>` (rename it)


### Renaming SpringBootApplication and Properties

2. Rename the `Application.java` file to `YourAppNameApplication.java`.

- `app.name=FCRNGI_YOURSERVICENAME_SERVICE` (e.g. `app.name=FCRNGI_GLTXN_SERVICE`)

### Renaming Application Properties and Files
3. Open the `application.properties` file and rename the following properties:
- `spring.profiles.active=your-profile-name` (e.g. `spring.profiles.active=gl-transfer`)
- `spring.application.name=your-profile-name` (e.g. `spring.application.name=gl-transfer`)

4. Rename the `application-your-profile-name.xml` file to `application-gl-transfer.xml` (for example).
5. In the renamed file, change the following properties:
- `spring.config.activate.on-profile: your-profile-name`
- `spring.config.name: your-profile-name-YAML`
- `spring.application.name: your-profile-name`
- `resilience4j.circuitbreaker.instances.your-profile-name`

### Removing Test Classes and comments

6. Remove all test classes from the project to ensure that only the main classes remain.

### Removing Content from Files

7. Remove all content from the `README.md` file, and replace it with your own documentation.


## Conclusion

After making these changes, you should have a fully functional project with your desired package names and configurations.
