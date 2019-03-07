package com.geektime.asm;

public class JavaCode {

    private long timeLocalIndex = System.currentTimeMillis();

    public void fun(){


        timeLocalIndex = System.currentTimeMillis() - timeLocalIndex;
        if (timeLocalIndex>10L){
            Log.e("HAHAH", "time="+timeLocalIndex);
        } else {
            Log.d("HAHAH","time="+timeLocalIndex);
        }

    }
}
