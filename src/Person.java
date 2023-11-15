
public abstract class Person
{
	private String name;
	private int score = 0;
	
	public Person(String name)
	{
		this.name = name;
		this.score = 0;
	}
	
	abstract int getScore();
	
	abstract String getName();
	
	public String toString()
	{
		return "Name:" + name + "Score:" + score;
	}
}
