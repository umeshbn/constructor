class FanTester{
	public static void main(String []args){
     Fan key=new Fan();
	 System.out.println(key.blades+"\t"+key.name+"\t"+key.rmcontrol+"\t"+key.weight);
	   Fan key1=new Fan();
	 System.out.println(key1.blades+"\t"+key1.name+"\t"+key1.rmcontrol+"\t"+key1.weight);
	 System.out.println("//////////////////////");
	  Fan key2=new Fan(3,"havells");
	 System.out.println(key2.blades+"\t"+key2.name);
	  Fan key3=new Fan(4,"bajaj");
	 System.out.println(key3.blades+"\t"+key3.name);
	 System.out.println("//////////////////////");
	   Fan key4=new Fan("bajaj",true,10.9);
	 System.out.println(key4.name+"\t"+key4.rmcontrol+"\t"+key4.weight);
	   Fan key5=new Fan("havells",false,20.8);
	 System.out.println(key5.name+"\t"+key5.rmcontrol+"\t"+key5.weight);
	 
	}
	
}