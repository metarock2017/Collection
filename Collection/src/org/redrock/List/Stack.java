package org.redrock.List;

import java.util.LinkedList;

/**
 * 栈：后进先出(LIFO)容器
 * Created by wang on 2017/8/6.
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    public void push(T v) {storage.addFirst(v);}

    public T peek() {return storage.getFirst();}

    public T pop() {return storage.removeFirst();}

    public boolean empty() {return storage.isEmpty();}

    @Override
    public String toString() {return storage.toString();}

    public static void main(String[] args) {
        String test = "+d+-+-+e+R---+c+o+r---+k-+,-+e+h+ --+--+l+l--+!+!+o---";
        //作业：使用栈处理以上字符串，如果是"+"号将字母压入栈，而"-"将栈顶元素弹出并打印
        Stack<String> stringStack = new Stack<>();
        char[] arr = test.toCharArray();
        for(int i = 0; i < arr.length; i++){
            String s = String.valueOf(arr[i]);
            if("+".equals(s)){
                String str = String.valueOf(arr[i+1]);
                byte b = (byte) arr[i+1];
                //判断下一位是不是字母
                if((b >= 65  && b <= 90) || (b >=97 && b <= 122)){
                    stringStack.push(str);
                }else if("-".equals(str)){
                   //判断栈顶是否为空
                    if(stringStack.empty()){
                        continue;
                    }
                    else{
                        System.out.println("弹出:" + stringStack.pop());
                    }
                }
            }else{
                if("-".equals(s)){
                    if(stringStack.empty()){
                        continue;
                    }
                     else{
                        System.out.println("弹出:" + stringStack.pop());
                    }
                }else{
                    continue;
                }
            }
        }
        for (int i = 0; i < stringStack.storage.size(); i++){
            System.out.print(stringStack.toString());
        }
    }
}
