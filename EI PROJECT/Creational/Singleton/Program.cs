class Program
{
    static void Main(string[] args)
    {
        ConfigurationManager config1 = ConfigurationManager.Instance;
        Console.WriteLine(config1.Configuration);

        ConfigurationManager config2 = ConfigurationManager.Instance;
        Console.WriteLine(config2.Configuration);

        Console.WriteLine(ReferenceEquals(config1, config2));  // True
    }
}