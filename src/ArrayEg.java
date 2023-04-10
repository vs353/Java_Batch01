import static java.lang.Math.*;

class Employee1{

	private int eid;
	private String ename;
	
	public Employee1()
	{
		System.out.println("Default constr");
	}
	public Employee1(int eid, String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	

}

class ArrayEg
{
	public static void main(String[] args)
  	{
		int[] arr = new int[3];
		arr[0]=1;
		arr[1]=2;	
		arr[2]=3;

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

		for(int i : arr)
		{
			System.out.println(i);
		}

		Employee1 e1 = new Employee1(100,"salo");
		Employee1 e2 = new Employee1();
		e2.setEname("issac");

		Employee1[] empArr = new Employee1[2];
		
		empArr[0]=e1;
		empArr[1]=e2;

		for(Employee1 i : empArr)
		{
		System.out.println(i);
		}
		System.out.println(PI);

	}

}

















