package com.wbl.base;

import com.wbl.utils.Configuration;
import org.apache.log4j.Logger;

/**
 * Created by svelupula on 8/14/2015.
 */
public abstract class BaseTest {

    public static final Configuration _config;

    static {
        _config = new Configuration("web");
    }

    //Rally connection
    public Logger _logger;

    public BaseTest() {
        _logger = Logger.getLogger(BaseTest.class);

    }

}
