package USACO;

public class Input {
	int day;
    int name;
    int change;
    public Input(int day1, int name1, int change1){
        change = change1;
        name = name1;
        day = day1;
    } 
    
    public int day(){
        return day;
    }
    
    public int change(){
        return change;
    }
    
    public int name(){
        return name;
    }
}
