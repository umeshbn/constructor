class Adidas{
     int price;
	 String name;
	 String color;
	 double size;
	 char quality;
	 Adidas(){
	 System.out.print("calling empty constructor");
	 }
	 Adidas(int prices,String namez){
		 price=prices;
		 name=namez;
		
	 }
	 Adidas(int money,String nam,String coulor,double sizeof,char qualityof){
		 price=money;
		 name=nam;
		 color=coulor;
		 size=sizeof;
		 quality=qualityof;
		 
	 }
}
