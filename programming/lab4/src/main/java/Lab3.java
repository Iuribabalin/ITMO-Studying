//Решив на ночь умыться, Козлик подошел к рукомойнику, но и тут пришлось израсходовать сантик на воду, сантик на мыло и сантик на полотенце. Вслед за Козликом начал умываться Незнайка. Но едва он намылил лицо, как что-то щелкнуло и вода перестала течь. Незнайка вертел кран то в одну сторону, то в другую, стучал по нему кулаком, но это не помогало. Мыло невыносимо щипало ему глаза, а смыть было нечем. Тогда Незнайка стал звать на помощь Козлика. Видя неладное, Козлик подбежал к крану, но как раз в это время погас свет и комната снова погрузилась во мрак. Единственное, что можно было разглядеть в темноте, это настойчиво мигавший красный глазок на стене и поблескивавший под ним металлический язычок
import java.util.function.Consumer;
class Lab3 {
	public static void foo(Consumer<Integer> consumer) {

	}

	public static void main(String[] args){
		/*ThrowingConsumer a = x -> {
			if(x=="LUL") 
				throw new NamingException("throwed");
			else 
				System.out.println(x);
		};
		try{
			a.print("LUL");
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}*/

		foo(x -> {
			throw new NamingException("oops");
		});

		/*try{
			Room room = new Room("комната"){
				public void useThingSafely(IHuman client,Things thing)throws NamingException{
					try{
						this.useThing(client,thing);
					}
					catch(PermissionException ex){
						System.out.println("PermissionException catched: " + ex.getMessage());
						ex.printStackTrace();
					}
				}
			};
			room.addThing(new Sink("рукомойник"));
			room.addThing(new Soap("мыло"));
			room.addThing(new Towel("полотенце"));
			room.addThing(new Coiner("монетоприемник"));
			IHuman dunno = new Human("Незнайка");
			IHuman goat = new Human("Козлик");
			goat.decision("умыться на ночь");
			room.paymentThing(goat, Things.SOAP,1);
			room.paymentThing(goat, Things.SINK,1);
			room.paymentThing(goat, Things.TOWEL,1);
			room.useThing(goat,Things.SOAP);
			room.useThing(goat,Things.SINK);
			room.useThing(goat,Things.TOWEL);
			dunno.action("начал умываться");
			room.paymentThing(dunno, Things.SOAP,1);
			room.useThing(dunno,Things.SOAP);
			room.useThingSafely(dunno,Things.SINK);
			room.action("щелк");
			room.action("вода перестала течь");
			dunno.action("вертит кран в разные стороны");
			dunno.action("стучит по рукомойнику кулаком");
			dunno.action("чувствует боль от мыла в глазах");
			dunno.speak("Козлик, иди сюда, бачок потiк");
			goat.action("видит неладное");
			goat.action("подошел к крану");
			room.letLampsOff();
			room.letCoinerBlink();
			room.hashCode();
		}
		catch(NamingException ex){
			System.out.println("NamingException catched: " + ex.getMessage());
		}
		catch(PermissionException ex){
			System.out.println("PermissionException catched: " + ex.getMessage());
		}*/
	}
}