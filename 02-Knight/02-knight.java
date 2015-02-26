import java.io.*;
import java.util.*;

class Knights {
    private int[][] board;
    private int moves;
    private int count = 1;
    private boolean solved = false;
    private void delay(int n){
	try{
	    Thread.sleep(n);
	}
	catch (Exception e){};
    }
    public Knights(int x)
   {
	board = new int[x][x];
	moves = x*x;
    }

    public String toString(){
	String ret = "";
	for(int row = 0; row < board.length; row++){
	    for(int col = 0; col < board[row].length; col++){
		if(board[row][col] <10){
		    ret = ret + board[row][col] + "  ";
		}
		else{
		    ret = ret + board[row][col] + " ";
		}
	    } 
	    ret = ret + "\n";
	}
	return ret;
    }


    public void solve(int x, int y) {
	if(!solved){
		if (board[x][y] == 0) {
		    board[x][y]= count++;
		    if (board[x][y] == moves){
			solved = true;
			delay(100);
			System.out.println(this);
			return;
		    }
		    solve(x+2, y+1);
		    if(!solved)
			solve(x+2, y-1);
		    if(!solved)
			solve(x-2, y+1);
		    if(!solved)
			solve(x-2, y-1);
		    if(!solved)
			solve(x+1, y+2);
		    if(!solved)
			solve(x+1, y-2);
		    if(!solved)
			solve(x-1, y+2);
		    if(!solved)
			solve(x-1, y-2);
		    board[x][y] = 0 ;
		    count--;
		}
	}
	}}
