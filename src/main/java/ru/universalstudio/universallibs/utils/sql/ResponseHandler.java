package ru.universalstudio.universallibs.utils.sql;

import java.sql.*;

@FunctionalInterface
public interface ResponseHandler <V, R> {

    R handleResponse(V value) throws SQLException;
}
