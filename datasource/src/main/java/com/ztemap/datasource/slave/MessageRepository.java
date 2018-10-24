package com.ztemap.datasource.slave;


import com.ztemap.datasource.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MessageRepository extends JpaRepository<Message, Long> {

}
