package javaReferesher;


import java.util.ArrayList;

public class stack {
private int maxsize;
private int[] stackArray;
private int top;
public stack(int s){
	maxsize = s;
	stackArray = new int[maxsize];
	top = -1;
}
public void push(int i){
	stackArray[++top] = i;
}
public int pop(){
	return stackArray[top--];
}
public int top(){
	return top;
}
public boolean isEmpty(){
	return (top == -1);
}
public boolean isFull() {
	return (top == maxsize - 1);
}
}

class StockSpan {
public static void main(String[] args){
	ArrayList<Integer> stockPriceList = new ArrayList<Integer>();
	stockPriceList.add(100);
	stockPriceList.add(60);
	stockPriceList.add(70);
	stockPriceList.add(65);
	stockPriceList.add(80);
	stockPriceList.add(85);
	
	ArrayList<Integer> stockSpanList = getStockSpan(stockPriceList);
	for(int i = 0 ; i < stockSpanList.size() ; i++){
		System.out.println("stock span list is " +stockSpanList.get(i));
	}
}
static ArrayList<Integer> getStockSpan(ArrayList<Integer> stockPriceList){
	ArrayList<Integer> stockSpanList = new ArrayList<Integer>();
	stockSpanList.add(0, 1);
	stack s = new stack(10);
	s.push(0);
	
	for(int i=1 ; i< stockPriceList.size() ; i++){
		while(!s.isEmpty() && stockPriceList.get(s.top()) <  stockPriceList.get(i)){
			s.pop();
		}
		stockSpanList.add(i, i-s.top());
		s.push(i);
	}
	return stockSpanList;
	
}
	
	
}