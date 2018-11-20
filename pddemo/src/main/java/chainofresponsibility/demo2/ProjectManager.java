package chainofresponsibility.demo2;

public class ProjectManager implements Management {


    private  Management m;

    public void setM(Management m) {
        this.m = m;
    }

    @Override
    public void ExaminationAndApproval(String type, int num) {
        System.out.println("项目经理开始审批你的"+type+"请求");
        switch (type){
            case Management.RAISESALARY:
                if(num>0&&m!=null){
                        m.ExaminationAndApproval(type,num);
                }
                break;
            case Management.LEAVE:
                if(num>0&&num<3){
                    System.out.println("批准没有问题");
                }else {
                    m.ExaminationAndApproval(type,num);
                }
                ;break;
            default:break;
        }
    }
}
