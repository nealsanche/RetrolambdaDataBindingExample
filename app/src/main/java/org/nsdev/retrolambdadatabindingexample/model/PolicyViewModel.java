package org.nsdev.retrolambdadatabindingexample.model;

import android.content.Context;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by nealsanche on 15-08-21.
 */
public class PolicyViewModel {
    private final Context mContext;
    private final Policy mPolicy;

    public PolicyViewModel(Context context, Policy policy) {
        mContext = context;
        mPolicy = policy;
    }

    public long getPolicyid() {
        return mPolicy.getPolicyid();
    }

    public String getPolicyguid() {
        return mPolicy.getPolicyguid();
    }

    public String getPolicynumber() {
        return mPolicy.getPolicynumber();
    }

    public String getCreated() {
        return mPolicy.getCreated();
    }

    public String getStatus() {
        return mPolicy.getStatus();
    }

    public String getStartdate() {
        return mPolicy.getStartdate();
    }

    public long getDuration() {
        return mPolicy.getDuration();
    }

    public boolean isArchived() {
        return mPolicy.isArchived();
    }

    public String getRenewaldate() {

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
            Date date = dateFormat.parse(getStartdate());

            Calendar c = Calendar.getInstance();
            c.setTime(date);
            c.add(Calendar.MONTH, (int) getDuration());

            DateFormat outputFormat = android.text.format.DateFormat.getDateFormat(mContext);
            return outputFormat.format(c.getTime());

        } catch (ParseException ex) {
            return "Unknown";
        }
    }

    public String getPolicyHolder() {
        return "Joe Smith";
    }
}
