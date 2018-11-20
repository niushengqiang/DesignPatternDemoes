package chainofresponsibility.demo2;

public class Test {
    public static void main(String[] args){
        ProjectManager projectManager = new ProjectManager();
        DirectorOfDepartment directorOfDepartment = new DirectorOfDepartment();
        CTO cto = new CTO();
        projectManager.setM(directorOfDepartment);
        directorOfDepartment.setManagement(cto);

        projectManager.ExaminationAndApproval(Management.LEAVE,2);

    }
}
