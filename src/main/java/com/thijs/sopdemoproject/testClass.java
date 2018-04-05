package com.thijs.sopdemoproject;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import org.stagemonitor.core.Stagemonitor;

@Startup
@Singleton
public class testClass {
    
    @PostConstruct
    public void init()
    {
        Stagemonitor.init();
    }

}
