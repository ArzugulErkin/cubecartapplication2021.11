package test.databasetest;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class DataAccess {

    //Write a method to get a product information
    public boolean getProductName(String productName, Connection connection){
        boolean isProductExist=false;
        Statement statement=null;//define a statement object to execute sql script
        ResultSet resultSet=null;
        CachedRowSet cachedRowSet=null;

        try {
            cachedRowSet= RowSetProvider.newFactory().createCachedRowSet();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            statement=connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String productSqlScript=String.format("Select product_id,name,price from cc_CubeCart_inventory where name='%s'",productName);
        try {
            resultSet=statement.executeQuery(productSqlScript);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //veriy the result set
        if(resultSet==null){
            System.out.println("No records Found");
            return isProductExist;
        }
        else {
            try {
                cachedRowSet.populate(resultSet);//we store the result in the cached row set
            } catch (SQLException e) {
                e.printStackTrace();
            }
            int count=0;
            while(true){
                try {
                    if(!cachedRowSet.next()){
                        break;
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    int product_id = cachedRowSet.getInt("product_id");
                    String name = cachedRowSet.getString("name");
                    double price = cachedRowSet.getDouble("price");
                    System.out.println(String.format("product_id=%d name=%s price=%.2f", product_id, name, price));
                    count = cachedRowSet.getRow();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(count>=1)
                isProductExist=true;
            return isProductExist;
        }
    }
    public boolean getCustomer(String customerEmail, Connection connection){
        boolean isCustomerExist=false;
        Statement statement=null;//define a statement object to execute sql script
        ResultSet resultSet=null;
        CachedRowSet cachedRowSet=null;

        try {
            cachedRowSet= RowSetProvider.newFactory().createCachedRowSet();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            statement=connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String productSqlScript=String.format("Select customer_id,email from cc_CubeCart_customer where email='%s'",customerEmail);
        try {
            resultSet=statement.executeQuery(productSqlScript);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //veriy the result set
        if(resultSet==null){
            System.out.println("No records Found");
            return isCustomerExist;
        }
        else {
            try {
                cachedRowSet.populate(resultSet);//we store the result in the cached row set
            } catch (SQLException e) {
                e.printStackTrace();
            }
            int count=0;
            while(true){
                try {
                    if(!cachedRowSet.next()){
                        break;
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    int customer_id = cachedRowSet.getInt("customer_id");
                    String email = cachedRowSet.getString("email");
                    System.out.println(String.format("customer_id=%d email=%s", customer_id, email));
                    count = cachedRowSet.getRow();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(count>=1)
                isCustomerExist=true;
            return isCustomerExist;
        }
    }

    public boolean insertNewCategory(CategoryObject categoryObject,Connection connection){
        String insertCategoryScript="Insert into cc_CubeCart_category(cat_name,cat_desc,cat_parent_id,cat_image,per_int_ship,hide,seo_meta_title,seo_meta_description," +
                "seo_meta_keywords,priority,status)"+"values(?,?,?,?,?,?,?,?,?,?,?)";
        //Prepared statement

        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=connection.prepareStatement(insertCategoryScript);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try{
            preparedStatement.setString(1,categoryObject.getCat_name());
            preparedStatement.setString(2,categoryObject.getCat_desc());
            preparedStatement.setInt(3,categoryObject.getCatParentId());
            preparedStatement.setInt(4,categoryObject.getCat_image());
            preparedStatement.setDouble(5,categoryObject.getPerIntShip());
            preparedStatement.setInt(6,categoryObject.getHide());
            preparedStatement.setString(7,categoryObject.getSeoMetatitle());
            preparedStatement.setString(8,categoryObject.getSeoMetaDescription());
            preparedStatement.setString(9,categoryObject.getSeoMetaKeywords());
            preparedStatement.setInt(10,categoryObject.getPriority());
            preparedStatement.setInt(11,categoryObject.getStatus());
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        int affetedRows=0;
        try {
            affetedRows=preparedStatement.executeUpdate();//insert delete update
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("%d rows affected",affetedRows));
        if(affetedRows>=0)
            return true;
        else
            return false;

    }
}
