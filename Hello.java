package JavaGenrics;
class Test<T>{

T obj;

Test(T obj){

this.obj=obj;

}
public T getObject(){

return this.obj;

}

}
class Hello {

    public static void main(String[] args) {

        	Test<Integer> iobj=new Test<Integer>(17);

		System.out.println("Integer:"+iobj.getObject());

		Test<String> sobj=new Test<String>("bridgeLab");

		System.out.println("String:"+sobj.getObject());

	}

}
