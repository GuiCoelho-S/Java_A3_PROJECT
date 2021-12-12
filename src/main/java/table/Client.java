
package table;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Client {
    private String CPF_C;
    private String PASSWORD_C;
    private String NAME_C;
    private String PHONE_C;
    private String CEP_C;
    private String NUM_C;
    
    // Methods
    
    public void addClient() throws SQLException{
        String sql = "INSERT INTO tb_client(CPF_C, PASSWORD_C, NAME_C, PHONE_C, CEP_C, NUM_C) VALUES (?, ?, ?, ?, ?, ?)"; 
        
        ConnectionFactory factory = new ConnectionFactory();
        
        try (Connection c = factory.obtemConexao()){
            
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, CPF_C);
            ps.setString(2, PASSWORD_C);
            ps.setString(3, NAME_C);
            ps.setString(4, PHONE_C);
            ps.setString(5, CEP_C);
            ps.setString(6, NUM_C);
            
            ps.execute();
       
        } 
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void removeClient() throws SQLException{
        String sql = "DELETE FROM tb_client WHERE CPF_C = ?";
        
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, CPF_C);
            //5: Executa o comando
            ps.execute();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void checkClient()throws SQLException{
    String sql = "SELECT * FROM tb_client WHERE CPF_C = ?";
        
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, CPF_C);
            //5: Executa o comando
            ps.execute();
            
            ResultSet rs = ps.executeQuery();
            if(rs.next() == true){
                    
                    setCPF_C(rs.getString("CPF_C"));
                    setNAME_C(rs.getString("NAME_C"));
                    setPHONE_C(rs.getString("PHONE_C"));
                    setCEP_C(rs.getString("CEP_C"));
                                                                             
            }else {
                JOptionPane.showMessageDialog(null, "Paciente não encontrado");
            } 
        }
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Paciente não encontrado");
        }
    }
    
    public void UpdateClient()throws SQLException{
        String sql = "UPDATE tb_client SET NAME_C = ?, PHONE_C = ?, CEP_C = ?, NUM_C = ? WHERE CPF_C = ? ";

        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obtemConexao()){

            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, NAME_C);
            ps.setString(2, PHONE_C);
            ps.setString(3, CEP_C);
            ps.setString(4, NUM_C);
            ps.setString(5, CPF_C);
            ps.execute();

        } 
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void UpdateClient2()throws SQLException{
        String sql = "UPDATE tb_client SET PASSWORD_C = ?, NAME_C = ?, PHONE_C = ?, CEP_C = ?, NUM_C = ? WHERE CPF_C = ?";

        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obtemConexao()){

            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, PASSWORD_C);
            ps.setString(2, NAME_C);
            ps.setString(3, PHONE_C);
            ps.setString(4, CEP_C);
            ps.setString(5, NUM_C);
            ps.setString(6, CPF_C);
            ps.execute();

        } 
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    // getters and setters

    public String getCPF_C() {
        return CPF_C;
    }

    public void setCPF_C(String CPF_C) {
        this.CPF_C = CPF_C;
    }

    public String getPASSWORD_C() {
        return PASSWORD_C;
    }

    public void setPASSWORD_C(String PASSWORD_C) {
        this.PASSWORD_C = PASSWORD_C;
    }

    public String getNAME_C() {
        return NAME_C;
    }

    public void setNAME_C(String NAME_C) {
        this.NAME_C = NAME_C;
    }

    public String getPHONE_C() {
        return PHONE_C;
    }

    public void setPHONE_C(String PHONE_C) {
        this.PHONE_C = PHONE_C;
    }

    public String getCEP_C() {
        return CEP_C;
    }

    public void setCEP_C(String CEP_C) {
        this.CEP_C = CEP_C;
    }

    public String getNUM_C() {
        return NUM_C;
    }

    public void setNUM_C(String NUM_C) {
        this.NUM_C = NUM_C;
    }

    
}
