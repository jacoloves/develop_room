package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class Not_Applicatiom_Save
 *
 */
@WebListener
public class Not_Applicatiom_Save implements ServletContextAttributeListener {

    /**
     * Default constructor.
     */
    public Not_Applicatiom_Save() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent arg0)  {
         // TODO Auto-generated method stub
    	System.out.println("アプリケーションスコープの利用は禁止されています。");
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent arg0)  {
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent arg0)  {
         // TODO Auto-generated method stub
    }

}
