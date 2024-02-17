package com.imrob.listaex3;

import bancolib.SqlUtil;
import com.imrob.listaex3.DAO.ClienteDAO;
import com.imrob.listaex3.config.DatabaseConfig;
import com.imrob.listaex3.entities.Cliente;

import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        Cliente cliente = new Cliente("Robson", "1646429684", "04-01-1985");

        //ClienteDAO.add(cliente);
        ClienteDAO.read(1);
    }
}
