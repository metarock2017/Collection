package org.redrock.set;

import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wang on 2017/8/6.
 */
public class Parcel8 {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        //这里的路径需要自己找一个文件替换
        words.addAll(new TextFile("HttpRequest.php", "\\w+").getData());
        System.out.println(words);
        Pattern pattern = Pattern.compile(".*\\d+.*");
        //作业：选择一个文件，利用Set容器的特性，计算该文件中有多少个不同的单词
        int count = 0;
        Set<String> newWord = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        for (String s: words) {
            Matcher matcher = pattern.matcher(s);
            if(matcher.matches()){
                continue;
            }else{
                count++;
                newWord.add(s);
            }
        }
        System.out.println(count);
        System.out.println(newWord);

    }
}
