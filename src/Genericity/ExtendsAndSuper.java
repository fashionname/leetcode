package Genericity;

import java.util.*;

/**
 * @author cowBaby
 * @create 2023/2/25-04:29
 */
public class ExtendsAndSuper {

    /*
        不能直接装 <Number> <- <Integer>
        <? extends Integer> <? super Number>

     */
    public static void main(String[] args) {
        List<?> list = new ArrayList<Integer>();

        List<Integer> list1 = new ArrayList<Integer>();

        List<? extends Integer> list2 = new ArrayList<Integer>();

        List<? super Integer> list3 = new ArrayList<Integer>();

        List<Number> list6 = new ArrayList<>();

        list6.add(12);

        // List<Number> list1 = new ArrayList<Integer>(); error!

        // 只读不存 它是确定范围的 不是什么都可以存
        // 存的东西已经存在 没有贴标签
        List<? extends Box> list4 = new ArrayList<MidBox>();


        List<? super MidBox> list5 = new ArrayList<MidBox>();

        list5.add(new SubMidBox());

        Object obj = list5.get(0);

        new ExtendsAndSuper().setList(new ArrayList<LinkedList<Integer>>());


    }



    public void useList(List<? extends Number> list){
        // 为什么不用 List<Number> 因为不确定传入的泛型类型 都可以
        // extends 意味着 用我想要的类型
        if(list != null && list.size() != 0){
            Number num = list.get(0);
        }
    }

    public void setList(List<? extends List> list){
        // 传入定义泛型的任意子类型 并读取它
        // <父(内含父对象)> <父(内含子对象)> <子(内含子对象)> -> <? extends 父>
        // 如果是 super 定义泛型的任意父类型 并写入它
        if(list != null && list.size() != 0){
            List list1 = list.get(0);
        }
    }
}

class Box<T>{
    public void printSelf(){
        System.out.println(this.getClass().getName());
    }

    public static void main(String[] args) {

    }
}

class MidBox extends Box{

    @Override
    public void printSelf(){
        System.out.println(this.getClass().getName());
    }

}

class SmallBox extends Box{
    @Override
    public void printSelf(){
        System.out.println(this.getClass().getName());
    }
}

class BigBox extends Box{
    @Override
    public void printSelf(){
        System.out.println(this.getClass().getName());
    }
}

class SubMidBox extends MidBox{
    @Override
    public void printSelf(){
        System.out.println(this.getClass().getName());
    }
}



