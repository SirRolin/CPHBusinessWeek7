package TV;

public class TV {
    private boolean _state = false;
    private int _channel;
    private final int _maxChannel;
    private int _volume;

    public TV(int maxChannel, int channel, int volume) {
        this._maxChannel = maxChannel;
        this._channel = channel;
        this._volume = volume;
    }

    public TV(int maxChannel) {
        this(maxChannel, 0, 50);
    }

    public TV() {
        this(35);
    }

    public void ToggleOnOff() {
        _state = !_state;
        System.out.println("TV.TV Turned " + (_state?"on":"off"));
    }

    public boolean isOn() {
        return _state;
    }

    public void turnOn() {
        if (!isOn()) ToggleOnOff();
    }

    public boolean setChannel(int channel) {
        if (isOn()) {
            if (channel >= 0) {
                _channel = channel % (_maxChannel+1);
            } else {
                _channel = _maxChannel - (-channel) % (_maxChannel+1);
            }
            System.out.println("Changed channel to: " + _channel);
            return true;
        }
        return false;
    }

    public void channelUp() {
        setChannel(_channel+1);
    }

    public void channelDown() {
        setChannel(_channel-1);
    }

    public boolean setVolume(int volume) {
        if (isOn()) {
            _volume = Math.min(Math.max(volume, 0), 100);
            System.out.println("Changed volume to: " + _volume);
            return true;
        }
        return false;
    }

    public void volumeUp() {
        setVolume(_volume+2);
    }

    public void volumeDown() {
        setVolume(_volume-2);
    }
}
