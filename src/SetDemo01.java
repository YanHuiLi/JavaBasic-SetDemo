import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set接口中不能加入重复的元素，但是可以排序
 *
 * Created by Archer on 2016/3/29.
 *
 * 散列存放：HashSet
 * 有序存放：TreeSet
 * HashSet：哈希表是通过使用称为散列法的机制来存储信息的，元素并没有以某种特定顺序来存放；
 * LinkedHashSet：以元素插入的顺序来维护集合的链接表，允许以插入的顺序在集合中迭代；
 * TreeSet：提供一个使用树结构存储Set接口的实现，对象以升序顺序存储，访问和遍历的时间很快。
 *
 */
public class SetDemo01 {

    public static void main(String[] args) {

        Set<String> s;
//        s=new HashSet<String>();
//        s.add("A");
//        s.add("B");
//        s.add("C");
//        s.add("D");
//        s.add("E");
//        s.add("F");
//        System.out.println(s);
        s=new TreeSet<String>();
        s.add("E");
        s.add("F");
        s.add("D");
        s.add("A");
        s.add("B");
        s.add("C");

        System.out.println(s);


    }
}
