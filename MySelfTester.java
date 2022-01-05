class MySelfTester{
        public static void main(String []args){
			MySelf ummi=new MySelf();
			System.out.println(ummi.name+"\t"+ummi.height+"\t"+ummi.number+"\t"+ummi.color+"\t"+ummi.introvert+"\t"+ummi.behaviour);
			MySelf ummi1=new MySelf();
			System.out.println(ummi1.name+"\t"+ummi1.height+"\t"+ummi1.number+"\t"+ummi1.color+"\t"+ummi1.introvert+"\t"+ummi1.behaviour);
			System.out.println("================Nava hanga============");
			MySelf ummi2=new MySelf(987654321,"tiger",true);
			System.out.println(ummi2.number+"\t"+ummi2.name+"\t\t"+ummi2.introvert);
			MySelf ummi3=new MySelf(123456789,"tigerummi",true);
			System.out.println(ummi3.number+"\t"+ummi3.name+"\t"+ummi3.introvert);
			MySelf ummi4=new MySelf(987654321,"tiger",true);
			System.out.println("........................am an itrovert person..............................");
			System.out.println(ummi4.number+"\t"+ummi4.name+"\t"+ummi4.introvert);
			MySelf sumer=new MySelf("umesh",167.5,100100100,"godi banna sadaran maikatu","an introvert");
			System.out.println(sumer.name+"\t"+sumer.height+"\t"+sumer.number+"\t"+sumer.color+"\t"+sumer.behaviour);
			MySelf winter=new MySelf("umesh",168.5,108108108,"godi banna sadaran maikatu","based opposit person");
			System.out.println(winter.name+"\t"+winter.height+"\t"+winter.number+"\t"+winter.color+"\t"+winter.behaviour);
			
		}


}