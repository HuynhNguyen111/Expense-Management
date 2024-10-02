package dao;

import enitty.ExpenditureType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.ExpenditureTypeUtil;

public class ExpenditureTypeDao {

    public ExpenditureType insert(ExpenditureType entity) throws ClassNotFoundException, SQLException {
        String sql = "insert into expenditureType(name) values(?)";
        try (Connection con = ExpenditureTypeUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);) {
            pstmt.setString(1, entity.getName());
            pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            if (rs.next()) {
                entity.setId(rs.getInt(1));
            }
            return entity;
        }

    }

    public ExpenditureType update(ExpenditureType entity) throws ClassNotFoundException, SQLException {
        String sql = "update expenditureType set name = ? where id =?";
        try (Connection con = ExpenditureTypeUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, entity.getName());
            pstmt.setInt(2, entity.getId());
            pstmt.executeUpdate();

            return entity;
        }

    }

    public boolean delete(int id) throws ClassNotFoundException, SQLException {
        String sql = "delete from expenditureType  where id =?";
        try (Connection con = ExpenditureTypeUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, id);

            return pstmt.executeUpdate() > 0;
        }

    }

    public List<ExpenditureType> findAll() throws ClassNotFoundException, SQLException {
        String sql = "select * from expenditureType";
        try (Connection con = ExpenditureTypeUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {
            List<ExpenditureType> list = new ArrayList<>();

            try (ResultSet rs = pstmt.executeQuery();) {
                while (rs.next()) {
                    ExpenditureType entity = new ExpenditureType();
                    entity.setId(rs.getInt("id"));
                    entity.setName(rs.getString("name"));
                    list.add(entity);
                }
            }
            return list;
        }

    }

    public ExpenditureType findById(int id) throws ClassNotFoundException, SQLException {
        String sql = "select * from expenditureType where id=?";
        try (Connection con = ExpenditureTypeUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, id);

            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    ExpenditureType entity = new ExpenditureType();
                    entity.setId(rs.getInt("id"));
                    entity.setName(rs.getString("name"));
                    return entity;
                }

            }
            return null;
        }

    }
}
