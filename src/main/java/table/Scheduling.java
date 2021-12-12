package table;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Scheduling {


    private String CPF_SH;
    private String NAME_SH;
    private String DATE_SH;
    private String ID_SH;
    
    
    public  void addsh()throws SQLException{
        String sql = "INSERT INTO tb_scheduling(CPF_SH, DATE_SH, ID_SH, NAME_SH) VALUES (?, ?, ?, ?)"; 
        
               ConnectionFactory factory = new ConnectionFactory();
        
        try (Connection c = factory.obtemConexao()){
            
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, CPF_SH);
            ps.setString(2, DATE_SH);
            ps.setString(3, ID_SH);
            ps.setString(4, NAME_SH);
           
            ps.execute();
        } 
        catch (Exception e){
            e.printStackTrace();
        }
        
        
    }
    
    public String getCPF_SH() {
        return CPF_SH;
    }

    public void setCPF_SH(String CPF_SH) {
        this.CPF_SH = CPF_SH;
    }

    public String getNAME_SH() {
        return NAME_SH;
    }

    public void setNAME_SH(String NAME_SH) {
        this.NAME_SH = NAME_SH;
    }

    public String getDATE_SH() {
        return DATE_SH;
    }

    public void setDATE_SH(String DATE_SH) {
        this.DATE_SH = DATE_SH;
    }

    public String getID_SH() {
        return ID_SH;
    }

    public void setID_SH(String ID_SH) {
        this.ID_SH = ID_SH;
    }
    
}


    