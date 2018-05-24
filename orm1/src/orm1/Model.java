package orm1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Model {
		
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Model(String adi, String soyadi, int no) {
		super();
		this.adi = adi;
		this.soyadi = soyadi;
		this.no = no;
	}
	private String adi;
		private String soyadi;
		@Id
		 int no;
		public String getAdi() {
			return adi;
		}
		public void setAdi(String adi) {
			this.adi = adi;
		}
		public String getSoyadi() {
			return soyadi;
		}
		public void setSoyadi(String soyadi) {
			this.soyadi = soyadi;
		}
		public int getYasi() {
			return no;
		}
		public void setYasi(int yasi) {
			this.no = yasi;
		}
		@Override
		public String toString() {
			return "Model [adi=" + adi + ", soyadi=" + soyadi + ", no=" + no + "]";
		}
		
}
