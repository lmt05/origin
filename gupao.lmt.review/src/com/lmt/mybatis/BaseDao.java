package com.lmt.mybatis;

import java.sql.*;

public class BaseDao {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    //打开数据库链接
    public void openConn(){
        //加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/lmt", "root", "lmt1993.");
            System.out.println("数据库链接成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    //关闭连接
    public void closeConn(){
        try{
            if(rs != null){
                conn.close();
            }
            if(ps != null){
                conn.close();
            }
            if(conn != null){
                conn.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //执行查询
    public ResultSet query(String sql,Object [] parm){
        this.openConn();
        try {
            ps = conn.prepareStatement(sql);
            if(parm != null){
                for (int i = 0; i < parm.length; i++) {
                    ps.setObject(i+1,parm[i]);
                }
            }
             rs =  ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    };

    //执行增删改

    public int update(String sql,Object[] parm){
        this.openConn();
        int count = 0;
        try {
            ps = conn.prepareStatement(sql);
            if(parm != null){
                for (int i = 0; i < parm.length; i++) {
                    ps.setObject(i+1,parm[i]);
                }
            }
            count = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.closeConn();
        }
        return count;
    }
}
