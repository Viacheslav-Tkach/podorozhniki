import java.sql.*;

public class AlexDbSelector {
    public static void main(String args[]) {
        String url = "jdbc:postgresql://evbyminsd7238.minsk.epam.com:5432/pdrzh_for_testers";

        try {
            Connection con = DriverManager.getConnection(url,"postgres","123");
            Statement select = con.createStatement();
            ResultSet result = select.executeQuery
                    ("SELECT trip.id_trip, trip.id_person FROM public.trip WHERE id_person=2");

            System.out.println("Got results:");
            while(result.next()) { // process results one row at a time
                int key = result.getInt(1);
                int val = result.getInt(2);

                System.out.println("key = " + key);
                System.out.println("val = " + val);
            }
            select.close();
            con.close();
        }
        catch( Exception e ) {
            e.printStackTrace();
        }
    }
}