# Android Change Language Problem
see the stackoverflow question [here] (http://stackoverflow.com/questions/36281616/changing-languages-in-app-with-the-new-support-libraries) for more informaiton about the problem


this sample shows that the new android support libraries disallowed changing the language in runtime 

# Usage 

change the dependence in MyAppliction/app/build.gradle 

From (has the problem)
compile 'com.android.support:appcompat-v7:23.2.1'

To (doesn't has)
compile 'com.android.support:appcompat-v7:23.1.1'
 
and run :)


# Update (dummy solution)

i have restarted the hole app to fix the problem :( 
i know it's a dummy sol, but it's the only one i got now.

to see the solution i have add two builds variants :
1) solved
2) not solved 

in the not solved you'll find that i have restarted the hole app XD

 ```
        Intent mStartActivity = new Intent(context, MainActivity.class);
        int mPendingIntentId = 123456;
        PendingIntent mPendingIntent = PendingIntent.getActivity(context, mPendingIntentId, mStartActivity,
                PendingIntent.FLAG_CANCEL_CURRENT);
        AlarmManager mgr = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        mgr.set(AlarmManager.RTC, System.currentTimeMillis() + 1000, mPendingIntent);
        System.exit(0);
 ```
 
 
# Update 2
 
it seems i was updating the the ctx and then load a new context, i'm convinced that this's wasn't right, however why it was working ?_?
