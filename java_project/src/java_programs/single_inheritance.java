package java_programs;
class one{
	public void print_geek()
			{
		System.out.println("geek");
			}
}
class two extends one{
	public void print_for() {System.out.println("for");
}}
public class single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
two g=new two();
g.print_geek();
g.print_for();
g.print_geek();
	}

}
