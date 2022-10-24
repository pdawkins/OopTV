public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    TV(){}

    void turnOn(){ on = true;}
    void turnOff(){on = false;}

    int getChannel(){return  channel;}
    void setChannel(int newChannel){
        if (newChannel < 1 || newChannel > 120)
            channel = 1;
        else
            channel = newChannel;
    }

    int getVolumeLevel(){return volumeLevel;}
    void setVolumeLevel(int newVol){
        if (newVol < 1 || newVol > 7)
            volumeLevel = 1;
        else
            volumeLevel = newVol;}

    void channelUp(){
        if (on && channel < 120)
            channel++;
    }

    void channelDown(){
        if(on && channel > 1)
            channel--;
    }

    void volumeUp(){
        if (volumeLevel < 7)
            volumeLevel++;
    }

    void volumeDown(){
        if (volumeLevel > 1)
            volumeLevel--;
    }

    void printInfo(){
        if(on) {
            System.out.println("Volume is "+ volumeLevel);
            System.out.println("Channel is "+ channel);
        }
        else
            System.out.printf("TV is Off ...");
    }
}
