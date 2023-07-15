Constructor Keywords
********************
1)this.
2)this()
3)super.
4)super()


Points to Remember:-
********************

Inside the constructor we can use eiether this() or super().
  we cannot use both.

Inside the constructor this() or super() anyone should be the frist statment.

Inside the Default Constructor  super() will be wrtitten by the compiler.

Inside the userdefined constructor ,if we are not writing anything then compiler will generate super() keyword.

this. ---> used to refer current class  variable/methods.
             Its used to assign some value to the  variable of the current class.
             Its used to call to the current class methods(). 

super.---->used to refer parent class variable/methods
             Its used to assign value to the parent class variable. 
             Its used to call to the parent class methods().

The below keywords are always related to instance Area(Instance Method/ Instance blocks/constructor)
this.
super.			 

this() ----->Its used to call current class constructor.

super()  ----->Its used to call super class/Parent class constructor.

The below keywords are always used inside the constructor.
this()
super()




1)If we are using in static area(Static Methods/Static Blocks).
we will get CE as
Error:- non-static variable this cannot be referenced from a static context