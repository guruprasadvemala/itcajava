package day2;

public class Std {
	String StdName;
	int Roll;
	String Branch;
	double Percentage;
	void display()
	{
		System.out.println("Name="+StdName);
		System.out.println("Roll="+Roll);
		System.out.println("Branch="+Branch);
		System.out.println("Percentage="+Percentage);
	}
	public static void main(String args[])
			{
				Std s1=new Std();
				s1.StdName="guru";
				s1.Roll=33;
				s1.Branch="CSD";
				s1.Percentage=78.5;
				Std s2=new Std();
				s2.StdName="ramana";
				s2.Roll=34;
				s2.Branch="CSD";
				s2.Percentage=88.5;
				Std s3=new Std();
				s3.StdName="Prasad";
				s3.Roll=31;
				s3.Branch="CSE";
				s3.Percentage=66.5;
				s1.display();
				s2.display();
				s3.display();
			}

}
