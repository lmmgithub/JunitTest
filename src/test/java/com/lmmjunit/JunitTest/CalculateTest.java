package com.lmmjunit.JunitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Calculate 测试文件
 * @author PJY
 * @date 2018年4月25日
 *
 */
public class CalculateTest {
    private Calculate calculate;
    /**
     * 在每个方法执行前执行
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
         calculate=new Calculate();
    }
    /**
     * 在每个方法执行后执行
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
    }
    /**
     * 测试规范点:
     * 3、测试方法必须使用@Test注解，并且方法必须是public void，不能带任何参数；
     * 4、测试单元中的每个方法必须可以独立，测试方法之间不能有任何的依赖；
     * 5、测试方法最好使用test作为方法名的前缀
     */
    @Test
    public void testAdd() {
         //调用所需要测试的函数
         //真实值
         int result=calculate.add(10, 20);
         //期望值
         int expect=30;
         //断言
         //assertEquals(expect, result);
         //delta代表的是误差值，当excepted与actual相差的绝对值小于这个值时测试通过。但大于等于时会失败。
         assertEquals(expect, result, 0);
    }
    @Test
    public void testSubstract() {
         int result=calculate.substract(10, 5);
         assertEquals(5, result);
    }
    @Test
    public void testMultiply() {
         int result = calculate.multiply(2, 3);
         assertEquals(6, result);
    }
    @Test
    public void testDivide() {
         int result = calculate.divide(10, 3);
         assertEquals(3, result, 0);
    }
    
    @Test
    public void testAdd1() {
         int result = calculate.divide(3, 5);
         assertEquals(7, result, 0);
    }
    
    @Test
    public void testsubstract1() {
         int result = calculate.divide(10, 3);
         assertEquals(5, result, 0);
    }
    @Test
    public void testMultiply1() {
         int result = calculate.divide(10, 3);
         assertEquals(60, result, 0);
    }
    @Test
    public void testDivide1() {
         int result = calculate.divide(10, 3);
         assertEquals(3.3, result, 0);
    }
}

