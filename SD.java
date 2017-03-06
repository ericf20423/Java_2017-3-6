
class SD {
	private String name="xxx";
	private String id="01";
	private String gender="male,female";
	public SD(String name1,String id1,String gender1){
	name=name1;
	id=id1;
	gender=gender1;
	}
	public void showdata(){
		System.out.println("學生姓名:"+name);
	}
	public void  iddata(){
		System.out.println("學生id:"+id);
	}
	public void genderdata(){
		System.out.println("學生性別:"+gender);
	}
 		
}

