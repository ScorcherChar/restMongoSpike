package com.ingeus.restMongoSpike;

import org.apache.commons.io.IOUtils;


import java.io.IOException;
import java.io.InputStream;

public class HelperMethods {
    public static String loadFromClassPath(String filename) throws IOException {
        ClassLoader classLoader = new HelperMethods().getClass().getClassLoader();
        InputStream file = classLoader.getResourceAsStream(filename);
        String data = IOUtils.toString(file);
        IOUtils.closeQuietly(file);
        return data;
    }
}
