
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
    public String getAutoMaxID(String table,String colID){
        try {
            Connection c = ConnectionDB.getConnection();
            String sql="Select * from "+table+"";
            ResultSet rs =c.createStatement().executeQuery(sql);
            if(rs.next()){
                String query = "Select 'P'+CONVERT(char(5),isnull(Max(Substring("+colID+",2,5)),0)+1) as MaxID from "+table+"";
                ResultSet rs1 = c.createStatement().executeQuery(query);
                if(rs1.next()){
                    return rs1.getString("MaxID");
                }
            }else{
                String query = "Select 'P'+CONVERT(char(5),isnull(Max(Substring("+colID+",2,5)),0)+1001) as MaxID from "+table+"";
                ResultSet rs1 = c.createStatement().executeQuery(query);
                if(rs1.next()){
                    return rs1.getString("MaxID");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
