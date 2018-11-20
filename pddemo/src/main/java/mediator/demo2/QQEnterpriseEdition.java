package mediator.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * 这里咱们用企业QQ当做中介者
 */
public class QQEnterpriseEdition {

    private Employee zhangsan;
    private Employee lisi;

    public QQEnterpriseEdition() {
    }

    public QQEnterpriseEdition(Employee zhangsan, Employee lisi) {
        this.zhangsan = zhangsan;
        this.lisi = lisi;
    }

    public  void sendMsg(Employee employee){

        employee.speak("");
        if (employee instanceof ZhangSan){
            lisi.receive();
        }else{
            zhangsan.receive();
        }

    }

}
