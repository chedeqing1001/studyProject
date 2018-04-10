package cn.safetys.service;

import cn.safetys.vo.Emp;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by linux on 2018-4-10.
 */
public class IEmpServiceTest {
    @Test
    public void insert() throws Exception {
        TestCase.assertTrue(true);
    }

    @Test
    public void update() throws Exception {
        Emp vo = new Emp();
        vo.setEname("lisi");
        TestCase.assertNotNull(vo);
    }

    @Test
    public void delete() throws Exception {
        TestCase.assertTrue(false);
    }

}