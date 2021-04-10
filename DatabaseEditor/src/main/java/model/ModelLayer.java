package model;

import utils.object.InsertObj;

import java.sql.Date;
import java.util.ArrayList;

public interface ModelLayer {
    String[] getTables();

    String[] getColumns(String curTable);

    void getData(String curTable, ArrayList dataList, int rowNumb);

    void createCustomer(String curTable, ArrayList<InsertObj> insertData);

    void update(String curTable, String column, String data, String update);

    void delete(String curTable, String column, String data);

    void clear(String curTable);
}
