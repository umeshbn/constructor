class AiroplaneTester{
			public static void main(String [] args){
			Airoplane airoplane[]=new Airoplane[2];	
			
	      Airoplane airo=new Airoplane("ummi",100,"red",10.8f);
			  airoplane[0]=airo;
		   Airoplane airo2=new Airoplane("tiger",101,"green",9.8f);  
			airoplane[1]=airo2;
		   for(int index=0;index<airoplane.length;index++){
		System.out.println(airoplane[index].name+"\t"+airoplane[index].seats+"\t"+airoplane[index].color+"\t"+airoplane[index].speed); 

			   
		   }

			}
}