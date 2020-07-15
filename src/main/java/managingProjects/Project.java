package managingProjects;

import org.springframework.data.annotation.Id;

public class Project {

    @Id private String id;

    private String type;
    private String title;
    private String supervisor;
    private String externalPartner;
    private String student;
    private String outline;
    private String tags;

    public Project(){}
  //  curl -i -X POST -H "Content-Type:application/json" -d "{  \"type\" : \"Master\",  \"title\" : \"MasterProject\", \"supervisor\" : \"Carron Shankland\", \"externalPartner\" : \"no\",\"student\" : \"tbd\",\"outline\" : \"tbd\",\"tags\" : \"java\", \"status\" : \"Apply\"}" http://localhost:8080/projects

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getExternalPartner() {
        return externalPartner;
    }

    public void setExternalPartner(String externalPartner) {
        this.externalPartner = externalPartner;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;



}
