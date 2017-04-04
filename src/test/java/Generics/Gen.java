package Generics;
//T is the type parameter that will be replaced with the real type whgen an object is created
public class Gen<T> {
	T ob;
	Gen(T o)
	{
	ob =o;	
	}
	T getob()
	{
	return ob;	
	}
	void showType(){
		System.out.println("Type of t"+ob.getClass().getName());
	}
}
