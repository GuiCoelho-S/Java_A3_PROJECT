package table;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.EmployeeScreen;


public class Exam {

  
    private String CPF_E;
    private String DATE_E;
    private String ID_E;
    private String NAME_E;
    private String RESULT_E;
    
    public void addExam()throws SQLException{
         String sql = "INSERT INTO tb_exam(CPF_E, NAME_E, DATE_E, ID_E, RESULT_E) VALUES (?, ?, ?, ?, ?)";
         ConnectionFactory factory = new ConnectionFactory();
         
         try (Connection c = factory.obtemConexao()){
            
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, CPF_E);
            ps.setString(2, NAME_E);
            ps.setString(3, DATE_E);
            ps.setString(4, ID_E);
            ps.setString(5, RESULT_E);
            
            ps.execute();
       
        } 
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
      public String getCPF_E() {
        return CPF_E;
    }

    public void setCPF_E(String CPF_E) {
        this.CPF_E = CPF_E;
    }

    public String getDATE_E() {
        return DATE_E;
    }

    public void setDATE_E(String DATE_E) {
        this.DATE_E = DATE_E;
    }

    public String getID_E() {
        return ID_E;
    }

    public void setID_E(String ID_E) {
        this.ID_E = ID_E;
    }

    public String getNAME_E() {
        return NAME_E;
    }

    public void setNAME_E(String NAME_E) {
        this.NAME_E = NAME_E;
    }

    public String getRESULT_E() {
        return RESULT_E;
    }

    public void setRESULT_E(String RESULT_E) {
        this.RESULT_E = RESULT_E;
    }
    
}
