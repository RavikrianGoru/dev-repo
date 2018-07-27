package ds;


public class _1_TowersHanoi {
	
	public static void doTowerAndHanoi(int n,String from,String aux,String to)
	{
			
		if(n>1)
		{
			doTowerAndHanoi(n-1,from,to,aux);						//moving top(n-1) disks from 'start' to 'inter'.
			System.out.println("Move "+n+" from "+from+" to "+to);	//moving last disk from 'start' to 'end'
			doTowerAndHanoi(n-1,aux,from,to);						//moving top(n-1) diska from 'inter' to 'end' 
		
		}
		if(n==1)
		{
			System.out.println("Move "+n+" from "+from+" to "+to);
		}
	}

	public static void main(String[] args) {

		System.out.println("Towers of Hanoi...... Problem");
		/*
		|				|					|
		1				|					|
		|				|					|
		2				|					|
		|				|					|
		3				|					|
	---------     -------------		   ------------
	Tower:A			Tower:B				Tower:C
	

Step1: Move top(n-1) disks from Tower:A to Tower:B
		|				|				|
		|				|				|
		|				|				|
		|				|				|
		|				1				|
		3				2				|
	---------     -------------		   ------------
	Tower:A			Tower:B				Tower:C
		

Step2: Move last disk from Tower:A to Tower:C	
		|				|				|
		|				|				|
		|				|				|
		|				|				|
		|				1				|
		|				2				3
	---------     -------------		   ------------
	Tower:A			Tower:B				Tower:C
		
Step3:Move top(n-1) disks from Tower:B to Tower:C
		|				|				|
		|				|				|
		|				|				|
		|				|				1
		|				|				2
		|				|				3
	---------     -------------		   ------------
	Tower:A			Tower:B				Tower:C
		
		
		
	
	*/
		doTowerAndHanoi(3,"Tower:A","Tower:B","Tower:C");	
		
	}

}
