
package org.nsdev.retrolambdadatabindingexample.model;

import com.google.gson.annotations.Expose;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Policy {

    @Expose
    private long policyid;
    @Expose
    private String policyguid;
    @Expose
    private String policynumber;
    @Expose
    private String created;
    @Expose
    private String status;
    @Expose
    private String startdate;
    @Expose
    private long duration;
    @Expose
    private boolean archived;

    /**
     * @return The policyid
     */
    public long getPolicyid() {
        return policyid;
    }

    /**
     * @param policyid The policyid
     */
    public void setPolicyid(long policyid) {
        this.policyid = policyid;
    }

    /**
     * @return The policyguid
     */
    public String getPolicyguid() {
        return policyguid;
    }

    /**
     * @param policyguid The policyguid
     */
    public void setPolicyguid(String policyguid) {
        this.policyguid = policyguid;
    }

    /**
     * @return The policynumber
     */
    public String getPolicynumber() {
        return policynumber;
    }

    /**
     * @param policynumber The policynumber
     */
    public void setPolicynumber(String policynumber) {
        this.policynumber = policynumber;
    }

    /**
     * @return The created
     */
    public String getCreated() {
        return created;
    }

    /**
     * @param created The created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * @return The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return The startdate
     */
    public String getStartdate() {
        return startdate;
    }

    /**
     * @param startdate The startdate
     */
    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    /**
     * @return The duration
     */
    public long getDuration() {
        return duration;
    }

    /**
     * @param duration The duration
     */
    public void setDuration(long duration) {
        this.duration = duration;
    }

    /**
     * @return The archived
     */
    public boolean isArchived() {
        return archived;
    }

    /**
     * @param archived The archived
     */
    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
