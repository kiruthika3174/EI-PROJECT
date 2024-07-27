public class InvoiceFactory : DocumentFactory
{
    public override Document CreateDocument()
    {
        return new Invoice();
    }
}
