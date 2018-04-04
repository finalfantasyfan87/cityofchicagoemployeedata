package org.fun.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by jenny on 12/8/17.
 */
public class WebXMLRepresentation extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        //technically the datasource, websecurity, etc goes here
        return new Class[]{WebConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        //web config goes here
        return new Class[]{};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
