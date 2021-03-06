package com.ync.biz.user.impl;

import com.ync.biz.common.JDBCUtil;
import com.ync.biz.user.UserVO;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@Repository("userDAO")
public class UserDAO {
    private Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;

    private final String USER_GET = "select * from users where id=? and password=?";

    //회원등록
    public UserVO getUser(UserVO vo) {
        UserVO user = null;
        try {
            System.out.println("========> JDBC로 getUser() 기능 처리");
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(USER_GET);
            stmt.setString(1,vo.getId());
            stmt.setString(2,vo.getPassword());
            rs = stmt.executeQuery();
            if (rs.next()) {
                user = new UserVO();
                user.setSeq(rs.getInt("SEQ"));
                user.setId(rs.getString("ID"));
                user.setPassword(rs.getString("PASSWORD"));
                user.setName(rs.getString("NAME"));
                user.setRole(rs.getString("ROLE"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs,stmt,conn);
        }
        return user;
    }
}
