
//subClass
public class Developer extends Employee {
    String projectName ;

    public Developer (){
        System.out.println(" This is subClass ");
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
