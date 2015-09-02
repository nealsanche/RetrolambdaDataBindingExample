
package org.nsdev.retrolambdadatabindingexample.model;

import com.google.gson.annotations.Expose;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ManagePolicyAction {

    @Expose
    private String linkText;
    @Expose
    private String url;

    /**
     * @return The linkText
     */
    public String getLinkText() {
        return linkText;
    }

    /**
     * @param linkText The linkText
     */
    public void setLinkText(String linkText) {
        this.linkText = linkText;
    }

    /**
     * @return The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
