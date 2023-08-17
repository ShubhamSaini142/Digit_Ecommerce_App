package Ecommerce;

public class Items {
private String itemId; 
private String itemName;
private String cost;
private String description;

public String getItemId()
{
	return itemId;
}

public void setItemId(String itemId)
{
	this.itemId = itemId;
}

public String getItemName()
{
	return itemName;
}

public void setItemName(String itemName)
{
	this.itemName = itemName;
}

public String getCost()
{
	return cost;
}

public void setCost(String cost)
{
	this.cost = cost;
}

public String getDescription()
{
	return description;
}

public void setDescription(String description)
{
	this.description = description;
}
public Items(String itemId,String itemName,String cost,String description)
{
	this.itemId = itemId;
	this.itemName = itemName;
	this.cost = cost;
	this.description = description;
}
public Items()
{
	
}
}
