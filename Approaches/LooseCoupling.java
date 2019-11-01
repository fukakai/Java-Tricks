/**
* #########################################################
* #################### Loose Coupling #####################
* #########################################################
*/
class CustomerRepository{
    private readonly IDatabase database;

    public CustomerRepository(IDatabase database){
        this.database = database;
    }

    public void Add(string CustomerName){
        database.AddRow("Customer", CustomerName);
    }
}

interface IDatabase{
    void AddRow(string Table, string Value);
}

class Database implements IDatabase{
    public void AddRow(string Table, string Value){
		//Do something
	}
}