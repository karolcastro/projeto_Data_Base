package com.my.project.model.DTO;


import com.my.project.exceptions.DB;
import com.my.project.exceptions.DbException;
import com.my.project.model.entities.Department;
import com.my.project.model.entities.Seller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class SellerDTOJDBC implements SellerDTO {

    private Connection connection;

    public SellerDTOJDBC(Connection connection) {
        this.connection = connection;
    }

    private SellerDTO sellerDTO;


    @Override
    public void insert(SellerDTO obj) {

    }

    @Override
    public void update(SellerDTO obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Seller findById(Integer id) {
        //sellerDTO.findById(id);

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(

                    "SELECT coursejdbc.seller.*,coursejdbc.department.Name as DepName\n" +
                            "FROM seller INNER JOIN department\n" +
                            "ON seller.DepartmentId = department.Id\n" +
                            "WHERE seller.Id = ?");

            preparedStatement.setInt(1, id);
            preparedStatement.executeQuery();
            if (resultSet.next()) {
                Department dep = instatiateDepartment(resultSet);
                Seller obj = instatiateSeller(resultSet, dep);
                return obj;

            }
            return null;
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(preparedStatement);
            DB.closeResultSet(resultSet);
        }
    }

    private Seller instatiateSeller(ResultSet resultSet, Department dep) throws SQLException {
        Seller obj = new Seller();
        obj.setId(resultSet.getInt("Id"));
        obj.setName(resultSet.getString("Name"));
        obj.setEmail(resultSet.getString("Email"));
        obj.setBirthDate(resultSet.getDate("BirthDate"));
        obj.setBaseSalary(resultSet.getDouble("BaseSalary"));
        obj.setDepartment(dep);
        return obj;
    }

    private Department instatiateDepartment(ResultSet resultSet) throws SQLException {
        Department dep = new Department();
        dep.setId(resultSet.getInt("DepartmentId"));
        dep.setName(resultSet.getString("DepName"));
        return dep;
    }

    @Override
    public List<SellerDTO> findAll() {

        return null;
    }
}
