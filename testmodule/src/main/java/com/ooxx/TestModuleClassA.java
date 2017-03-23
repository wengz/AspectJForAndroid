package com.ooxx;

import com.ooxx.aspectjlib.DebugTrace;

public class TestModuleClassA {

    @DebugTrace
    public static String testFunction (){
        return "TestModuleClassA-->testFunction()";
    }
}
