package de.oglimmer.sample.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import de.oglimmer.utils.VersionFromManifest;

@WebListener
public class ServletContextListenerImpl implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		VersionFromManifest vfm = new VersionFromManifest();
		vfm.initFromFile(sce.getServletContext().getRealPath("/META-INF/MANIFEST.MF"));
		sce.getServletContext().setAttribute("contextLongVersion", vfm.getLongVersion());
	}

	public void contextDestroyed(ServletContextEvent sce) {
	}

}
