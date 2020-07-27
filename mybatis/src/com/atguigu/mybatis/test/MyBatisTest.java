package com.atguigu.mybatis.test;

import com.atguigu.mybatis.bean.Employee;
import com.atguigu.mybatis.dao.EmployeeMapper;
import com.atguigu.mybatis.util.SessoinUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class MyBatisTest {
    @Test
    public void test() throws IOException {
        String resource = "mybatis_config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = mapper.getEmployeeById(1);
            System.out.println(employee);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testAddEmp() throws IOException {
        String resource = "mybatis_config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = new Employee(null, "jack1", "1", "j@qq.com");
            Long no = mapper.addEmp(employee);
            sqlSession.commit();
            System.out.println(no);

            System.out.println(employee.getId());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testUpdate() throws IOException {
        String resource = "mybatis_config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            mapper.updateEmp(new Employee(4, "mm", "0", "mm@qq.com"));
            sqlSession.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testDelete() throws IOException {
        String resource = "mybatis_config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

            mapper.deleteEmpById(5);
            sqlSession.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testGet() throws IOException {
        String resource = "mybatis_config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            List<Employee> list=new ArrayList<>();

            List<Map<String, Object>> list1 = mapper.getEmpAndAddress();
            for (Map<String, Object>map:list1
            ){
                Set<String> keySet = map.keySet();
                for (String key:keySet
                     ) {
                    System.out.println("key:"+key);
                    System.out.println("key:"+map.get(key));
                }


            }

            System.out.println("***************************************************");
            Integer[] arr={6,7,8,9};
            List<Employee> emps = mapper.getEmps(arr);
            for (Employee e :
                    emps) {
                System.out.println(e);
            }

            System.out.println("***************************************************");
            list = mapper.getEmpByIdAndName(null, "");
            sqlSession.commit();
            for (Employee employee:list
                 ) {
                System.out.println(employee);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testGetMap() throws IOException {
//       String resource = "mybatis_config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory =
//                new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
      SqlSession sqlSession = SessoinUtil.getSession();

        try {
            EmployeeMapper  mapper = sqlSession.getMapper(EmployeeMapper.class);

            Map<String, Object> map = new HashMap<>();
            map.put("id", 1);
            map.put("lastName", "tom");
            Employee mm = mapper.getEmpByMap(map);
            sqlSession.commit();

            System.out.println(mm);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            SessoinUtil.myClose(sqlSession);
        }
    }
}