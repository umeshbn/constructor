class EntertainmentTester{
				public static void main(String []args){
			EntertainmentOperation oper=new EntertainmentOperation();
			Entertainment dto1=new Entertainment("movie",2.30f,true,3);
			Entertainment dto2=new Entertainment("series",8.23f,false,4);
			
			boolean response=oper.add(0,dto1);
			System.out.println(response);
			System.out.println();
			boolean response2=oper.add(1,dto2);
			System.out.println(response2);	
				System.out.println();
				oper.printAll();
			System.out.println("updatetypeByGood");
			oper.updatetypeByGood(false,"movie");
			oper.updatetypeByGood(true,"series");
			oper.printAll();
			
			}

}



