class Dominos{
         static String[] vegPizzas={"margherita","Double cheese margherita","farm house","cheese n corn",null};
		  public static void main(String []args){
			  int []price={200,300,400,500};
		 for(int index=0;index<vegPizzas.length;index=index+1){
		      System.out.println(vegPizzas[index]);
			   }
			  for(int num=0;num<price.length;num++){
				  System.out.println(price[num]);
				   }
				  if(price==null){
					  System.out.println("array is empty");
				  }else{
					  System.out.println("its not null");
				  }
				  System.out.println();
				  String obj=new Dominos().printAll();
				   System.out.println(obj);
				   
				     String add=new Dominos().addName(4,"sweet corn");
					 System.out.println(add); 
					 String object1=new Dominos().printAll();
				   System.out.println(object1);
				   System.out.println("===================================");
					 
					System.out.println("updateNames");
				  String update=new Dominos().updateNames("margherita","vegPizzas");
				   System.out.println(update);
				   String sum=new Dominos().printAll();
				   System.out.println(sum);
				   
				    String update1=new Dominos().updateByIndex(2,"sub kuch achha hai");
				    System.out.println(update1);
					 String sum2=new Dominos().printAll();
				      System.out.println(sum2);
					  
					   String sizeOf=new Dominos().sizeOfArray(2,"sub kuch achha hai");
				    System.out.println(update1);
				   
				  
					 
				  }
		 String printAll(){
			for(int index=0;index<vegPizzas.length;index++){
				System.out.println(vegPizzas[index]);
			}
			 return "";
		 }
		String addName(int index,String name){
		    
				vegPizzas[index]=name;
				return "";
				
		}
			 String updateNames(String oldname,String newname){
				for(int numb=0;numb<vegPizzas.length;numb++){
					
				if(oldname.equals(vegPizzas[numb])){
					vegPizzas[numb]=newname;
				}
				
				
				}
				return "";
				}   
				
				String updateByIndex(int index,String name){
					vegPizzas[index]=name;
									return "";

					
			   
			}	
				String sizeOfArray(){
					int vegPizzas[]=new int vegPizzas();
					System.out.println("size of array:"+""+vegPizzas.length)
					return "";
				}			
}
