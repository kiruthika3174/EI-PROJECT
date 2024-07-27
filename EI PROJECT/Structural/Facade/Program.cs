class Program
{
    static void Main(string[] args)
    {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DVDPlayer dvdPlayer = new DVDPlayer();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvdPlayer);

        homeTheater.WatchMovie();
        homeTheater.EndMovie();
    }
}