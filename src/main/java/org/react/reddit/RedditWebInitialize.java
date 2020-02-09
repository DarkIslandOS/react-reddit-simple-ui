package org.react.reddit;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.ServletContext;

public class RedditWebInitialize implements WebApplicationInitializer {

    private final String BASE_PACKAGE_ROOT = "org.react.reddit";

    @Override
    public void onStartup(final ServletContext sc) {

        AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();

        root.scan(BASE_PACKAGE_ROOT);
        sc.getContext(sc.getServletContextName());
        int i = 0;
//
//        ServletRegistration.Dynamic appServlet = sc.addServlet("mvc", new DispatcherServlet(new GenericWebApplicationContext()));
//        appServlet.setLoadOnStartup(1);
//        appServlet.addMapping("/");
    }

}
