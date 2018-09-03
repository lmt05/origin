import com.lmt.mybatis.BaseDao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        /*BaseDao bd = new BaseDao();
        String sql = "select * from student where id = ?";
        Object[] parm = {2};
        ResultSet rs = bd.query(sql,parm);
        try {
            while (rs.next()){
                int id = rs.getInt("ID");
                String name = rs.getString(2);
                int sex = rs.getInt(3);
                int age = rs.getInt(4);
                System.out.println("id = "+ id+"姓名："+name+"性别："+sex+"年龄："+age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        String str = " ";
        System.out.println(str.length());
        if(str.isEmpty())
            System.out.println("字符串為空");*/

   /*     String str = new String();
        str = "Hello";
        Integer i = new Integer(1);
        getString(str);
        int [] arr = {1,2,3,4,5};
        System.out.println(i);
        update(i);
        demo(arr);
        System.out.println(i);
        System.out.println(arr[2]);
        System.out.println(str);


        String s = "Hello";

        String b=s+"world";
        s=s+"world";
        System.out.println(s+"..."+b);*/

        int c = 2;
        c=c+=c++;
        System.out.println(c);
        c+=1;
        System.out.println(c);

    }

    public static int getSum(int a){
        try {
            int b = a/0;
            System.out.println("hehe");
            return b;
        }catch (Exception e){
            System.out.println("异常");
            return 0;
        }finally {
            System.out.println("finally");
        }
    }

    public static int update(Integer a){
        a =a++;
        System.out.println(a);
        return a;
    }

    public static int[] demo(int[] arr){
        arr[2] = 12;
        System.out.println(arr[2]);
        return arr;
    }

    public static String getString(String str){
        str = "welcome";
        System.out.println(str);
        return str;
    }

}
