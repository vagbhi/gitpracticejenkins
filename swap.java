public class swap{
public static void main(String args[]){
int a=2,b=3;
System.out.println("a: "+a+" and b: "+b+" before swap");
a=a^b;
b=a^b;
a=a^b;
System.out.println("a: "+a+" and b: "+b+" after swap");
}}
