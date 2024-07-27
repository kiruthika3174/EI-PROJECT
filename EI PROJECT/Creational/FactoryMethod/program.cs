class Program
{
    static void Main(string[] args)
    {
        DocumentFactory factory = new ReportFactory();
        Document document = factory.CreateDocument();
        document.Print();

        factory = new InvoiceFactory();
        document = factory.CreateDocument();
        document.Print();
    }
}