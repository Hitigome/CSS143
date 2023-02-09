/*2A. The Variable watch window in VSCode is part of the debug console on the left side of the screen. The information it provides is is the current values of the variables that are added to the watchlist.
  2B. The Method Call stack can also be found in the debug console. This is a list of methods that have been called up to the point in your debugging. It includes method name, file name, and line number.
  3A. Moves to the next line while debugging.
  3B. Moves into a function call.
  3C. Moves out of the fuction call.
  3D. Executes the entire program without stopping 
*/
class DebuggingExercise4
{
    public static void main(String[] args){
        Account a = new Account(null);
        a.deposit(100);
        System.out.println(a.getOwner() + " has $" + a.getBalance());
        a.withdraw(200);
        System.out.println("After trying to withdraw $200, " + a.getOwner() + " has $" + a.getBalance());
    }
}