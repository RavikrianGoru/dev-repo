package innerclasses;

interface Etable
{
	void eatVeg();
	void eatN_Veg();
}
public class AnonymousInnerClassOfInterface {

	public static void main(String[] args) 
	{
		Etable obj=new Etable()
		{
			public void eatVeg()
			{
				System.out.println("eatVeg() implementation in InnerClass");
			}
			public void eatN_Veg()
			{
				System.out.println("eatN_Veg() implementation in InnerClass");
			}
			public void eat_ALL()
			{
				System.out.println("eat_ALL() implementation in InnerClass");
			}

		};
		
		System.out.println("AnonymousInnerClassOfInterface name : "+obj.getClass().getName());
		obj.eatN_Veg();
		obj.eatVeg();
		//obj.eat_ALL();// C.T Error

	}

}
