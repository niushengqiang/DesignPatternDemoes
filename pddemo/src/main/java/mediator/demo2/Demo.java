package mediator.demo2;

public class Demo {
    public static void main(String[] args){

        Employee zhangSan = new ZhangSan();
        Employee liSi = new LiSi();

        QQEnterpriseEdition qqEnterpriseEdition = new QQEnterpriseEdition(zhangSan, liSi);

        qqEnterpriseEdition.sendMsg(zhangSan);
        qqEnterpriseEdition.sendMsg(liSi);

    }
}
