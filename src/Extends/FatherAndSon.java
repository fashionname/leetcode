package Extends;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cowBaby
 * @create 2023/2/25-04:17
 */
public class FatherAndSon {

    /*
        开发分为3种方式:
            半开发:
                调用别人的接口
                    多态机制 传入子类型
                定义自己的接口给别人开发
                    定义接口 抽象方法
                    定义泛型类
            独立开发
            合作开发


     */

}


class SetVal<T>{

    T t;

    public void setT(T t){
        this.t = t;
    }

    public T getT(){
        return this.t;
    }

    public void useT(){
        if(t instanceof Print){
            ((Print) t).doSome();
        }else{

        }
    }
}

@FunctionalInterface
interface Print{

    void doSome();
}

class Father{
    // int age = 36;
}

class Son extends Father{
    int age = 12;
}