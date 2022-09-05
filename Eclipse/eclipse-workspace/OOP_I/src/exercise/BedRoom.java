package exercise;
class Room{
	public void print_room() {
	System.out.println("This is a room.");
	}
}

public class BedRoom extends Room {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BedRoom br=new BedRoom();
		br.print_room();
		System.out.println("This room contains a bed");
	}

}
