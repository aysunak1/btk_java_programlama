import java.sql.*;
public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet ;
        try {
            connection = helper.getConnection();
            String url = "Delete from city where id = ?";
            statement = connection.prepareStatement(url);
            statement.setInt(1,4080);
            System.out.println("Kayıt silindi.");
            int result = statement.executeUpdate();
        }catch (SQLException exception){
            helper.showErrorMessage(exception);

        }finally {
            statement.close();
            connection.close();
        }

    }
    public  static void selectDemo() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet ;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country ");
            while (resultSet.next()){
                System.out.println(resultSet.getString("Name"));
            }

        }catch (SQLException exception){
            helper.showErrorMessage(exception);

        }finally {
            connection.close();
        }
    }
    public static void insertData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet ;
        try {
            connection = helper.getConnection();
            statement = connection.prepareStatement("insert into city (Name,CountryCode,District,population) values ('Düzce' , 'TUR', 'Düzce' , 50000)");
            System.out.println("Kayıt eklendi.");
            int result = statement.executeUpdate();
        }catch (SQLException exception){
            helper.showErrorMessage(exception);

        }finally {
            statement.close();
            connection.close();
        }

    }
    public void updateData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet ;
        try {
            connection = helper.getConnection();
            String url = "update city set Population = 120000 where id = 4080";
            statement = connection.prepareStatement(url);
            System.out.println("Kayıt güncellendi.");
            int result = statement.executeUpdate();
        }catch (SQLException exception){
            helper.showErrorMessage(exception);

        }finally {
            statement.close();
            connection.close();
        }

    }
}
