package managingProjects;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    private String id;

    private  String username;
    private String password;
    private String name;
    private String email;
    private int studentsAssigned;

    public int getStudentsAssigned() {
        return studentsAssigned;
    }

    public void setStudentsAssigned(int studentsAssigned) {
        this.studentsAssigned = studentsAssigned;
    }

    public int getStudentsMax() {
        return studentsMax;
    }

    public void setStudentsMax(int studentsMax) {
        this.studentsMax = studentsMax;
    }

    private int studentsMax;
   // curl -i -X POST -H "Content-Type:application/json" -d "{  \"username\" : \"carronS\",  \"password\" : \"pass1\", \"name\" : \"Carron Shankland\", \"email\" : \"carron@example.com\", \"status\" : \"false\", \"studentsAssigned\" : \"0\", \"studentsMax\" : \"5\"}" http://localhost:8080/users
    public User(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    private boolean status;
}
