import java.util.ArrayList;
public class Human implements IHuman{
	private ArrayList<Human> clientsArr = new ArrayList<Human>();
	private String name;
	public void walk (APlace place){
		System.out.println(place.getPlace());
	}
	public String getName(){
		return name;
	}
	public void decision(String des){
		System.out.println(this.getName() + " твердо решает " + des);
	}
	public void action(String act){
		System.out.println(this.getName() + " " + act);
	}
	public void speak(String str){
		System.out.println(this.getName() + " говорит: " + str);
	}
	public void useThing(Thing thing){
    	System.out.println("Теперь у " + this.getName() + " " + thing.getStatusChange());
	}
	@Override
    public int hashCode() {
        return super.hashCode()+this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode()== this.hashCode() ? true : false;
    }

    @Override
    public String toString() {
    	return "существо по имени " + this.name;
    }
	Human(String name){
		this.name = name;
	}
}