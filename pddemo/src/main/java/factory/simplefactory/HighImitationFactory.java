package factory.simplefactory;


import factory.LiNing;
import factory.Nike;
import factory.Tshirt;

/**
 * 这是一个高仿的工厂,简单工程模式,简单易用但是不是标准的23种设计模式之一
 */
public class HighImitationFactory {

    public Tshirt getATshirt(String name){
            if("李宁".equals(name)){
                return new LiNing();
            }else if("耐克".equals(name)){
                return new Nike();
            }else{
                System.out.println("不知道你要买什么地摊货");
                return null;
            }
    }
}
