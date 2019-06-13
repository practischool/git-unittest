package org.practischool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void triangleNumber0() {
        // 计算第0个三角形数
        assertEquals(App.triangleNumber(0), -1);
    }

    @Test
    public void triangleNumber1() {
        // 计算第1个三角形数
        assertEquals(App.triangleNumber(1), -1);
    }

    @Test
    public void triangleNumber5() {
        // 计算第5个三角形数
        assertEquals(App.triangleNumber(5), -1);
    }

    @Test
    public void triangleNumber10() {
        // 计算第10个三角形数
        assertEquals(App.triangleNumber(10), -1);
    }

    @Test
    public void factorial0() {
        // 计算0的阶乘
        assertEquals(App.factorial(0), -1);
    }

    @Test
    public void factorial1() {
        // 计算1的阶乘
        assertEquals(App.factorial(1), -1);
    }

    @Test
    public void factorial5() {
        // 计算5的阶乘
        assertEquals(App.factorial(5), -1);
    }

    @Test
    public void factorial10() {
        // 计算10的阶乘
        assertEquals(App.factorial(10), -1);
    }

    @Test
    public void fibonacci1() {
        // 计算第1个斐波那契数
        assertEquals(App.fibonacci(1), -1);
    }

    @Test
    public void fibonacci2() {
        // 计算第2个斐波那契数
        assertEquals(App.fibonacci(1), -1);
    }

    @Test
    public void fibonacci3() {
        // 计算第3个斐波那契数
        assertEquals(App.fibonacci(3), -1);
    }

    @Test
    public void fibonacci10() {
        // 计算第4个斐波那契数
        assertEquals(App.fibonacci(10), -1);
    }
}
