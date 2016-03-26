# AndroidChangeLanguageProblem

this sample shows that the new android support libraries disallowed changeing the language in runtime 

#Usage 

change the dependence in MyAppliction/app/build.gradle 

From (has the problem)
compile 'com.android.support:appcompat-v7:23.2.1'

To (doesn't has)
compile 'com.android.support:appcompat-v7:23.1.1'
 
and run :)
