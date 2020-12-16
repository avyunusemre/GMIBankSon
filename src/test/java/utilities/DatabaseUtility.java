package utilities;

import java.sql.*;
import java.util.*;
import java.util.stream.Collectors;

public class DatabaseUtility {
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;
    private static ResultSetMetaData rsmd;

    /*  Creates connection before query execution .
     * gets parameter already up in the fields inm this class
     */
    public static Connection createConnection() {
        String url = "jdbc:postgresql://157.230.48.97:5432/gmibank_db";
        String user = "techprodb_user";
        String password = "Techpro_@126";
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    /*
     * executes a query and outputs a Resultset
     */
    public static ResultSet executeQuery(String query){
        createConnection();
        try {
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(query);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("\""+query+"\" query did not successfully execute!");

        }
        return resultSet;
    }

    /*
     * brings the column names of a query Resultset
     */
    public static List<String> getColumnNames(ResultSet resultSet) throws SQLException {
        ResultSetMetaData rsdm=resultSet.getMetaData();
        List<String> listOfColumnNames=new LinkedList<>();
        for (int i=1;i<=rsdm.getColumnCount();i++){
            listOfColumnNames.add(rsdm.getColumnName(i));
        }
        return listOfColumnNames;
    }

    public static List<Map<String,String>> getResultSetAsAListOfMaps(ResultSet resultSet) throws SQLException {
        ResultSetMetaData rsdm = resultSet.getMetaData();
        int sizeOfColumns = rsdm.getColumnCount();
        int sizeOfRows = resultSet.getFetchSize();
        List<String> nameOfColumns = DatabaseUtility.getColumnNames(resultSet);

        resultSet.beforeFirst();
        List<Map<String, String>> listOfResultset = new ArrayList<>();

        while (resultSet.next()) {
            Map<String, String> mapOfEachRow = new HashMap<>();
            for (int j = 0; j < sizeOfColumns; j++) {
                mapOfEachRow.put(nameOfColumns.get(j), resultSet.getString(nameOfColumns.get(j)));
            }

            listOfResultset.add(mapOfEachRow);
        }
        return listOfResultset;
    }

    public static List<Map<String,String>> getQueryAsAListOfMaps(String query) throws SQLException {
        resultSet=executeQuery(query);
        ResultSetMetaData rsdm=resultSet.getMetaData();
        int sizeOfColumns=rsdm.getColumnCount();
        int sizeOfRows=resultSet.getFetchSize();
        List<String> nameOfColumns= DatabaseUtility.getColumnNames(resultSet);

        resultSet.beforeFirst();
        List<Map<String,String>> listOfResultset=new ArrayList<>();

        while (resultSet.next()){
            Map<String,String> mapOfEachRow=new HashMap<>();
            for (int j=0;j<sizeOfColumns;j++)
            {
                mapOfEachRow.put(nameOfColumns.get(j),resultSet.getString(nameOfColumns.get(j)));
            }

            listOfResultset.add(mapOfEachRow);
        }
        return listOfResultset;
    }

    public static List<Map<String,String>> getEmployeesAsListOfMap() throws SQLException {
        String query="SELECT * FROM public.tp_employee;";
        return getQueryAsAListOfMaps(query);
    }

    public static Map<String,String> getEmployeeByLoginName(String loginName) throws SQLException {
        String query="SELECT * FROM public.tp_employee WHERE ;";
        return getQueryAsAListOfMaps(query).get(0);
    }
    //-----------------------------------------------------------------------------------
    public static List<Map<String,String>> getUsersAsListOfMap() throws SQLException {
        String query="SELECT * FROM public.jhi_user;";
        return getQueryAsAListOfMaps(query);
    }
    public static Map<String,String> getUserByLoginName(String loginName) throws SQLException {
        String query="SELECT * FROM public.jhi_user WHERE ;";
        return getQueryAsAListOfMaps(query).get(0);
    }

    //-----------------------------------------------------------------------------------


}
