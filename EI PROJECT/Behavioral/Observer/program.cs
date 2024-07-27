class Program
{
    static void Main(string[] args)
    {
        ConcreteObservable observable = new ConcreteObservable();

        ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2");

        observable.RegisterObserver(observer1);
        observable.RegisterObserver(observer2);

        observable.SendMessage("Hello, Observers!");
    }
}