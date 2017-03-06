
public class TH {

		private String name = "XXX";
		private String sex = "male";
		private String area = "Taiwan";
		
		public TH(String named,String sexd,String aread){
			name = named;
			sex = sexd;	
			area = aread;
		}
		
		public void showdata(){
			System.out.println("老師姓名:"+name+" 性別:"+sex);
		}
		
		public void teachme(){
			System.out.println("我很忙");
		}
		
		public void wherecome(){
			System.out.println("這老師是"+area+"人");
		}
}
  
   

