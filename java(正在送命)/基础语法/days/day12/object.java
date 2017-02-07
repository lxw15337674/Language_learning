package day12;

class Person{
	int id;
	String name;
	public Person(int id,String name){
		this.id = id;
		this.name = name;
	}
	public Person(){
	}
	
	public String toString(){
		return "编号:" + this.id + "姓名:"+this.name;
	}
	
	public boolean equals(Object obj) { 
		Person p  = (Person)obj;
		return this.id== p.id;
	}
	
	public int hashCode() {
		return  this.id;
	}
}


public class object {
	public static void main(String[] args) {
		System.out.println("Eclipse");
		Person p = new Person(110,"李希望");
		System.out.println(p);
		Person p1 = new Person(110,"狗娃");
		Person p2 = new Person(110,"陈富贵");
		//需求：在现实生活中只要两个人的身份证一致，那么就是同一个人。
		System.out.println("p1与p2是同一个对象吗？"+ p1.equals(p2));
		
		System.out.println("p1哈希码:"+ p1.hashCode());
		System.out.println("p2哈希码:"+ p2.hashCode());
	}
	
}
