public class calculator{
public static void main(String args[]){
char op='/';
double r,a=3,b=2;
switch(op){
case '+':
r=a+b;
break;
case '-':
r=a-b;
break;
case '*':
r=a*b;
break;
case '/':
r=a/b;
break;
default:
System.out.println("Wrong operator");
return;
}System.out.println(a + " " + op + " " + b + " = " +r);
}}