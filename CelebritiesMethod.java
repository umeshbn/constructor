class CelebritiesMethod{
      
	static void printAll(Celebrities objects[]){
		
		for(int i=0; i<5;i++){
			
			System.out.println(objects[i].name+"\t"+objects[i].age+"\t"+ objects[i].salary+"\t"+ objects[i].location+"\t"+objects[i].movie);
		}
		
	}
	
	static void add(String nm , int ag, long sala, String loca, String mov, Celebrities objects1){
		objects1.name = nm;
		objects1.age = ag;
		objects1.salary = sala;
		objects1.location = loca;
		objects1.movie = mov;
		
		System.out.print(objects1.name+"\t"+objects1.age+"\t"+ objects1.salary+"\t"+ objects1.location+"\t"+objects1.movie);
		System.out.println();
		System.out.println("*************************************************************************");
	}

}