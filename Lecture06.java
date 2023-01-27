Sadman Sakib Hassan

class Lecture06 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 06");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // Put your answer for #1 here:

        //Recursion and iteration are two essential computer science techniques used in designing algorithms and applications. In plain English, a recursive function is one that calls itself again to repeat the code, whereas an iterative function loops to repeat some section of the code. The set of instructions is continually carried out using both recursion and iteration. Recursion occurs when a statement within a function repeatedly invokes itself. A loop iterates whenever it runs repeatedly until the controlling condition fails.

        // Put your answer for #2 here:

        //Recursive functions are ones that make calls to themselves. The base case and the recursive case are its two main components. The prerequisite for stopping the recursion is the base case. When a function calls on itself, it is said to be in a recursive situation. The basic case of a suitable recursive function must always exist: A method of returning without performing a recursive call is the basic case. In other words, it is the mechanism that puts an end to this cycle of recursive calls that keep becoming bigger and bigger as a stack of function calls waits for other function calls to return. A stackoverflow exception error happens if a recursive procedure does not have a base case that is required to satisfy the end of condition.

        // Put your answer for #3 here:

// All Alnswers for 3:

public class Test {

public static void mystery1(int n){

if(n <= 1){

System.out.print(n);

}else{

mystery1(n/2);

System.out.print(", "+n);

}

}

public static void main(String args[])

{

mystery1(1); // 1

System.out.println();

mystery1(4); // 1, 2, 4

System.out.println();

mystery1(16); // 1, 2, 4, 8, 16

System.out.println();

mystery1(30); // 1, 3, 7, 15, 30

System.out.println();

mystery1(100); // 1, 3, 6, 12, 25, 50, 100

System.out.println();

}

}

//Output:

1

1, 2, 4

1, 2, 4, 8, 16

1, 3, 7, 15, 30

1, 3, 6, 12, 25, 50, 100



        // Put your answer for #5 here:

        //Answer: public class Test {

public static void mystery3(int n){

if(n <= 0){

System.out.print("*");

}else if(n%2==0){

System.out.print("(");

mystery3(n-1);

System.out.print(")");

}else{

System.out.print("[");

mystery3(n-1);

System.out.print("]");

}

}

public static void main(String args[])

{

mystery3(0);

System.out.println();

mystery3(1);

System.out.println();

mystery3(2);

System.out.println();

mystery3(4);

System.out.println();

mystery3(5);

}

}



//Output:

*

[*]

([*])

([([*])])

[([([*])])]
        

        // Put your answer for #6 here:


        //Part 6 Answer:

        mystertXY(4,1) will print 4

mystertXY(4,2) will print 8, 4, 8

mystertXY(8,2) will print 16, 8, 16

mystertXY(4,3) will print 12, 8, 4, 8, 12

mystertXY(3,4) will print 12, 9, 6, 3, 6, 9, 12


       

    }
}
