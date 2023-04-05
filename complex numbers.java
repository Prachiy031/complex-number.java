package complex;

import java.util.Scanner;

class cmp{

public static void main(String[] args) {

int ch,y;

float num1,num2;

Complex_op cal = new Complex_op();

Scanner input = new Scanner(System.in);

do

{

System.out.println("Enter 1st number:");

num1 = input.nextFloat(); //Real part

num2 = input.nextFloat(); //imaginary part

Complex_op Object1 = new Complex_op(num1,num2); //object of class Complex_op is Object1

System.out.println("Enter 2nd number:");

num1 = input.nextFloat(); //Real part

num2 = input.nextFloat(); //imaginary part

Complex_op Object2 = new Complex_op(num1,num2); //object of class Complex_op is Object1

System.out.println("Enter operation below:\n1.Addition 2.Substraction 3.Multiplication 4.Division\n");

ch = input.nextInt();

switch(ch)

{

case 1:

cal.AddNumbers(Object1, Object2);

break;

case 2:

cal.SubNumbers(Object1, Object2);

break;

case 3:

cal.MulNumbers(Object1, Object2);

break;

case 4:

cal.DivNumbers(Object1, Object2);

break;

}

System.out.println("Do you want to continue?\n");

y = input.nextInt();

}

while(y==1);

}

}

class Complex_op //class for operation of addition of complex numbers

{

//data members

float real,imag;

//constructor

Complex_op() //default constructor //constructor get automatically run everytime

{

real = 0;

imag = 0;

}

Complex_op(float comp1,float comp2) //parameterised constructor

{

real = comp1;

imag = comp2;

}

public void AddNumbers(Complex_op c1,Complex_op c2)

{

float real,imag;

real =(c1.real+c2.real);

imag = (c1.imag+c2.imag);

System.out.println("real part is :"+real);

System.out.println("Imaginary part is :"+imag+"i");

}

public void SubNumbers(Complex_op c1,Complex_op c2)

{

float real,imag;

real = (c1.real - c2.real);

imag = (c1.imag - c2.imag);

System.out.println("real part is :"+real);

System.out.println("Imaginary part is :"+imag+"i");

}

public void MulNumbers(Complex_op c1,Complex_op c2)

{

float real,imag;

real= (c1.real*c2.real);

imag = (c1.real*c2.real);

System.out.println("real part is :"+real);

System.out.println("Imaginary part is :"+imag*(-1)+"i");

}

public void DivNumbers(Complex_op c1,Complex_op c2)

{

float real,imag;

real = (c1.real*c2.real + c1.imag* c2.imag)/(c1.real*c1.real+c2.imag*c2.imag);

imag = (c1.imag*c2.real - c1.real*c2.imag)/(c1.real*c1.real+c2.imag*c2.imag);

System.out.println("real part is :"+real);

System.out.println("Imaginary part is :"+(-1)*imag+"i");

}

}

/*

* a+bi / m+ni = {(a+bi)(m-ni)} / {(m+ni)(m-ni)}

= {am – ani + mbi – bni2 } / (m2 + n2)

= {am – ani + mbi – bn (-1)} / (m2 + n2)

= {am – ani + mbi +bn} / (m2 + n2)

= {(am + bn) + (mb – an)i} / (m2+n2)

= {(am + bn) / (m2 +n2)} + {(mb-an)/ (m2 +n2)} i


*/
