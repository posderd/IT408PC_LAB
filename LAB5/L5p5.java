import java.io.*;

class L5p5{
	public static void main(String[] args) throws IOException{
		File f = new File("Life_Is_A_Journey_Enjoy_The_Flight.txt");
		if(f.exists()){
			System.out.println("exists");
		}else{
			f.createNewFile();
			System.out.println("exists  "+f.exists());
		}
	}
}
