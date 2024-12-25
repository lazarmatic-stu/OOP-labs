package org.example.lab13.task4;

interface OldDevice {
    void operateOldFunction();
}

class OldDeviceImpl implements OldDevice {
    public void operateOldFunction() {
        System.out.println("Operating old device functionality...");
    }
}

interface NewDevice {
    void operateNewFunction();
}

class NewDeviceImpl implements NewDevice {
    public void operateNewFunction() {
        System.out.println("Operating new device functionality...");
    }
}

class DeviceAdapter implements NewDevice {
    private OldDevice oldDevice;

    public DeviceAdapter(OldDevice oldDevice) {
        this.oldDevice = oldDevice;
    }

    public void operateNewFunction() {
        oldDevice.operateOldFunction();
    }
}

class Main{
    public static void main(String[] args){
        OldDevice oldDevice = new OldDeviceImpl();
        NewDevice adapter = new DeviceAdapter(oldDevice);
        adapter.operateNewFunction();
    }
}