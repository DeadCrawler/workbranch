package utils;

public class Const {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost/carrent";
    public static final String USER = "root";
    public static final String PASSWORD = "root";

    public static final String GET_TABLES = "SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_TYPE = 'BASE TABLE' AND TABLE_SCHEMA='carrent'";
    public static final String GET_COLUMN_NAMES = "SELECT `COLUMN_NAME`" +
            "FROM `INFORMATION_SCHEMA`.`COLUMNS`" +
            "WHERE `TABLE_SCHEMA` = 'carrent'" +
            "AND `TABLE_NAME`='%s'";
    public static final String GET_DATA = "SELECT * FROM ";
    public static final String GET_DATA_TYPE = "SELECT DATA_TYPE FROM INFORMATION_SCHEMA.COLUMNS \n" +
            "  WHERE table_name = '%s' AND COLUMN_NAME = '%s'";
    public static final String[] INSERT_DATA = {
            "INSERT %s %s VALUES(?)",
            "INSERT %s %s VALUES(?, ?)",
            "INSERT %s %s VALUES(?, ?, ?)",
            "INSERT %s %s VALUES(?, ?, ?, ?)",
            "INSERT %s %s VALUES(?, ?, ?, ?, ?)",
            "INSERT %s %s VALUES(?, ?, ?, ?, ?, ?)",
            "INSERT %s %s VALUES(?, ?, ?, ?, ?, ?, ?)"};  //up to seven rows to add
    public static final String UPDATE = "UPDATE %s\n" +
            "SET %s = ?\n" +
            "WHERE %s = '%s'";
    public static final String DELETE = "DELETE FROM %s WHERE %s = '%s'";

    public static final String CLEAR = "TRUNCATE TABLE %s";

    public static final String[][] DATE = {{"" ,"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "11", "12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"},
            {"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11","12"},
            {"", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010",
                    "2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021"}};
}
