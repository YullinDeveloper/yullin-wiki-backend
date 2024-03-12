package com.yullin.wiki.repository.Member;

import com.yullin.wiki.domain.Member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

@Repository
public class MemberRepository {

    private final DataSource datasource;
    private static Map<Long,Member> storage = new HashMap<>();
    private static Long MemberKey = 0L;

    public MemberRepository(DataSource datasource) {
        this.datasource = datasource;
    }


    public void save(Member mb) {

        String sql = "insert into MEMBER(member_id,passwd,name,gender,birth_dt,yullin_DN,member_type,join_dt,last_update_dt) values(?,'111','moon','m',?,0,'moon',?,?)";
        ++MemberKey;
        Timestamp tmp = new Timestamp(System.currentTimeMillis());
        storage.put(MemberKey,mb);
        try {
            Connection conn = datasource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,mb.getMember_id());
            pstmt.setTimestamp(2, tmp);
            pstmt.setTimestamp(3, tmp);
            pstmt.setTimestamp(4, tmp);
            pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        }catch(Exception e) {
            System.out.println(e.getMessage()+" ERROR");
        }}

}

