package day1;

public class Typecasting {

	public static void main(String[] args) {
		
byte b =10;
int i =b;
System.out.println(i);

float f=23.45f;
double d=f;
System.out.println(d);

char ch='c';
int i1 =ch;
System.out.println(i1);

char var1='\u00A7';
int i2=var1;
System.out.println(i2);

double f1 = 10.52f;
long l = (long) f1;
System.out.println(l);

long l1 = 923372036854775806l;
int i3 = (int) l1;
System.out.println(i3);

float f2 = 34.56f;
int i4 = (int) f2;
System.out.println(i4);

byte b1 = 90;
char ch1 = (char) b1;
System.out.println(ch1);
	}

}
