package org.jboss.pressgang.ccms.rest.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.entities.RESTVersionDetails;

public class RESTVersionDetailsCollection
{
    private List<RESTVersionDetails> versions = new ArrayList<RESTVersionDetails>();

    public List<RESTVersionDetails> getVersions() {
        return versions;
    }

    public void setVersions(final List<RESTVersionDetails> versions) {
        this.versions = versions;
    }
    
    public void addItem(final RESTVersionDetails version)
    {
        if (versions == null)
        {
            versions = new ArrayList<RESTVersionDetails>();
        }
        
        versions.add(version);
    }
}
