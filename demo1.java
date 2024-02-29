package newBie;
import implement.maximumArrayValue;
/**
 *
 *这是一个数组工具类
 *
 *@author 尼古拉斯·阿玮
 *@version 1.0
 *
 */
public class demo1 {
    public static void main(String[] args) {
        int[] exampleArray = {1,2,3,4,7,8};
        int max = maximumArrayValue.getMax(exampleArray);
        System.out.println("最大值是:"+max);
    }
}