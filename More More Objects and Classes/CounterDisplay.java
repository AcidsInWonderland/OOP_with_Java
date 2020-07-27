// class counter display
public class CounterDisplay{ 
	private int value;
	private int limit; 
	public CounterDisplay(int pLimit)
	{
		value=0;
		limit = pLimit; 		
	}
	public void setValue(int pValue)
	{
      value = pValue;
	}
	public int getValue()
	{
		return value;
	}
	public void increment() 
	{
	value = value+1; 
	if (value>=limit)
		value = 0; 
	}
	public String getDisplayValue()
	{
		String counterStr;
		counterStr = "0" + getValue(); 
		return counterStr; 
	}
}
