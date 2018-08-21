package dto;

public class KakeiboDto {
	private int syunyu;
	private int shisyutsu;
	private String riyoubi;

	public KakeiboDto() {

	}

	public KakeiboDto(int syunyu, int shisyutsu,String riyoubi){
		this.syunyu = syunyu;
		this.shisyutsu = shisyutsu;
		this.riyoubi = riyoubi;
			}

	public int getSyunyu() {
		return syunyu;
	}
	public void setSyunyu(int syunyu) {
		this.syunyu = syunyu;
	}
	public int getShisyutsu() {
		return shisyutsu;
	}
	public void setShisyutsu(int shisyutsu) {
		this.shisyutsu = shisyutsu;
	}
	public String getRiyoubi() {
		return riyoubi;
	}
	public void setRiyoubi(String riyoubi) {
		this.riyoubi = riyoubi;
	}
}
