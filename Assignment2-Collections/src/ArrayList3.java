import java.util.ArrayList;
import java.util.Iterator;

class Student{
	
	int rollno;
	String name;
	int age;
	Student(int rollno,String name, int age){
		
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		
	}
}
public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1= new Student(101,"Sweta",66);


//Creating array list
ArrayList<Student> al=new ArrayList<Student>();
al.add(s1);//adding student class object


//Getting Iterator
Iterator itr = al.iterator();


//Travesing elements of ArrayList objects

while(itr.hasNext()){
	Student st= (Student)itr.next();
	System.out.println(st.rollno+"  "+st.name+" "+st.age);
}
	}

}
