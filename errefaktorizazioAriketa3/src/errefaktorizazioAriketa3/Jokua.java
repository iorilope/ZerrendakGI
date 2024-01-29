package errefaktorizazioAriketa3;

public class Jokua {

	//Jokalari j jokudata bezela sortzen dugu nertan honen atributoak erabiltzeko
	JokuaData data = new JokuaData();

	public void mugimendua(String m) {
		
		if ("Eskubi".equalsIgnoreCase(m)) {
			data.j.setX(data.j.getX() + 1);
		}
		if ("Ezkerra".equalsIgnoreCase(m)) {
			data.j.setX(data.j.getX() - 1);
		}
		if ("Gora".equalsIgnoreCase(m)) {
			data.j.setY(data.j.getY() - 1);
		}
		if ("Behera".equalsIgnoreCase(m)) {
			data.j.setY(data.j.getY() + 1);
		}
	}

}
