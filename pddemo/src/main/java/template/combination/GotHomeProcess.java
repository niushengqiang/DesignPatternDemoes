package template.combination;

/**
 * 下班回家的执行过程
 */
public  class GotHomeProcess {


    public  void gothome(Step1Interfade s1,Step2Interfade  s2,Step3Interfade s3){
       s1.step1();
       s2.step2();
       s3.step3();
    }
}
