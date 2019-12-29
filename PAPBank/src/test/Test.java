/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.BankDAO;
import dao.BankDAOImpl;

/**
 *
 * @author Anirudh
 */
public class Test {
    public static void main(String[] args) {
        BankDAO dao = new BankDAOImpl();
        dao.createAccount("Mahesh", "Male", "Actor", "1971-08-21", "", "", "", "Krishna", "Nirmala", "", "", "");
    }
}
