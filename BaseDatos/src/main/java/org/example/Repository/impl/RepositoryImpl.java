package org.example.Repository.impl;


import com.sun.jdi.connect.spi.Connection;
import org.example.conexion.v2.ConexionBD;

import java.sql.SQLException;

public interface RepositoryImpl {
    private Connection getConnection() throws SQLException {
        return ConexionBD.getInstance();
    }

}
