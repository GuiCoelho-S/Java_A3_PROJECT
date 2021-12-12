package auth;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import table.Client;
import view.ClientLogin;


public class ClientAuth {
    private String CPF_CHECK;
    private String PASSWORD_CHECK;
    private boolean STATUS;
    
    public void authClient(){
    
        String sql = "select * from tb_client where CPF_C = ? and PASSWORD_C = ? ";
        ConnectionFactory factory = new ConnectionFactory();
        
        ClientLogin login = new ClientLogin();
        Client cl = new Client();
        try (Connection c = factory.obtemConexao()){
            
            PreparedStatement ps = c.prepareStatement(sql);
            
            ps.setString(1, getCPF_CHECK());
            ps.setString(2, getPASSWORD_CHECK());
            ps.execute();
            
            ResultSet rs = ps.executeQuery();
            
            
            if(rs.next() == true){                           

                    setSTATUS(true);  
                    cl.setNAME_C(rs.getString("NAME_C"));
                    
                    String aa = cl.setCPF_C(rs.getString("CPF_C"));
                    cl.setCEP_C(rs.getString("CEP_C"));
                    cl.setPHONE_C(rs.getString("PHONE_C"));
                     
                    
                    
                    //JOptionPane.showMessageDialog(null, c_screen.getCPF_C());
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
