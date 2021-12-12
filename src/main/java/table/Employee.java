package table;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Employee {
    
    private String CPF_EM;
    private String PASSWORD_EM;
    private String NAME_EM;
    
    
    public void addEmployee() throws SQLException{
        String sql = "INSERT INTO tb_employee(CPF_EM, PASSWORD_EM, NAME_EM) VALUES (?, ?, ?)"; 
        
        ConnectionFactory factory = new ConnectionFactory();
        
        try (Connection c = factory.obtemConexao()){
            
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, CPF_EM);
            ps.setString(2, PASSWORD_EM);
            ps.setString(3, NAME_EM);
            ps.execute();
        } 
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getCPF_EM() {
        return CPF_EM;
    }

    public void setCPF_EM(String CPF_EM) {
        this.CPF_EM = CPF_EM;
    }

    public String getPASSWORD_EM() {
        return PASSWORD_EM;
    }

    public void setPASSWORD_EM(String PASSWORD_EM) {
        this.PASSWORD_EM = PASSWORD_EM;
    }

    public String getNAME_EM() {
        return NAME_EM;
    }

    public void setNAME_EM(String NAME_EM) {
        this.NAME_EM = NAME_EM;
    }
    
}
