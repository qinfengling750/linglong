package day1;

public class Cell {
	int row;
	int col;
	


public Cell(int i, int j) {
	i=2;
	j=5;
}
void drop(){
	col--;
}
void moveLeft(){
	row++;
}
void drop(int n){
	col-=n;
}
void moveLeft(int n){
	row+=n;
}
String getInfo(){
	return row+","+col;
}
}
