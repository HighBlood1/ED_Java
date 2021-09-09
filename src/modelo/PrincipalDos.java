package modelo;

public class PrincipalDos {

	public static void main(String[] args) {

		String[] ciudades= {"Zitacuaro","Hidalego","Tuxpan","Durango","Morelia","Angangueo"};

		System.out.println(getMenor(ciudades));

	}
	public static String getMenor(String ciudades) {

		String datoMenor=ciudades[0];
		for(int i =1; i<ciudades.length(); i++) {
			if(datoMenor.compareTo(ciudades[i])>0) {
				datoMenor=ciudades[i];
			}
		}

		return null;
	}
	public static String getMayor(String ciudades) {

		String datoMayor=ciudades[0];
		for(int i =1; i<ciudades.length(); i++) {
			if(datoMayor.compareTo(ciudades[i])<0) {
				datoMayor=ciudades[i];
			}
		}

		return null;
	}

}