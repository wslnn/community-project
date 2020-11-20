package com.nowcoder.community;

import com.nowcoder.community.service.AlphaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import sun.java2d.pipe.SpanIterator;

import javax.sound.midi.Soundbank;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class TransactionTests {

    @Autowired
    private AlphaService alphaService;

    @Test
    public void testSave1(){
        Object save1 = alphaService.save1();
        System.out.println(save1);
    }

    @Test
    public void testSave2(){
        Object save1 = alphaService.save2();
        System.out.println(save1);
    }
}
