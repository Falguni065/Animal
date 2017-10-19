
public class Main {
	
	
	public static <E> void dosomething(E obj)
	{
		try
		{	



			if(obj instanceof Animal)
			{
				System.out.println("it is an animal object");
			}
			else throw new Exception("not object");
			
			
		}
		
		
		catch(Exception e)
		{
			//System.out.println("there is no animal object");
		}
	}

	public static void main(String[] args) {
		
		Animal ani = new Animal();
		Oviporus ovi = new Oviporus();
		Mammal m = new Mammal();
	    Birds b = new Birds();
		Insects i = new Insects();
		Land l = new Land();
		Water w = new Water();
		
		dosomething(b);

	/*	System.out.println("HEloooo");
		
		Birds b = new Birds();
		Insects i = new Insects();
		Land l = new Land();
		Water w = new Water();
		
		
		b.bird();
		i.insect();
		l.land();
		w.water();*/
		
	}

}
