package com.ztemap.datasource;

import com.ztemap.datasource.entity.Message;
import com.ztemap.datasource.entity.Student;
import com.ztemap.datasource.repository.StudentRepository;
import com.ztemap.datasource.slave.MessageRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DatasourceApplicationTests {
//    @Autowired
//    StudentRepository studentRepository;


//    @Autowired
//    private JdbcTemplate jdbcTemplate;


//    @Autowired
//    private DataSourceSwitchService service;

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private MessageRepository messageRepository;
    @Test
    public void testSwitchDataSource(){
        Student student = new Student("xx");
        studentRepository.save(student);
        Message message = new Message("xx","cc");
        messageRepository.save(message);

    }


//    @Test
//    public void testJpa() throws InterruptedException {
//        ExecutorService ex = Executors.newFixedThreadPool(3);
//        CountDownLatch countDownLatch = new CountDownLatch(3);
//        log.info("Task  start !!!");
//        for (int i = 0; i < 3; i++) {
//            ex.submit(() -> {
//                for (int t = 0; t < 10000; t++) {
//                    studentRepository.save(new Student("xx"));
//                }
//                countDownLatch.countDown();
//            });
//        }
//        countDownLatch.await();
//        ex.shutdown();
//        log.info("Task  end  !!!");
//    }


}
