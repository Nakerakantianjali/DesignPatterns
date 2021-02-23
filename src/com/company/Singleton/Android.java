package com.company.Singleton;

public class Android {
    private static Android Instance=new Android();

    public static Android getInstance() {
        return Instance;
    }
}
