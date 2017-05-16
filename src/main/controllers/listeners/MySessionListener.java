package main.controllers.listeners;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by Di on 20.04.2017.
 */
public class MySessionListener implements HttpSessionListener
{

    private static final Logger logger = Logger.getLogger(MySessionListener.class);


    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        logger.debug("Session id:" + httpSessionEvent.getSession().getId());
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {

    }
}
