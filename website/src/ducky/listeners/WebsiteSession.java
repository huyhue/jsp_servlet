package ducky.listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class WebsiteSession implements HttpSessionListener{
	
	private static int numberofSession = 0;
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		se.getSession().getServletContext().log("A new session was created " + ++numberofSession);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		se.getSession().getServletContext().log("A session was desployed " + --numberofSession);
	}

}
