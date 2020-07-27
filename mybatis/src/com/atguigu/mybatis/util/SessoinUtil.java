package com.atguigu.mybatis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SessoinUtil {
    public static SqlSessionFactory sqlSessionFactory;
    static{  String resource="mybatis_config.xml";
       // InputStream resourceAsStream = null;
       // try {
        InputStream resourceAsStream=null;
        try {
              resourceAsStream = Resources.getResourceAsStream(resource);

        } catch (IOException e) {
            e.printStackTrace();
        }
        //  } catch (IOException e) {



       // }
        //SqlSessionFactoryBuilder sqlSessionFactoryBuilder =;
         sqlSessionFactory =  new SqlSessionFactoryBuilder().build(resourceAsStream);

    }
    public static ThreadLocal<SqlSession> threadLocal=new ThreadLocal<>();
    // 1:获取session链接
    public static SqlSession getSession(){
      //  SqlSession sqlSession = threadLocal.get();
     // if (threadLocal.get()==null){
           threadLocal.set(sqlSessionFactory.openSession());
      // }
        SqlSession sqlSession = threadLocal.get();
       // SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;


    }
    public static void myClose(SqlSession sqlSession){
        if (sqlSession!=null){
            sqlSession.close();
          //  threadLocal.remove();

        }
    }

}
