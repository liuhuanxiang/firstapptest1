package stream;

import lombok.Data;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Description：
 *
 * @author: liu.hx
 * @date: 2019-08-30  15:56
 */
@Data
public class Resume {
    private String name;
    private String sex;
    private String age;

    public void display() {
        System.out.println("姓名："+name+"\t年龄："+age+"\t性别："+sex);
    }

    public Object clone(){
        try {
            Resume resume = (Resume)super.clone();
            return resume;
        }catch (Exception e){
            return null;
        }
    }

    public static void main(String[] args) {
//        String s = "12345E-10";
//        String regx = "^((-?\\\\d+.?\\\\d*)[Ee]{1}(-?\\\\d+))$";
//        Pattern compile = Pattern.compile(regx);
//        boolean matches = compile.matcher(s).matches();
//        System.out.println(matches);
//        new Thread(){
//            @Override
//            public void run() {
//                super.run();
//            }
//        };
//        int h;
//        System.out.println("liu".hashCode());
//        System.out.println("liu".hashCode() >> 16);
//        int i = (h = "liu".hashCode()) ^ (h >> 16);
//        System.out.println(i);
        System.out.println(4 ^ 4);
        System.out.println(3 | 3);



    }

}
