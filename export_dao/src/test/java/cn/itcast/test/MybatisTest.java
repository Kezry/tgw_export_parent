package cn.itcast.test;

import cn.itcast.dao.company.CompanyDao;
import cn.itcast.domain.company.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class MybatisTest {
    @Autowired
    private CompanyDao companyDao;

    @Test
    public void test01() {
        List<Company> list = companyDao.findAll();
        System.out.println("所有的人" + list);
    }


}
