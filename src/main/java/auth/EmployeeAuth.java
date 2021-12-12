package auth;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EmployeeAuth {
    private String CPF_CHECK;
    private String PASSWORD_CHECK;
    private boolean STATUS;
    
    public void authEmployee(){
    
        String sql = "select * from tb_employee where CPF_EM = ? and PASSWORD_EM = ? ";
        ConnectionFactory factory = new ConnectionFactory();
        
        try (Connection c = factory.obtemConexao()){
            
            PreparedStatement ps = c.prepareStatement(sql);
            
            ps.setString(1, getCPF_CHECK());
            ps.setString(2, getPASSWORD_CHECK());
            ps.execute();
            
            ResultSet rs = ps.executeQuery();
          
            if(rs.next() == true){                           
                setSTATUS(true);                
            }else {
                setSTATUS(false);
            }
                             
        } 
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro");
        }
         
    }

    public String getCPF_CHECK() {
        return CPF_CHECK;
    }

    public void setCPF_CHECK(String CPF_CHECK) {
        this.CPF_CHECK = CPF_CHECK;
    }

    public String getPASSWORD_CHECK() {
        return PASSWORD_CHECK;
    }

    public void setPASSWORD_CHECK(String PASSWORD_CHECK) {
        this.PASSWORD_CHECK = PASSWORD_CHECK;
    }

    public boolean isSTATUS() {
        return STATUS;
    }

    public void setSTATUS(boolean STATUS) {
        this.STATUS = STATUS;
    }
    
    
}
