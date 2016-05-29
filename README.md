# Loading-Gear
In this library I simply used an AnimationSet for an View to impliment loading gear animation.

[ ![Download](https://api.bintray.com/packages/thanvandh/maven/GearLoad/images/download.svg) ](https://bintray.com/thanvandh/maven/GearLoad/)

```
repositories {
    maven {
        url  "http://dl.bintray.com/thanvandh/maven" 
    }
}
dependencies {
    compile 'info.androidramp:loading-gear:1.0.4'
}
```
In XML file
```
<FrameLayout 
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    //place your contents here
    
    <info.androidramp.gearload.Loading
        android:id="@+id/loading"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
</FrameLayout>
```
In Activity
```
Loading loading = (Loading) findViewById(R.id.loading);
//to sart
loading.Start();
//to cancel
loading.Cancel();
```
The view is visible only if method Start() is called.

![Loadin Animation 2 - Future Image](https://1.bp.blogspot.com/-5IQzDSb1xN0/V0p1_8S9bjI/AAAAAAAAK44/LBLYwEv2k9I_q6foxodqkZVDk733vwJqACLcB/s1600/GIFnearestPSnn.gif)
