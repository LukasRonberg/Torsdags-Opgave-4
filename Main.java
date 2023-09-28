public class Main{
public static void main(String[] args) {
	Team tigers = new Team("Tigers");
	Team elephants = new Team("Elephants");
	Team monkeys = new Team("Monkeys");
	Team lions = new Team("Lions");
	Team buffalos = new Team("Buffalos");
	Team hawks = new Team("Hawks");

	tigers.setRank(1);
	elephants.setRank(2);
	monkeys.setRank(3);
	lions.setRank(5);
	buffalos.setRank(4);
	hawks.setRank(6);

	System.out.println(tigers);
	System.out.println(elephants);
	System.out.println(monkeys);
	System.out.println(lions);
	System.out.println(buffalos);
	System.out.println(hawks);
}
}