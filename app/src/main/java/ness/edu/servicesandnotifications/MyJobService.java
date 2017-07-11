package ness.edu.servicesandnotifications;

import android.util.Log;

import com.firebase.jobdispatcher.JobParameters;

/**
 * Created by Android2017 on 7/11/2017.
 */

public class MyJobService extends com.firebase.jobdispatcher.JobService {
    private static final String TAG = "Ness";

    @Override
    public boolean onStartJob(JobParameters job) {
        //
        showNotification();
        return false; //is there ongoing progress?
    }

    private void showNotification() {
        Log.d(TAG, "showNotification: ");
    }

    @Override
    public boolean onStopJob(JobParameters job) {
        return false; // should this job be retired?
    }
}
