package org.redrock.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList 实现了基本的list接口，但是他在执行插入，移除的操作时比ArrayList更高效
 * 此外他还添加了使其用作栈、队列或双端队列的方法
 * getFirst() element() 方法完全一样 返回列表的第一个元素（不移除）,如果list为空，抛出NoSuchElementException 异常
 * peek() 方法作用一致，但列表为空时返回null
 * removeFirst() remove() 完全一样，他们移除并返回列表的头，列表为空时，抛出NoSuchElementException异常
 * poll() 稍有差异，为空时返回null
 * addFirst() add() addLast() 相同 将某个元素插入到列表的尾端
 * removeLast() 移除并返回列表的最后一个元素
 *
 * Created by wang on 2017/8/6.
 */
public class Parcel6 {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(5));
        System.out.println(pets);
        //作业：1) 测试以上的方法
        System.out.println("--------------分割线--------------------");

        System.out.println(pets.getFirst() + " " + pets.element());
        System.out.println(pets);
        System.out.println("--------------分割线--------------------");
        System.out.println("peek():" + pets.peek());
        System.out.println(pets);
        System.out.println("--------------分割线--------------------");
        System.out.println(pets.removeFirst());
        System.out.println(pets);
        System.out.println(pets.remove());
        System.out.println(pets);
        System.out.println("--------------分割线--------------------");
        System.out.println(pets.poll());
        System.out.println(pets);
        System.out.println("--------------分割线--------------------");
        Pet p = new Pet("wws");
        System.out.println(pets.add(p));
        pets.addFirst(p);
        pets.addLast(p);
        System.out.println(pets);
        System.out.println("--------------分割线--------------------");
        System.out.println(pets.remove());
        System.out.println(pets);
        //作业：2) 将Integer对象加入ArrayList 和 LinkedList 的前，中，后，观察运行时间(数量级10^4以上)
        //这里书写你的程序
        long startTime = System.nanoTime();
        List<Integer> list = new ArrayList<>();
        LinkedList<Integer> link = new LinkedList<>();
        System.out.println("--------------新建10W数据分割线--------------------");

        for (int i = 0; i < 100000; i++ ){
            list.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList 运行时间：" + (endTime - startTime));
        startTime = System.nanoTime();
        for (int j = 0;j < 100000; j++){
            link.addFirst(j);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 运行时间：" + (endTime - startTime));

        System.out.println("--------------中间插入数据分割线--------------------");
        startTime = System.nanoTime();
        for (int i = 0;i < 10000; i++){
            list.set(1000,i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList插入中间 运行时间：" + (endTime - startTime));

        startTime = System.nanoTime();
        for(int j = 0; j < 10000; j++){
            link.set(1000,j);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 运行时间：" + (endTime - startTime));

    }


}
