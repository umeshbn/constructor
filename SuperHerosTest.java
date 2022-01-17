class SuperHerosTest{

             public static void main(String[] args){
			   
			   SuperHeros sources[]=new SuperHeros[5];
			   SuperHeros obj=new SuperHeros("ironman","technology",65,"ironman",8527416399l);
			   SuperHeros obj1=new SuperHeros("krish","multipowers",70,"krish@qwe",852741636l);
			   SuperHeros obj2=new SuperHeros("shaktiman","tomuch",74,"shaktiman",852741636l);
			   SuperHeros obj3=new SuperHeros("thor","hammer",77,"thor@qwer",852741636l);
			   
			   SuperHeros obj4=new SuperHeros("","",0,"",0);
			   
			   sources[0]=obj;
			   sources[1]=obj1;
			   sources[2]=obj2;
			   sources[3]=obj3;
			   sources[4]=obj4;
			   
			   
			 SuperHerosMeth.printAll(sources);
			 SuperHerosMeth.add("ummi","good vibes",59,"qwertyui@asdf",147258369,obj4);
			 SuperHerosMeth.printAll(sources);
			 System.out.println();
			 
			 SuperHerosMeth.updatebyName("thor","hritik",sources);
			 
			  
			 SuperHerosMeth.deleteByName(2,"krish@qwe",sources);
			 SuperHerosMeth.printAll(sources);
			 
			 
			 }

}
