package chainofresponsibility.demo2;


public class DirectorOfDepartment implements Management {

    private  Management management;

    public void setManagement(Management management) {
        this.management = management;
    }

    @Override
    public void ExaminationAndApproval(String type, int num) {
        System.out.println("部门总监开始审批你的"+type+"请求");
        switch (type){
            case Management.RAISESALARY:
                if(num>1000&&num<2000){
                    System.out.println("可以没有问题");
                }else if(num>=2000&&management!=null){
                    management.ExaminationAndApproval(type,num);
                }
                break;
            case Management.LEAVE:
                if(num>2&&num<5){
                    System.out.println("批准没有问题");
                }else {
                    management.ExaminationAndApproval(type,num);
                }
                ;break;
            default:break;
        }

    }
}
