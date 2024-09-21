interface WIFI {
    void onOffWifi(int i);

    String[] getWIFI();

    void connectWifi();
}

interface Camera {
    void takePhoto();

    void recordVideo();

    /**
     * Records a video in 4K quality.
     * This method is part of the Camera interface and provides a default
     * implementation
     * for recording videos in 4K resolution. Subclasses can override this method to
     * provide custom 4K video recording functionality.
     */
    default void record4K() {
        System.out.println("Recording in 4K....");
    }

}

class Phone {
    void Call(int num) {
        System.out.println("Calling to : " + num);
    }

    void reciveCall() {
        System.out.println("Connecting....");
    }
}

class SmartPhone extends Phone implements WIFI, Camera {

    private boolean wifiOn = false;

    @Override
    public void onOffWifi(int i) {
        if (i == 0) {
            System.out.println("Turning off WIFI....");
            wifiOn = false;
        } else {
            System.out.println("Turning on WIFI....");
            wifiOn = true;
        }
    }

    @Override
    public String[] getWIFI() {
        if (wifiOn) {
            // You can implement logic to retrieve available Wi-Fi networks here.
            String[] availableNetworks = { "Network1", "Network2", "Network3" };
            return availableNetworks;
        } else {
            System.out.println("Wi-Fi is turned off. Please turn it on to get available networks.");
            return new String[0]; // Return an empty array when Wi-Fi is off.
        }
    }

    @Override
    public void connectWifi() {
        if (wifiOn) {
            System.out.println("Connecting to Wi-Fi...");
            // Implement logic to connect to a Wi-Fi network here.
        } else {
            System.out.println("Cannot connect to Wi-Fi. Please turn on Wi-Fi first.");
        }
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo...");
        // Implement logic to take a photo using the smartphone's camera here.
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording a video...");
        // Implement logic to record a video using the smartphone's camera here.
    }

    @Override
    public void record4K(){
        System.out.println("Recording in 4K with 60fps...");
        // here we override the default method of camera interface 
    }
}

public class DefaultMethodInInterfaces {
    public static void main(String[] args) {
        SmartPhone smartphone = new SmartPhone();

        // Make a call
        smartphone.Call(123456789);

        // Turn on Wi-Fi
        smartphone.onOffWifi(0);

        // Get available Wi-Fi networks
        String[] availableNetworks = smartphone.getWIFI();
        for (String network : availableNetworks) {
            System.out.println("Available Network: " + network);
        }

        // Connect to Wi-Fi
        smartphone.connectWifi();

        // Take a photo
        smartphone.takePhoto();

        // Record a video
        smartphone.recordVideo();

        // Record a video in 4K
        smartphone.record4K();
    }
}
