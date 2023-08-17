package Ecommerce;

public class Cart {
private Items [] ItemsList;

public Items[] getItemsList()
{
	return ItemsList;
}

public void setItemsList(Items[] ItemsList )
{
	this.ItemsList= ItemsList;
}


public Cart(Items[] ItemsList) {
	this.ItemsList = ItemsList;
}

public Cart()
{
	
}
}
