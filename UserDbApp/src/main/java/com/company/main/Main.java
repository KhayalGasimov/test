/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main;

import com.company.bean.User;
import com.company.dao.inter.UserDaoInter;


public class Main {

    public static void main(String[] args) throws Exception {
        UserDaoInter userDao = Context.instanceUserDao();
        User u = new User(0, "Khayal", "Gasimov", "xayal698@gmail.com");

        userDao.addUser(u);
    }
}
