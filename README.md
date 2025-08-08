<h1 align="center" id="title">Spring Role-Based Question Manager</h1>

<p align="center"><img src="https://socialify.git.ci/SarthakTD/Spring-Role-Gradle/image?language=1&amp;name=1&amp;owner=1&amp;pattern=Circuit+Board&amp;stargazers=1&amp;theme=Auto" alt="project-image"></p>

<p id="description">A Spring Boot application demonstrating role-based authentication using JWT with two user roles: Admin and Student. Admins can add dummy questions via an API while Students can view all questions after logging in.</p>

<h2>Project Screenshots:</h2>

<img src="https://i.postimg.cc/vT2VNMrP/23.jpg" alt="project-screenshot" width="900" height="400/">
<br><br>
<img src="https://i.postimg.cc/rwrrQBKJ/24.jpg" alt="project-screenshot" width="900" height="400/">
<br><br>
<img src="https://i.postimg.cc/m2hMFz4K/25.jpg" alt="project-screenshot" width="900" height="400/">
<br><br>
<img src="https://i.postimg.cc/gk5hyzkj/26.jpg" alt="project-screenshot" width="900" height="400/">
<br><br><br><br>
<h2>🧐 Features</h2>

Here're some of the project's best features:

*   ✅ Role-based user access: Admin Student
*   ✅ Secure login using JWT
*   ✅ Easy API testing via Postman
*   ✅ Token-based stateless authentication
*   ✅ PostgreSQL integration
*   ✅ Student-only endpoint to fetch all questions
*   ✅ Admin-only endpoint to add questions
<br><br>
<h2>🛠️ Installation Steps:</h2>

<p>1. Clone the repository</p>

```
git clone https://github.com/SarthakTD/Spring-Role-Gradle.git cd Spring-Role-Gradle
```

<p>2. Set up PostgreSQL Database Create a database (e.g. springrole) Update application.properties with DB credentials:</p>

```
spring.datasource.url=jdbc:postgresql://localhost:5432/springrole spring.datasource.username=your_username spring.datasource.password=your_password
```

<p>3. Build the project using Gradle</p>

```
./gradlew build
```

<p>4. Run the application</p>

```
./gradlew bootRun
```
<br><br>
<h2>🍰 Contribution Guidelines:</h2>

Thank you for considering contributing to this project! We welcome all kinds of contributions — whether it's bug fixes new features documentation improvements or suggestions. Please follow the guidelines below to ensure a smooth collaboration.
<br><br>  
<h2>💻 Built with</h2>

Technologies used in the project:

🧩 Backend
*   Java 17+ – Modern Java version for better performance and language features
*   Spring Boot – Framework for creating standalone production-grade applications
*   PostgreSQL – Open-source relational database for persistence
*   JWT (JJWT) – JSON Web Token implementation for stateless authentication
*   Spring Data JPA – Simplified database access and ORM with Hibernate
*   Spring Security – Secure the application with role-based access and JWT
⚙️Build & Dependency Management
*   Gradle – Fast and flexible build automation tool
