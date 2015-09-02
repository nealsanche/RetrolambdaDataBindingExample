
package org.nsdev.retrolambdadatabindingexample.model;

import com.google.gson.annotations.Expose;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class RepresentativeAction {

    @Expose
    private String linkText;
    @Expose
    private String phoneNumber;

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
     * @return The phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber The phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
