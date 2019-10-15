package com.sample;

public class Mobilni {
	
	// konstante - imena slika
	public static final String bootloop = "/bootloop.jpg";
	public static final String sd = "/sd-slot.jpg";
	public static final String speaker = "/speaker.jpg";
	public static final String flatCable = "/flat-cable.jpg";
	public static final String charging = "/charging.jpg";
	public static final String digitizer = "/digitizer.jpg";
	public static final String battery = "/battery.jpg";
	
	// polja
	private String ukljucujeSe = "nepoznato";
	private String restartujeSe = "nepoznato";
	private String reprodukujeZvuk = "nepoznato";
	private String radiEkran = "nepoznato";
	private String puniSe = "nepoznato";
	private String detektujeSDkarticu = "nepoznato";
	private String reagujeNaDodir = "nepoznato";
	
	private String uzrokProblema = "nepoznato";
	private String resenje = "nepoznato";
	
	public String getUkljucujeSe() {
		return ukljucujeSe;
	}

	public void setUkljucujeSe(String ukljucujeSe) {
		this.ukljucujeSe = ukljucujeSe;
	}

	public String getRestartujeSe() {
		return restartujeSe;
	}

	public void setRestartujeSe(String restartujeSe) {
		this.restartujeSe = restartujeSe;
	}

	public String getReprodukujeZvuk() {
		return reprodukujeZvuk;
	}

	public void setReprodukujeZvuk(String reprodukujeZvuk) {
		this.reprodukujeZvuk = reprodukujeZvuk;
	}

	public String getRadiEkran() {
		return radiEkran;
	}

	public void setRadiEkran(String radiEkran) {
		this.radiEkran = radiEkran;
	}

	public String getPuniSe() {
		return puniSe;
	}

	public void setPuniSe(String puniSe) {
		this.puniSe = puniSe;
	}

	public String getDetektujeSDkarticu() {
		return detektujeSDkarticu;
	}

	public void setDetektujeSDkarticu(String detektujeSDkarticu) {
		this.detektujeSDkarticu = detektujeSDkarticu;
	}

	public String getReagujeNaDodir() {
		return reagujeNaDodir;
	}

	public void setReagujeNaDodir(String reagujeNaDodir) {
		this.reagujeNaDodir = reagujeNaDodir;
	}

	public String getUzrokProblema() {
		return uzrokProblema;
	}

	public void setUzrokProblema(String uzrokProblema) {
		this.uzrokProblema = uzrokProblema;
	}

	public String getResenje() {
		return resenje;
	}

	public void setResenje(String resenje) {
		this.resenje = resenje;
	}

	public String toString(){
	 return "Uzrok problema: "+uzrokProblema+"\nResenje:\n"+resenje;
	}

}
