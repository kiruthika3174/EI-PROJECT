public class HomeTheaterFacade
{
    private Amplifier _amplifier;
    private Tuner _tuner;
    private DVDPlayer _dvdPlayer;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DVDPlayer dvdPlayer)
    {
        _amplifier = amplifier;
        _tuner = tuner;
        _dvdPlayer = dvdPlayer;
    }

    public void WatchMovie()
    {
        _amplifier.On();
        _tuner.On();
        _dvdPlayer.On();
        Console.WriteLine("Movie started");
    }

    public void EndMovie()
    {
        _amplifier.Off();
        _tuner.Off();
        _dvdPlayer.Off();
        Console.WriteLine("Movie ended");
    }
}