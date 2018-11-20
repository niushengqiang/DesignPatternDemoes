package chainofresponsibility.demo2;


/**
 * 管理层都拥有审批请求的只能
 */
public interface Management {
    String RAISESALARY="RAISESALARY";
    String LEAVE="LEAVE";
    public void    ExaminationAndApproval(String type,int num);
}
