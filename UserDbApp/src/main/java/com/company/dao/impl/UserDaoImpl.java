/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao.impl;

import com.company.bean.User;
import com.company.dao.inter.AbstractDAO;
import com.company.dao.inter.UserDaoInter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class UserDaoImpl extends AbstractDAO implements UserDaoInter {
    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public boolean addUser(User u) {
        return false;
    }

    @Override
    public boolean updateUser(User u) {
        return false;
    }

    @Override
    public boolean removeUser(int id) {
        return false;
    }

//    @Override
//    public List<User> getAll() {
//        List<User> result = new ArrayList<>();
//
//        try (Connection c = connect()) {
//
//            Statement stmt = c.createStatement();
//            stmt.execute("select * from user");
//            ResultSet rs = stmt.getResultSet();
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String surname = rs.getString("surname");
//                String email = rs.getString("email");
//
//                result.add(new User(id, name, surname, email));
//
//            }
//            System.out.println(c.getClass().getName());
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return result;
//    }
//
//    @Override
//    public boolean updateUser(User u) {
//        try (Connection c = connect()) {
//
//            PreparedStatement stmt = c.prepareStatement("update user set name=?, surname=?,email=? where id =?");
//            stmt.setString(1, u.getName());
//            stmt.setString(2, u.getSurname());
//            stmt.setString(3, u.getEmail());
//            stmt.setInt(4, u.getId());
//            return stmt.execute();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
//
//    @Override
//    public boolean removeUser(int id) {
//        try (Connection c = connect()) {
//
//            Statement stmt = c.createStatement();
//            return stmt.execute("delete from user where id=" + id);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
//
//    @Override
//    public User getById(int userId) {
//        User result = null;
//
//        try (Connection c = connect()) {
//
//            Statement stmt = c.createStatement();
//            stmt.execute("select * from user where id=" + userId);
//            ResultSet rs = stmt.getResultSet();
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String surname = rs.getString("surname");
//                String email = rs.getString("email");
//
//                result = new User(id, name, surname, email);
//
//            }
//            System.out.println(c.getClass().getName());
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return result;
//    }
//
//    @Override
//    public boolean addUser(User u) {
//        try (Connection c = connect()) {
//
//            PreparedStatement stmt = c.prepareStatement("insert into user (name, surame, email) values (?,?,?,?");
//            stmt.setString(1, u.getName());
//            stmt.setString(2, u.getSurname());
//            stmt.setString(4, u.getEmail());
//            return stmt.execute();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            return false;
//        }
    }

}
