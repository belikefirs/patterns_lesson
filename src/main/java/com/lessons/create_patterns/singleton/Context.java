package com.lessons.create_patterns.singleton;

public class Context {

    private static Context context;


    private Context() {
    }

    public static synchronized Context getInstance() {
        if (context == null) {
            context = new Context();
        }
        return context;
    }
}
