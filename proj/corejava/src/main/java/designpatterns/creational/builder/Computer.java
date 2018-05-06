package designpatterns.creational.builder;

public class Computer
{
    //Mandatory params
    private String bitType;
    private String brand;
    private int screenSizeInInches;
    private int ramCapacityInGB;
    private int hardDiskCapacityInGB;
    
    //Optional params
    private String mouse;
    private String diskReader;
    private String wifiConnectivity;
    private String lanConnectivity;
    private String keyboard;
    private String webCam;
    private String bluetooth;
    private String mousePad;
    
    
    
    //Getter and Setter methods + toString() method
    public String getBitType()
    {
        return bitType;
    }
    public void setBitType(String bitType)
    {
        this.bitType = bitType;
    }
    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public int getScreenSizeInInches()
    {
        return screenSizeInInches;
    }
    public void setScreenSizeInInches(int screenSizeInInches)
    {
        this.screenSizeInInches = screenSizeInInches;
    }
    public int getRamCapacityInGB()
    {
        return ramCapacityInGB;
    }
    public void setRamCapacityInGB(int ramCapacityInGB)
    {
        this.ramCapacityInGB = ramCapacityInGB;
    }
    public int getHardDiskCapacityInGB()
    {
        return hardDiskCapacityInGB;
    }
    public void setHardDiskCapacityInGB(int hardDiskCapacityInGB)
    {
        this.hardDiskCapacityInGB = hardDiskCapacityInGB;
    }
    public String getMouse()
    {
        return mouse;
    }
    public void setMouse(String mouse)
    {
        this.mouse = mouse;
    }
    public String getDiskReader()
    {
        return diskReader;
    }
    public void setDiskReader(String diskReader)
    {
        this.diskReader = diskReader;
    }
    public String getWifiConnectivity()
    {
        return wifiConnectivity;
    }
    public void setWifiConnectivity(String wifiConnectivity)
    {
        this.wifiConnectivity = wifiConnectivity;
    }
    public String getLanConnectivity()
    {
        return lanConnectivity;
    }
    public void setLanConnectivity(String lanConnectivity)
    {
        this.lanConnectivity = lanConnectivity;
    }
    public String getKeyboard()
    {
        return keyboard;
    }
    public void setKeyboard(String keyboard)
    {
        this.keyboard = keyboard;
    }
    public String getWebCam()
    {
        return webCam;
    }
    public void setWebCam(String webCam)
    {
        this.webCam = webCam;
    }
    public String getBluetooth()
    {
        return bluetooth;
    }
    public void setBluetooth(String bluetooth)
    {
        this.bluetooth = bluetooth;
    }
    public String getMousePad()
    {
        return mousePad;
    }
    public void setMousePad(String mousePad)
    {
        this.mousePad = mousePad;
    }
    @Override
    public String toString()
    {
        return "Computer [bitType=" + bitType + ", brand=" + brand + ", screenSizeInInches=" + screenSizeInInches + ", ramCapacityInGB=" + ramCapacityInGB + ", hardDiskCapacityInGB=" + hardDiskCapacityInGB + ", mouse=" + mouse + ", diskReader=" + diskReader
                + ", wifiConnectivity=" + wifiConnectivity + ", lanConnectivity=" + lanConnectivity + ", keyboard=" + keyboard + ", webCam=" + webCam + ", bluetooth=" + bluetooth + ", mousePad=" + mousePad + "]";
    }
    
    
    
}
