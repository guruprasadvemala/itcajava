package day2;

public class Student {
	String StdName;
	int Roll;
	String Branch;
	double Percentage;
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.StdName="guru";
		s1.Roll=33;
		s1.Branch="CSD";
		s1.Percentage=78.5;
		System.out.println("Studenet Name="+s1.StdName);
		System.out.println("Studenet Roll number="+s1.Roll);
		System.out.println("Studenet  Branch="+s1.Branch);
		System.out.println("Studenet Percentage="+s1.Percentage);
		Student s2=new Student();
		s2.StdName="ramana";
		s2.Roll=34;
		s2.Branch="CSD";
		s2.Percentage=88.5;
		System.out.println("Studenet Name="+s2.StdName);
		System.out.println("Studenet Roll number="+s2.Roll);
		System.out.println("Studenet  Branch="+s2.Branch);
		System.out.println("Studenet Percentage="+s2.Percentage);
		Student s3=new Student();
		s3.StdName="Prasad";
		s3.Roll=31;
		s3.Branch="CSE";
		s3.Percentage=66.5;
		System.out.println("Studenet Name="+s3.StdName);
		System.out.println("Studenet Roll number="+s3.Roll);
		System.out.println("Studenet  Branch="+s3.Branch);
		System.out.println("Studenet Percentage="+s3.Percentage);
		Student s4=new Student();
		s4.StdName="Pavan";
		s4.Roll=2;
		s4.Branch="ECE";
		s4.Percentage=66.5;
		System.out.println("Studenet Name="+s4.StdName);
		System.out.println("Studenet Roll number="+s4.Roll);
		System.out.println("Studenet  Branch="+s4.Branch);
		System.out.println("Studenet Percentage="+s4.Percentage);
		Student s5=new Student();
		s5.StdName="venkat";
		s5.Roll=23;
		s5.Branch="CSM";
		s5.Percentage=88.5;
		System.out.println("Studenet Name="+s5.StdName);
		System.out.println("Studenet Roll number="+s5.Roll);
		System.out.println("Studenet  Branch="+s5.Branch);
		System.out.println("Studenet Percentage="+s5.Percentage);
	}

}
