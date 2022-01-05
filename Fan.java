class Fan{
   int blades;
   String name;
   boolean rmcontrol;
   double weight;
  
		Fan(){
   
			System.out.println("fan features");
   
		}
		Fan(int bladeof,String nameof){
			blades=bladeof;
			name=nameof;
			
		}
		Fan(String naam,boolean control,double weightoff){
			name=naam;
			rmcontrol=control;
			weight=weightoff;
		}
}