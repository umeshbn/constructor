class AdidasTester{
			public static void main(String []args){
				
				Adidas adi=new Adidas();
				System.out.println(adi.price+"\t"+adi.name+"\t"+adi.color+"\t"+adi.size+"\t"+adi.quality);
				Adidas adi2=new Adidas();
				System.out.println(adi2.price+"\t"+adi2.name+"\t"+adi2.color+"\t"+adi2.size+"\t"+adi2.quality);
			      Adidas adi1=new Adidas(1000,"shirt");
				  System.out.println(adi1.price+"\t\t"+adi1.name);
				   Adidas adi3=new Adidas(999,"pant");
				  System.out.println(adi3.price+"\t\t"+adi3.name);
				  Adidas adi5=new Adidas(699,"sneakers","balck",8,'A');
				System.out.println(adi5.price+"\t\t"+adi5.name+"\t\t"+adi5.color+"\t\t"+adi5.size+"\t\t"+adi5.quality);
				 Adidas adi6=new Adidas(799,"loafers","orange",7,'B');
				System.out.println( adi6.price+"\t\t"+adi6.name+"\t\t"+adi6.color+" \t\t"+adi6.size+" \t\t"+adi6.quality);
			}
			
}
