/**
* #########################################################
* #################### Tight Coupling #####################
* #########################################################
*/
class CustomerRepository{
    private readonly Database database;

    public CustomerRepository(Database database){
        this.database = database;
    }

    public void Add(string CustomerName){
        database.AddRow("Customer", CustomerName);
    }
}

class Database{
    public void AddRow(string Table, string Value){
		//DO something
    }
}