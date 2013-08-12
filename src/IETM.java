import internationalization.ChineseOnlyResourceFactory;

import java.util.Hashtable;
import java.util.Properties;

import javax.swing.SwingUtilities;

import org.openswing.swing.mdi.client.DefaultToolBar;
import org.openswing.swing.util.client.ClientSettings;

import control.csdb.CSDBMainController;

/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class IETM {

	/**
	 * 
	 */
	public IETM() {
		// TODO Auto-generated constructor stub
		 Hashtable domains = new Hashtable();
		 Properties props = new Properties();
		 props.setProperty("Find Function", "����");
		 props.setProperty("Functions", "����");
		 props.setProperty("Project", "��Ŀ");
		 props.setProperty("proId", "��Ŀ���");
		 props.setProperty("proName", "��Ŀ����");
		 props.setProperty("userId", "�û����");
		 props.setProperty("userName", "�û�����");
		 
		 ClientSettings clientSettings = new ClientSettings(new ChineseOnlyResourceFactory("$",props,true),domains);
		 ClientSettings.SHOW_SCROLLBARS_IN_MDI=true;
		 //����ToolBarΪĬ��
		 ClientSettings.MDI_TOOLBAR=new DefaultToolBar();
		 CSDBMainController mainController=new CSDBMainController();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
		      public void run() {
		        new IETM();
		      }
		    });
	}

}
