package org.jboss.pressgang.ccms.rest.entities;

public class RESTVersionDetails
{
    public static final String DEV_STATE = "development";
    public static final String STABLE_STATE = "stable";
    public static final String DEPRECATED_STATE = "deprecated";
    
    private String version = null;
    private String state = null;
    private String path = null;
    private String build = null;
    
    public String getVersion() {
        return version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
