public class ConcreteObservable : IObservable
{
    private List<IObserver> _observers = new List<IObserver>();
    private string _message;

    public void RegisterObserver(IObserver observer)
    {
        _observers.Add(observer);
    }

    public void RemoveObserver(IObserver observer)
    {
        _observers.Remove(observer);
    }

    public void NotifyObservers()
    {
        foreach (var observer in _observers)
        {
            observer.Update(_message);
        }
    }

    public void SendMessage(string message)
    {
        _message = message;
        NotifyObservers();
    }
}