package data;

import java.sql.DriverManager;
import java.util.logging.Logger;

import java.sql.*;



public class DBManager {
	private Connection conn=null;
	private static Logger log=Logger.getLogger(DBManager.class.toString());;
	public DBManager(){
		// TODO Auto-generated constructor stub	
		try {  
            Class.forName("com.mysql.jdbc.Driver");// ����Mysql��������                
            conn = DriverManager.getConnection(  
            		"jdbc:mysql://121.48.175.11:3306/ietmcsdb","root","12345");// ������������             
            log.info("���ݿ����ӳɹ�");
        } catch (Exception e) {  
        	log.warning("���ݿ�����ʧ��");
        }  
		
	}
	
	public Connection getConn() {
		return conn;
	}
	
	public void closeConn() {
		try{
			 conn.close(); 
		}catch(Exception e){
			e.printStackTrace();
			log.warning("���ݿ�ر�ʧ��" );
		}
	}

}
