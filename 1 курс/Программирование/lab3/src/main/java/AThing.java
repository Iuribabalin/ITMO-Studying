import java.util.ArrayList;
abstract class AThing{
	private String name;
	private ArrayList<Human> clientsArr = new ArrayList<Human>();
	private Things type;
	private String statusChange;
	public void setType(Things type){
		this.type = type;
	}
	public Things getType(){
		return this.type;
	}
	public String getName(){
		return name;
	}
	public String getStatusChange(){
		return this.statusChange;
	}
	public void addClient(Human client){
		clientsArr.add(client);
	}
	public void rmClient(Human client){
		clientsArr.remove(client);
	}
	public boolean checkClient(Human client){
		return clientsArr.contains(client);
	}
	private boolean status = false;
	public boolean getStatus(){
		return this.status;
	}
	private void setStatus(boolean status){
		this.status = status;
	}
	public void setStatusChange(String status){
		this.statusChange = status;
	}
	private void turnOn(Human client){
		if (this.checkClient(client))
			this.setStatus(true);
	}
	private void turnOff(Human client){
		if (this.checkClient(client))
			this.setStatus(false);
	}
	public void turn(Human client){
		if (this.getStatus())
		{
			this.turnOff(client);
			System.out.println(client.getName() + " выключает " + this.getName());
		}
		else
		{
			this.turnOn(client);
			System.out.println(client.getName() + " включает " + this.getName());
		}
	}
	AThing(String name){
		this.name = name;
	}
}