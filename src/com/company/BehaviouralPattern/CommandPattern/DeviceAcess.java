package com.company.BehaviouralPattern.CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class DeviceAcess {
    private List<OperatingSystem> operatingSystems = new ArrayList<>();

    public void authenticationMethod(OperatingSystem operatingSystem) {
        operatingSystems.add(operatingSystem);
    }

    public void checkCredentials() {

        for (OperatingSystem os : operatingSystems) {
            os.authentication();
        }
        operatingSystems.clear();


    }
}