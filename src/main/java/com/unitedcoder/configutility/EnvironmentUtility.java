package com.unitedcoder.configutility;

public class EnvironmentUtility {
    public String getConfigFileByEnvironment(Environment environment)
    {
        String configFile=null;
        switch (environment)
        {
            case QA:
                configFile="config-qa.properties";
                break;
            case PROD:
                configFile="config-prod.properties";
                break;
            default:
                configFile="config-qa.properties";
                break;
        }
        return configFile;
    }
}
