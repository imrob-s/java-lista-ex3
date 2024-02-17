package com.imrob.listaex3;

import com.imrob.listaex3.DAO.ClienteDAO;
import com.imrob.listaex3.entities.Cliente;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Robson", "1646429684", "04-01-1985");

        //ClienteDAO.add(cliente);
        ClienteDAO.read(1);
    }
}
