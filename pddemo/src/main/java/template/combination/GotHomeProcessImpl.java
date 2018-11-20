package template.combination;

public class GotHomeProcessImpl {

    private GotHomeProcess process=new GotHomeProcess();

    public void goHome(){
        Step1Interfade s1 = new Step1Interfade() {
            @Override
            public void step1() {
                System.out.println("欢快的从公司到北苑路北");
            }
        };


        Step2Interfade s2 = new Step2Interfade() {
            @Override
            public void step2() {
                System.out.println("北苑路北到龙泽地铁上有人斗殴！！");
            }
        };

        Step3Interfade s3 = new Step3Interfade() {
            @Override
            public void step3() {
                System.out.println("从龙泽到家里没有下雨，顺便还吃了个饭");
            }
        };
        process.gothome(s1,s2,s3);
    }
}
