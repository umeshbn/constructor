class SuperHerosMeth{
			SuperHeros sources[]=new SuperHeros[5];
			
			static void printAll(SuperHeros sources[]){
				for(int num=0;num<sources.length;num=num+1){
					if(sources != null){
				System.out.println(sources[num].name+""+sources[num].power+""+sources[num].weight+""+sources[num].email+""+sources[num].number);
					}
			}	
	}
	static void add(String nameof,String powerof,int weightis,String emailof,long numberof,SuperHeros sources1){
		sources1.name=nameof;
		sources1.power=powerof;
		sources1.weight=weightis;
		sources1.email=emailof;
		sources1.number=numberof;	
		System.out.println(sources1.name+""+sources1.power+""+sources1.weight+""+sources1.email+""+sources1.number);
		
	}
	static void updatebyName(String oldname,String newname, SuperHeros sources[]){
		for(int num=0;num<sources.length;num=num+1){
			if(oldname.equals(sources[num])){
			sources[num].name=newname;
			}
		}
		
	}
	static void deleteByName(int num,String mail,SuperHeros sources[]){
				for(int num=0;num<sources.length;num=num+1){
			
			sources[num].email=null;
			}
		}
		
}

