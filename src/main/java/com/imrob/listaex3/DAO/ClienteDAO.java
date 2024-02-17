package com.imrob.listaex3.DAO;

import static com.imrob.listaex3.config.DatabaseConfig.getConnection;
import com.imrob.listaex3.entities.Cliente;

import java.sql.*;


public class ClienteDAO {
    public static void add(Cliente cliente) {
        String sql = "INSERT INTO cliente (nome, cpf, data_nascimento) VALUES (?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);){
            pstmt.setString(1, cliente.getNome());
            pstmt.setString(2, cliente.getCpf());
            pstmt.setString(3, cliente.getDataNascimento());

            pstmt.executeUpdate();
            System.out.println("Cliente cadastrado com sucesso!");
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void read(int id) {
        String sql = "SELECT * FROM cliente WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setLong(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String dataNascimento = rs.getString("data_nascimento");
                System.out.println("ID: " + id + ", Nome: " + nome + ", CPF: " + cpf + ", Data Nascimento: "
                        + dataNascimento);

            } else {
                System.out.println("Cliente não encontrado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

//    public static void findAll() {
//        String comandoSql = "SELECT * FROM cliente";
//        try (Connection conn = getConnection();
//             PreparedStatement pstmt = conn.prepareStatement(comandoSql);){
//            ResultSet rs = pstmt.executeQuery();
//
//            while (rs.next()) {
//                String identity = rs.getString("id");
//                String nome = rs.getString("nome");
//                String cpf = rs.getString("cpf");
//                int dataNascimento = rs.getInt("data_nascimento");
//                System.out.println("ID: " + identity + ", Nome: " + nome + ", CPF: " + cpf + ", Data Nascimento: "
//                        + dataNascimento);
//            }
//        }catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

}}
