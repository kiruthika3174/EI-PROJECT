public class ReportFactory : DocumentFactory
{
    public override Document CreateDocument()
    {
        return new Report();
    }
}