package MyData;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cowBaby
 * @create 2023/2/26-00:18
 */
public class DataModel<K, V, T> {

    private K k;

    private V v;

    private T t;

    public DataModel<K, V, T> setData(K k, V v, T t){
        this.setData(k, v);
        this.t = t;
        return this;
    }

    public DataModel<K, V, T> setData(K k){
        this.k = k;
        return this;
    }

    public DataModel<K, V, T> setData(K k, V v){
        this.setData(k);
        this.v = v;
        return this;
    }

    public DataModel<K, V, T> printData(){
        int num = checkData();
        StringBuilder sb = new StringBuilder();
        switch (num){
            case 3:
                sb.append(checkTypeAndShowMsg(k)).append(" ").append(checkTypeAndShowMsg(v))
                        .append(" ").append(checkTypeAndShowMsg(t));
                break;
            case 2:
                sb.append(checkTypeAndShowMsg(k)).append(" ").append(checkTypeAndShowMsg(v));
                break;
            case 1:
                sb.append(checkTypeAndShowMsg(k));
                break;
            default:
                sb.append("没有值");
        }

        System.out.println(sb.toString());
        return this;
    }

    private int checkData(){
        if(t != null){
            return 3;
        }else if(v != null){
            return 2;
        }else if(k != null){
            return 1;
        }else{
            return -1;
        }
    }

    public K getK(){
        return this.k;
    }

    public V getV(){
        return this.v;
    }

    public T getT(){
        return this.t;
    }

    public Map<K, V> getKAndV(){
        HashMap<K, V> hashMap = new HashMap<>();
        hashMap.put(k, v);
        return hashMap;
    }

    public Map<K, Map<V, T>> getAllData(){
        HashMap<K, Map<V, T>> kMapHashMap = new HashMap<>();
        HashMap<V, T> vtHashMap = new HashMap<>();
        vtHashMap.put(v, t);
        kMapHashMap.put(k, vtHashMap);

        return kMapHashMap;
    }
    private String checkTypeAndShowMsg(Object obj){

        Class clazz1 = Integer.class;
        Class clazz2 = Integer[].class;

        Class clazz3 = Double.class;
        Class clazz4 = Double[].class;

        Class clazz5 = String.class;
        Class clazz6 = String[].class;

        Class clazz0 = obj.getClass();

        if(clazz2 == clazz0){
            return Arrays.toString((Integer[])obj);
        }else if(clazz4 == clazz0){
            return Arrays.toString((Double[])obj);
        }else if(clazz6 == clazz0){
            return Arrays.toString((String[])obj);
        }else{
            return obj.toString();
        }
    }


    public static void main(String[] args) {


    }
}
