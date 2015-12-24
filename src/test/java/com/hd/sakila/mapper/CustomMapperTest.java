package com.hd.sakila.mapper;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hd.sakila.pojo.CustomQueryVo;
import com.hd.sakila.pojo.MakeCustomer;




public class CustomMapperTest {

    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
    }

    @Test
    public void testMakeCustomers() throws Exception {
    	MakeCustomerMapper makeCustomerMapper = (MakeCustomerMapper) applicationContext.getBean("makeCustomerMapper");
    	System.out.println("自动生成的代理类：" + makeCustomerMapper);
    	CustomQueryVo customQueryVo = new CustomQueryVo();
    	MakeCustomer makeCustomer = new MakeCustomer();
    	makeCustomer.setCustomerId((short) 1);
    	customQueryVo.setMakeCustomer(makeCustomer);
    	System.out.println("查询的参数是：" + customQueryVo.getMakeCustomer().getCustomerId());
    	List<MakeCustomer> queryCustomers = makeCustomerMapper.queryCustomFilm(customQueryVo);
    	System.out.println(queryCustomers);
    }
}