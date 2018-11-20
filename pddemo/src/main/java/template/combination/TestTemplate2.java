package template.combination;

/**
 * 这里通关新的方式测试模板方法模式
 */
public class TestTemplate2 {
    public static void main(String[] args) {
        GotHomeProcessImpl gotHomeProcess = new GotHomeProcessImpl();
        gotHomeProcess.goHome();
    }
}
