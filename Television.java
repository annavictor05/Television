/**
 * The purpose of this class is to model a television
 * [Your Name]
 * [Today's Date]
 */

public class Television {
    
    // Constant fields
    private final String MANUFACTURER;
    private final int SCREEN_SIZE;
    
    // Fields
    private boolean powerOn;
    private int channel;
    private int volume;
    
    /**
     * Constructs a Television object with a given manufacturer's brand and screen size.
     * Initializes the powerOn field to false (power is off), the volume to 20, and the channel to 2.
     * @param brand the manufacturer's brand
     * @param size the screen size
     */
    public Television(String brand, int size) {
        MANUFACTURER = brand;
        SCREEN_SIZE = size;
        powerOn = false;
        volume = 20;
        channel = 2;
    }
    
    /**
     * Returns the current volume of the television.
     * @return the current volume
     */
    public int getVolume() {
        return volume;
    }
    
    /**
     * Returns the current channel of the television.
     * @return the current channel
     */
    public int getChannel() {
        return channel;
    }
    
    /**
     * Returns the manufacturer's brand of the television.
     * @return the manufacturer's brand
     */
    public String getManufacturer() {
        return MANUFACTURER;
    }
    
    /**
     * Returns the screen size of the television.
     * @return the screen size
     */
    public int getScreenSize() {
        return SCREEN_SIZE;
    }
    
    /**
     * Changes the channel of the television to a given value.
     * @param channelNum the new channel number
     */
    public void setChannel(int channelNum) {
        channel = channelNum;
    }
    
    /**
     * Changes the power state of the television.
     */
    public void power() {
        powerOn = !powerOn;
    }
    
    /**
     * Increases the volume of the television by 1.
     */
    public void increaseVolume() {
        volume++;
    }
    
    /**
     * Decreases the volume of the television by 1.
     */
    public void decreaseVolume() {
        volume--;
    }

}
