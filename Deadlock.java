class A{
  synchronized void methodA(B b){
	int count = 800000;
	while(count-- > 0);
	b.last();
  }

  synchronized void last(){
  System.out.println("Inside A.last() ");
 }}

class B{
  synchronized void methodB(A a){
	int count =80000;
	while(count-- > 0);
	a.last();
  }

  synchronized void last(){
  System.out.println("Inside B.last() ");
  }}


public class Deadlock implements Runnable{
  A a = new A();
  B b = new B();

  public Deadlock(){
	Thread t = new Thread(this);
	t.start();
	a.methodA(b);
}

public void run(){
	b.methodB(a);
}

public static void main(String[] args)
{
   new Deadlock();
}

}



