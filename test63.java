interface PCI
{
void start();
void stop();
}
class NetworkCard implements PCI
{
public void start()
{
System.out.println("Send...");	
}
public  void stop()
{
	System.out.println("Network stop!");}

}
class SoundCard implements PCI
{
public void start()
{
System.out.println("Du du...");	
}
public void stop()
{
System.out.println("Sound stop!");	
}
}
class MinBoard
{
public void userPCICard(PCI P)
{
P.start();
P.stop();	
}
}
public class test63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainBoard mb=new MainBoard();
		NetworkCard nc=new NetworkCard();
		mb.userPCICard(nc);
		SoundCard sc=new SoundCard();
		mb.userPCICard(sc);
	}

}
