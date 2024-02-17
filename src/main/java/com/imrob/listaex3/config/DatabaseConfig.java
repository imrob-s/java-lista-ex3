package com.imrob.listaex3.config;


import bancolib.SqlUtil;
import com.imrob.listaex3.entities.Cliente;
import io.github.cdimascio.dotenv.Dotenv;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConfig {

    private static Dotenv env = Dotenv.load();
    private static final String HOST = env.get("DB_HOST");
    private static final String PORTA = env.get("DB_PORT");
    private static final String BANCO = env.get("DB_DATABASE");
    private static final String USUARIO = env.get("DB_USER");
    private static final String SENHA = env.get("DB_PASSWORD");
    private static final SqlUtil db = new SqlUtil(HOST, PORTA, BANCO, USUARIO, SENHA);

    public static Connection getConnection() throws SQLException {
        return db.getConn();
    }


}
