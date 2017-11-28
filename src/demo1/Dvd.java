package demo1;

public class Dvd {
	public int getDvdId() {
		return dvdId;
	}
	public void setDvdId(int dvdId) {
		this.dvdId = dvdId;
	}
	public String getDvdName() {
		return dvdName;
	}
	public void setDvdName(String dvdName) {
		this.dvdName = dvdName;
	}
	private int dvdId;
	private String dvdName;
	@Override
	public String toString() {
		return "Dvd [±àºÅ=" + dvdId + ", Ãû×Ö=" + dvdName + "]";
	}
	public Dvd() {
		super();
	}
	public Dvd(int dvdId, String dvdName) {
		super();
		this.dvdId = dvdId;
		this.dvdName = dvdName;
	}

}
