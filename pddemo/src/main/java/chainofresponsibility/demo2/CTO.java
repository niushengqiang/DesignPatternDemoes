package chainofresponsibility.demo2;

public class CTO implements Management{

    private Management management;

    public void setManagement(Management management) {
        this.management = management;
    }

    @Override
    public void ExaminationAndApproval(String type, int num) {
        System.out.println("CTO开始审批你的"+type+"请求");
        switch (type) {

            case Management.RAISESALARY:
                System.out.println("我这里什么都不给你批复");
                break;
            case Management.LEAVE:
                System.out.println("我这里什么都不给你批复");
                ;
                break;
            default:
                break;
        }
    }

}
