class CelebritiesTest{

			public static void main(String []args){
			
			Celebrities object[]=new Celebrities[5];
			Celebrities obj = new Celebrities("tiger shrof",29,30000l,"mumbai","baagi 2");
			Celebrities obj1 = new Celebrities("hritik roshan",49,40000,"mumbai","bang bang");
			Celebrities obj2 = new Celebrities("yash",35,500000,"banglore","kgf chapter1");
			Celebrities obj3 = new Celebrities("punith raj sir",45,600000,"banglore","yuvratna");
			Celebrities obj4= new Celebrities("daali danajay",33,700000,"mandya","badav rascal");
			object[0]=obj;
			object[1]=obj1;
			object[2]=obj2;
			object[3]=obj3;
			object[4]=obj4;
			Celebrities obj5=new Celebrities(" ", 0, 0, "", " ");
			
			System.out.println("Main method started");
		    System.out.println("***********************************************************************");
		  CelebritiesMethod.printAll(object);
		
			
			}
			
			
}