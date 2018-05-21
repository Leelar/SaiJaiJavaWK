
package Controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class GetMaxID {
    int maxID;
    public int getMaxID(String table,String colID){
        try {
            Connection c = ConnectionDB.getConnection();
            String sql = "Select isNull(Max("+colID+"),0)+1 as MaxID from "+table+"";
            ResultSet rs = c.createStatement().executeQuery(sql);
            if(rs.next()){
                maxID=rs.getInt("MaxID");
            }
            rs.close();
            c.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return maxID;
    }
}
